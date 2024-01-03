public class MediaIfElse {
    public static void main(String[] args) {

        double num1 = 10;
        double num2 = 5;
        double num3 = 8;
        double num4 = 4;
        double  media = (num1 + num2 + num3 + num4) /4 ;
        System.out.println(media);

        if (media >=7) {
            System.out.println("Está Aprvado");
        }
        else if (media <7 && media>=5) {
            System.out.println("Refazer teste");
        }
        else if (media<=4) {
            System.out.println("Reprovado");
        }
    }

}


