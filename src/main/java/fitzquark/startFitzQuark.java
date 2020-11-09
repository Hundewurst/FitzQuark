package fitzquark;

class main {
    public static void main(String[] args){
        System.out.println("FitzQuark");

        int i = 1;
        while(i < 100){
            System.out.println(i);
            if(i % 5 == 0 && i % 7 == 0){
                System.out.println("FitzQuark");
            }
            else if(i % 5 == 0){
                System.out.println("Fitz");
            }
            else if(i % 7 == 0){
                System.out.println("Quark");
            }
            i = i+1;
        }
    }
}
