public class Draw_XYZ {
        private static void drawXZY(int n) {
                int a = 1;
                int Bar = n;
                int Kol = n;
                for (int i = 0; i < Bar; i++) {
                        for (int j = 0; j < Kol; j++) {
                                if (a % 2 == 0) {
                                        if (a % 3 ==0){
                                                System.out.print("X");
                                                a=a+1;
                                        }
                                        else {
                                                a = a + 1;
                                                System.out.print("Z");
                                        }

                                } else if (a % 3 == 0) {
                                        System.out.print("X");
                                        a = a + 1;

                                } else {
                                        a = a + 1;
                                        System.out.print("Y");
                                }
                                System.out.print(" ");
                        }
                        System.out.println();
                }
        }


        public static void main(String[] Args){
                System.out.println("Hasil");
                drawXZY(3);
                System.out.println("Hasil");
                drawXZY(5);
                System.out.println("Hasil");
                drawXZY(1);
        }
}

