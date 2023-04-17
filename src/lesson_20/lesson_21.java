package lesson_20;
import java.util.*;

public class lesson_21 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); //  создание объекта ArrayList
        list1.add(15);                     //  имя_переменной.add
        list1.add(10);                     //  добавляет в ArrayList значение в скобках через запятую
        list1.add('q');                    //  output: [15, ok, 10, q]
        list1.add("ok");                   //  в данном случае добавились все переменные
        //System.out.println(list1);       //  всех типов данных. Так можно, но обычно не делают
        //  Лучше присвоить ArrayList определённый тип данных
        //  как int, String, boolean и тд


        // СОЗДАНИЕ объекта ArrayList с определенным типом данных:
        // ArrayList <DataType> list1 = new ArrayList <DataType>();
        // НО, можно записать и так:
        // ArrayList <DataType> list1 = new ArrayList <>();
        // то есть можно не указывать второй раз ТИП ДАННЫХ.


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("листочек номер 2");

        List<StringBuilder> list3 = new ArrayList<>(); // Также можно писать просто List вместо ArrayList
        list3.add(new StringBuilder("ya s'el deda"));   // но нужна библиотека import java.util.List;
        //System.out.println(list3);

        ArrayList<String> list4 = new ArrayList<>(30); // 30 - это количество мест для элементов
        // по умолчанию там число - 10.
        // но можно самому указать размер больше,
        // а можно и не указывать, ведь при заполнении Листа
        // он сам автоматически увеличивает свой Capasity

        ArrayList<String> list5 = new ArrayList<>(list2);   // также в скобках можно указывать другой List
        //System.out.println(list5);                         // тем самым создавая новый объект с параметром
        // другого Листа (ссылки на объекты будут разные)


        // МЕТОДЫ ArrayList (｡◕‿‿◕｡)

// (☞ﾟヮﾟ)☞ add(элемент)
// (☞ﾟヮﾟ)☞ add(int индекс, элемент)
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(0);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        //System.out.println(l1);  // output: [0, 1, 2, 3, 4, 5]
        l1.add(0, 777);
        //System.out.println(l1);  // output: [777, 0, 1, 2, 3, 4, 5]
        // в общем add добавляет элементы в конец по дефолту
        // или в определённый индекс, если его указать

// (☞ﾟヮﾟ)☞ get(индекс)
        int add_element;
        add_element = l1.get(3);         // get показывает элемент в ArrayList на его индексе
        //System.out.println(add_element); // output: 2 ( потому что 2 - это третий элемент ArrayList в данном случае

// (☞ﾟヮﾟ)☞ set(идекс, элемент)
        l1.set(0, 666);                  // set заменяет в определённом индексе элемент на другой
        //System.out.println(l1);          // можно сказать перезаписывает

        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("poka");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        //System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!!!");
        }
        // System.out.println(list);

// (☞ﾟヮﾟ)☞ remove (объекты элементов)
// (☞ﾟヮﾟ)☞ remove (индекс)
        list.remove(2);         // полностью удаляет элемент на заданном индексе
        //System.out.println(list);

        list.remove(sb1);             // имба
        //System.out.println(list);

        ArrayList<String> str_string = new ArrayList<>();
        str_string.add("1");
        str_string.add("2");
        str_string.add("3");
        //System.out.println(str_string);
        str_string.remove("2");
        //System.out.println(str_string);

// (☞ﾟヮﾟ)☞ addAll(List) добавляет в Листы другие Листы
// (☞ﾟヮﾟ)☞ addAll(индекс, List)

        ArrayList<String> str2_string = new ArrayList<>();
        str2_string.addAll(str_string);  // добавил в пустой Лист объекты другого Листа
        //System.out.println(str2_string); // не стоит забывать, что мы можем добавить только те элементы,
        // которые соответствуют типу данных самого Листа

        str2_string.addAll(1, str_string); // добавил лист в определённый индекс другого листа
        // System.out.println(str2_string);         // элемент, который стоял на том индексе сдвинулся влево

        str_string.set(0, "9");           // тут я заменил элемент в одном листе, что не повлияло на
        // System.out.println(str_string);   //  на элементы другого листа, в который я копировал этот лист
        //  System.out.println(str2_string);  // получается, set создаёт новый объект в индексе элемента

        ArrayList<StringBuilder> sb_list1 = new ArrayList<>();
        StringBuilder sb4 = new StringBuilder("4");
        StringBuilder sb5 = new StringBuilder("5");
        StringBuilder sb6 = new StringBuilder("6");
        sb_list1.add(sb4);
        sb_list1.add(sb5);
        sb_list1.add(sb6);

        ArrayList<StringBuilder> sb_list2 = new ArrayList<>();
        StringBuilder sb7 = new StringBuilder("7");
        StringBuilder sb8 = new StringBuilder("8");
        sb_list2.add(sb7);
        sb_list2.add(sb8);


        sb_list1.addAll(sb_list2);
        sb_list2.get(1).append("!"); // тут мы отредактировали сам объект в Листе, который ранее присвоили
