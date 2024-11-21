class UmaClass{
    static int contador = 0;
    static UmaClass uma;

    private UmaClass(){
        contador++;
    }
    
    public static int getContador(){
        return contador;
    }
    public static UmaClass instance(){
        if(uma == null){
            uma = new UmaClass();
        }
        return uma;
    }
}

public class TestadorDeUmaClasse{
    static UmaClass uma;
    public static void main(String[] args) {
        for(int i = 0; i<4; i++){
            uma = UmaClass.instance();
        }
        System.out.println(UmaClass.getContador());
    }
}
