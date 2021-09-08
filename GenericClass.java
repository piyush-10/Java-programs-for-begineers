package javaFramework;
/*       **************SYNTAX FOR GENERIC CLASS*********************
[access] class <class name> <<type1>,<type2>,....>{
               ....body of class
}
****************INSTANCE CREATION OF GENERIC CLASS************
<class name><typelist> varname = new <class name ><typelist>(<inputarray>);

 */
        public  class GenericClass <T>{
            private T x;
            public GenericClass(T t){
                this.x=t;
            }
            public void printdata(){
                System.out.println(x);
            }
    public static void main(String[] args) {
        GenericClass<String> n= new GenericClass<String>("String");
        n.printdata();
        GenericClass<Integer> m = new GenericClass<Integer>(45);
        m.printdata();
        GenericClass <Double> o = new GenericClass<Double>(45.123);
        o.printdata();
    }
}
