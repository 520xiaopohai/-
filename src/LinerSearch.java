public class LinerSearch {
    private LinerSearch(){}
    /// 将方法作为范型方法 <E> 
    public static <E> int search(E[] data, E target) {
        for (int i =0; i< data.length; i++) 
            if (data[i].equals(target))
                return i;
        return -1;
    }
    /// 使用范型 不可以是基本数据类型,只能是类对象 (基本数据类型要使用包装类)
    public static void main(String[] args){
        Integer[] data = { 1,2,3,4,5,6,7,8,9,88 };
        int res = LinerSearch.search(data, 99);
        System.out.println(res);

        Student[] students = {
            new Student("alice"),
            new Student("bob"),
            new Student("morty")};
        Student bob = new Student("bob");
        int res2 = LinerSearch.search(students, bob);
        System.out.println(res2);

    }
    
}
