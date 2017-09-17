public class MetodoRecursivo {
    public static void main(String[] args){MetodoRecursivo x= new MetodoRecursivo(); x.bajarEscalera(20);}
    public void bajarEscalera(int escalones){
        if(escalones<0){System.out.println("no puedes poner numeros negativos");}else {if (escalones == 0) { System.out.println("HAS BAJADO LA ESCALERA"); }
        else {System.out.println("Bajando escalon " + escalones); }}

       bajarEscalera(escalones-1);
    }
}
