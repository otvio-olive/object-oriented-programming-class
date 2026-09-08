class A{
    int a = 1;
    int b = 2;

    void f(){
        System.out.println("A.f()");
    }

    void n(){
        System.out.println("A.n()");
    }
}

class B extends A{
    int a = 3;
    int b = 4;

    void g(){
        System.out.println("B.g()");
    }

    void f(){
        System.out.println("B.f()");
    }

    void n(){
        System.out.println("B.n()");
    }
}

class C extends B{
    void g(){
        System.out.println("C.g()");
    }

    void n(){
        System.out.println("C.n()");
    }
}

class Main{
    static void testA(A x){
        System.out.printf("%d \n", x.a);

        x.f();
        x.n();
    }

    static void testB(B x){
        System.out.printf("%d \n", x.a);

        x.f();
        x.n();
        x.g();
    }

    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();

        testA(a);
        testA(b);
        testA(c);

        //testB(a);   //Não funciona, já que 'a' é um ponteiro referente à um endereço da classe A, possuindo apenas atributos e métodos definidos em A, não em B
        testB(b);
        testB(c);
    }
}