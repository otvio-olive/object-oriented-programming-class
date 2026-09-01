public static void main(String[] args){
    Complex c1 = new Complex(1, 2);
    Complex c2 = new Complex(3, 4);

    c1.add(c2).print("(c1+c2) =");
    c1.sub(c2).print("(c1-c2) =");
    c1.mul(c2).print("(c1*c2) =");
    c1.div(c2).print("(c1/c2) =");
    c1.conj().print("Conjugado de C1 =");
    c2.conj().print("Conjugado de C2 =");

}