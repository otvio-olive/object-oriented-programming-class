public class Complex
{
    float a;    //Públicos
    float b;    //Públicos

    Complex(){}         //Construtor Default -> Inicializa a=0 e b=0

    Complex(float a){    //Construtor -> Inicializa a=a e b=0
        this.a = a;
    }

    Complex(float a, float b){  //Construtor -> Inicializa a=a e b=b
        this.a = a;
        this.b = b;   
    }

    Complex add(final Complex c){    //O termo 'final' é semelhante ao 'const' em C/C++
        return new Complex(a+c.a, b+c.b);
    }

    Complex sub(final Complex c){ 
        return new Complex(a-c.a, b-c.b);
    }

    Complex mul(final Complex c){
        return new Complex(a*c.a - b*c.b, a*c.b + b*c.a);
    }

    Complex div(final Complex c){
        return new Complex((a*c.a+b*c.b + (b*c.a-a*c.b))/(c.a*c.a + c.b*c.b));
    }

    Complex conj(){
        return new Complex(a, b*(-1));
    }

    void print(String label)
    {
        System.out.printf("%s (%f, %f)\n", label, a, b);
    } 
}