/*                                                  // другому Листу, поэтому данный объект отредачился
        for (StringBuilder sb : sb_list1) {         // у всех Листов, ведь мы не заменяли элемент другим
            System.out.print(sb + " ");             // объектом
        }

        System.out.println();

        for (StringBuilder sb : sb_list2) {
            System.out.print(sb + " ");

        }
*/
// (☞ﾟヮﾟ)☞ clear() очищает ArrayList
            sb_list2.clear();               // тут я очистил Лист, то есть удалил ссылки на объекты,
         // System.out.println(sb_list1);   // на которые ссылался данный Лист, поэтому присвоенные объекты
         // System.out.println(sb_list2);   // из этого Листа в другой Лист остались

        // (☞ﾟヮﾟ)☞ indexOf(element)  // работает, как поиск, если нашёл элемент - возвращает его индекс
        ArrayList <String> str_list = new ArrayList<>(); // но стоит учитывать, если будет ещё один
        str_list.add("Harry");                           // точно такой же элемент, метод выдаст только индекс
        str_list.add("Potter");                          // первого элемента
        str_list.add("Potter");
        str_list.add("Harry");
        int index1 = str_list.indexOf("Harry");
        int index2 = str_list.indexOf("Potter");
       // System.out.println(str_list);                    // как и положено indexOf вернул int значение
       // System.out.println(index1 + " " + index2);       // первого элемента, который удовлетворил запросу

// (☞ﾟヮﾟ)☞ lastIndexOf(элемент)  // работает как и indexOf, только ищет номера элементов
                                          // которые удовлетворяют поисковому запросу
                                          // с конца Листа
        int index3 = str_list.lastIndexOf("Harry");  // !!!ВАЖНО!!!
        int index4 = str_list.lastIndexOf("Potter"); // если indexOf и lastIndexOf не нашли поисковый запрос
        //System.out.println(index3 + " " + index4);      // то на выходе будет int значение -1
                                                        // а не индекс найденного элемента

// (☞ﾟヮﾟ)☞ size()   // работает как lengt, показывает количество элементов в Листе
        int index5 = str_list.size();
        //System.out.println(index5);
        String qwerty = "123456";
        //System.out.println(qwerty.length());

// (☞ﾟヮﾟ)☞ isEmpty()  // показывает пустой ли ArrayList, если пусто, то true
                       // если элементы есть, то false
        boolean b1 = str_list.isEmpty();
        boolean b2 = sb_list2.isEmpty();
       // System.out.println(b1); // false
       // System.out.println(b2); // true

// (☞ﾟヮﾟ)☞ contains(элемент)  // булевый метод, показывающий есть ли конкретный элемент в данном Листе
        boolean b3 = str_list.contains("Harry");
        boolean b4 = str_list.contains("Harry Potter");
        //System.out.println(b3); // true
        //System.out.println(b4); // false

// (☞ﾟヮﾟ)☞ toString() // тут чел говорит, что благодаря этому методу можно в строку Лист вывести
                       // и так будет работать  System.out.println
                       // но дело в том, что он и так работает, поэтому хз

        //System.out.println(str_list.toString()); // в общем ничего не изменилось на выводе.
                                                 // пока хз.

// (☞ﾟヮﾟ)☞ clone() клонирует объект, клонированные элементы имеют ту же ссылку, что и оригинал
        ArrayList <String> str_list2 = (ArrayList<String>) str_list.clone();
                                                            // но при этом сам ArrayList создаётся
                                                            // как новый объект

        //System.out.println(str_list2);


// (☞ﾟヮﾟ)☞ toArray()    // переводит ArrayList в массив
//          toArray(ТИП ДАННЫХ [] array) // а тут переводит ArrayList в массив конкретного типа данных

        String [] array1 = str_list2.toArray(new String[str_list2.size()]);
        for (String s : array1) {
            //System.out.print(s + " ");

        }
        //System.out.println();

// (☞ﾟヮﾟ)☞ Array.asList(ТИП ДАННЫХ [])  // тут уже массив переводит в ArrayList
        StringBuilder[] array = {new StringBuilder("1"), new StringBuilder("2")};
        List<StringBuilder> str_list4 = Arrays.asList(array); // !!!ВАЖНО!!!
      // System.out.println(str_list4);                      // тут именно List, а не ArrayList
                                                           // взрыв жопы

        array[0].append("!!!");             // также важно знать, что, переводя массив в List
       // System.out.println(str_list4);      // он, List, начинает ссылаться на объекты самого массива
        array[1] = new StringBuilder("3");  // и ДАЖЕ если заменить объект в массиве на другой
        //System.out.println(str_list4);      // Лист БУДЕТ ссылаться ДАЖЕ на этот объект

// (☞ﾟヮﾟ)☞ Collectins.sort(ArrayList<DataType>)

        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList <String> str_list5 = new ArrayList<>();
        str_list5.add(s3);
        str_list5.add(s1);
        str_list5.add(s4);
        str_list5.add(s2);
        //System.out.println(str_list5);
        Collections.sort(str_list5);   // в общем обычная сортировка, только сортирует строки
       // System.out.println(str_list5);

// (☞ﾟヮﾟ)☞ equals(ArrayList<DataType>)  // даёт знать равны ли ArrayList'ы
                                         // Листы равны, даже если они не ссылаются на одно и тоже
                                         // Важно, чтобы их объекты в элементах были равны (только для String)
        ArrayList <StringBuilder> t = new ArrayList<>(); // если не String, то покажет false при сравнении
        t.add(new StringBuilder("1"));
        t.add(new StringBuilder("2"));
        t.add(new StringBuilder("3"));
        ArrayList <StringBuilder> t2 = new ArrayList<>();
        t2.add(new StringBuilder("1"));
        t2.add(new StringBuilder("2"));
        t2.add(new StringBuilder("3"));
        //System.out.println(t.equals(t2));

// (☞ﾟヮﾟ)☞ Iterator
        Iterator <String> it = str_list5.iterator();
        while (it.hasNext()) {   // метод hasNext смотрит есть ли дальше следующий элемент
            System.out.println(it.next()); // метод next указывает на нынешний элемент
            it.remove();                   // отличия цикла через Iterator от foreach в том
                                           // что можно удалять элементы ArrayList
        }
        System.out.println(str_list5);

    }

}


































