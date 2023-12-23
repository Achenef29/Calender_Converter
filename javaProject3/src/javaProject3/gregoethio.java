package javaProject3;

import java.util.Scanner;

public class gregoethio {

    public void gregoconverter() {
        int gy = 0;
        int gm;
        int gd = 0;
        int ey;
        int em;
        int ed;
        var mon = "no";
        int i = 0;
        int op = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("please enter Gregorian day, month, year respectively");
        gd = s.nextInt();
        gm = s.nextInt();
        gy = s.nextInt();
        ey = gy;
        ed = gd;
        int result = gy % 4;

        //ethiopian into gregoreian calander converter
        if ((gm == 10) || (gm == 11) || gm == 12 && gd <= 22) {
            ey -= 7;
        } else if ((gm == 9) && (gd <= 10)) {
            ey -= 8;
             } else if ((gm == 9) && (gd >= 11)) {
            ey -= 7;
        } else if ((gm == 9) && (result == 0 && gd >= 11)) {
            ey -= 7;
        } else if ((gm == 9) && (result == 0 && gd <= 11)) {
            ey -= 8;
        } else if ((gm <= 8) || (result == 0 && gd <= 21) || (result == 1 && gd <= 22) || (result == 2 && gd <= 22) || (result == 3 && gd <= 22)) {
            ey -= 8;
        }

        //gregorian to ethiopian only month converter
        if ((result == 0) && (gm == 9 && gd >= 11)) {
            mon = "Meskerem";
        }
        if ((result == 0) && (gm == 10 && gd >= 1 && gd <= 10)) {
            mon = "Meskerem";
        }
        if ((result == 0) && (gm == 10 && gd >= 11)) {
            mon = "Tikimet";
        }
        if ((result == 0) && (gm == 11 && gd <= 9)) {
            mon = "Tikimit";
        }
        if ((result == 0) && (gm == 11 && gd >= 10)) {
            mon = "Hidar";
        }
        if ((result == 0) && (gm == 12 && gd <= 9)) {
            mon = "Hidar";
        }
        if ((result == 0) && (gm == 12 && gd >= 10)) {
            mon = "Tahisas";
        }
        if ((result == 0) && (gm == 1 && gd <= 9)) {
            mon = "Tahisas";
        }
        if ((result == 0) && (gm == 1 && gd >= 10)) {
            mon = "Tir";
        }
        if ((result == 0) && (gm == 2 && gd <= 8)) {
            mon = "Tir";
        }
        if ((result == 0) && (gm == 2 && gd >= 9)) {
            mon = "Yekatit";
        }
        if ((result == 0) && (gm == 3 && gd <= 9)) {
            mon = "Yekatit";
        }
        if ((result == 0) && (gm == 3 && gd >= 10)) {
            mon = "Megabit";
        }
        if ((result == 0) && (gm == 4 && gd <= 8)) {
            mon = "Megabit";
        }
        if ((result == 0) && (gm == 4 && gd >= 9)) {
            mon = "Miyaziya";
        }
        if ((result == 0) && (gm == 5 && gd <= 8)) {
            mon = "Miyaziya";
        }
        if ((result == 0) && (gm == 5 && gd >= 9)) {
            mon = "Ginbot";
        }
        if ((result == 0) && (gm == 6 && gd <= 7)) {
            mon = "Ginbot";
        }
        if ((result == 0) && (gm == 6 && (gd >= 8 && gd <= 30))) {
            mon = "Sene";
        }
        if ((result == 0) && (gm == 7 && gd <= 7)) {
            mon = "Sene";
        }
        if ((result == 0) && (gm == 7 && gd >= 8)) {
            mon = "Hamle";
        }
        if ((result == 0) && (gm == 8 && gd <= 6)) {
            mon = "Hamle";
        }
        if ((result == 0) && (gm == 8 && gd >= 7)) {
            mon = "Nehase";
        }
        if ((result == 0) && (gm == 9 && gd <= 5)) {
            mon = "Nehase";
        }
        if ((result == 0) && (gm == 9 && gd >= 6 && gd <= 10)) {
            mon = "Pagumin";
        }
        if ((result == 0) && (gm == 9 && gd >= 11)) {
            mon = "Meskerem";
        }

        if ((result == 0 && gm == 9 && gd >= 11)) {
            ed -= 10;
        } else if ((result == 0 && gm == 10) && (gd <= 10)) {
            ed += 20;
        }

        if ((result == 0 && gm == 10 && gd >= 11)) {
            ed -= 10;
        } else if ((result == 0 && gm == 11) && (gd <= 9)) {
            ed += 21;
        }

        if ((result == 0 && gm == 11) && (gd >= 10)) {
            ed -= 9;
        } else if ((result == 0 && gm == 12) && (gd >= 1 && gd <= 9)) {
            ed += 21;
        }

        if ((result == 0 && gm == 12 && gd >= 10)) {
            ed -= 9;
        } else if ((result == 0 && gm == 1) && (gd >= 1 && gd <= 8)) {
            ed += 22;
        }

        if ((result == 0 && gm == 1 && gd >= 9)) {
            ed -= 8;
        } else if ((result == 0 && gm == 2) && (gd >= 1 && gd <= 7)) {
            ed += 23;
        }

        if ((result == 0 && gm == 2 && gd >= 8)) {
            ed -= 7;
        } else if ((result == 0 && gm == 3) && (gd >= 1 && gd <= 9)) {
            ed += 21;
        }

        if ((result == 0 && gm == 3 && gd >= 10)) {
            ed -= 9;
        } else if ((result == 0 && gm == 4) && (gd >= 1 && gd <= 8)) {
            ed += 22;
        }

        if ((result == 0 && gm == 4 && gd >= 9)) {
            ed -= 8;
        } else if ((result == 0 && gm == 5) && (gd >= 1 && gd <= 8)) {
            ed += 22;
        }

        if ((result == 0 && gm == 5 && gd >= 9)) {
            ed -= 8;
        } else if ((result == 0 && gm == 6) && (gd >= 1 && gd <= 7)) {
            ed += 23;
        }

        if (((result == 0 && gm == 6) && (gd >= 8 && gd <= 30))) {
            ed -= 7;
        } else if ((result == 0 && gm == 7) && (gd >= 1 && gd <= 7)) {
            ed += 23;
        }

        if ((result == 0 && gm == 7 && gd >= 8)) {
            ed -= 7;
        } else if ((result == 0 && gm == 8) && (gd >= 1 && gd <= 6)) {
            ed += 24;
        }

        if ((result == 0 && gm == 8 && gd >= 7)) {
            ed -= 6;
        } else if ((result == 0 && gm == 9) && (gd >= 1 && gd <= 5)) {
            ed += 25;
        }

        if ((result == 0 && gm == 9) && (gd >= 6 && gd <= 10)) {
            ed -= 5;
        }

        
        // gregoreian to ethiopian only month converter
        if ((result == 1 || result == 2) && (gm == 9 && gd >= 11) || (result == 3) && (gm == 9 && gd >= 12)) {
            // if(ed>=12 && ed<=19 )
            mon = "Meskerem";
        }
        if ((result == 1 || result == 2) && (gm == 10 && gd >= 1 && gd <= 10) || (result == 3) && (gm == 10 && gd >= 1 && gd <= 11)) {
            mon = "Meskerem";
        }
        if ((result == 1 || result == 2) && (gm == 10 && gd >= 11) || (result == 3) && (gm == 10 && gd >= 12)) {
            mon = "Tikimet";
        }
        if ((result == 1 || result == 2) && (gm == 11 && gd <= 9) || (result == 3) && (gm == 11 && gd <= 10)) {
            mon = "Tikimet";
        }
        if ((result == 1 || result == 2) && (gm == 11 && gd >= 10) || (result == 3) && (gm == 11 && gd >= 11)) {
            mon = "Hidar";
        }
        if ((result == 1 || result == 2) && (gm == 12 && gd <= 9) || (result == 3) && (gm == 12 && gd <= 10)) {
            mon = "Hidar";
        }
        if ((result == 1 || result == 2) && (gm == 12 && gd >= 10) || (result == 3) && (gm == 12 && gd >= 11)) {
            mon = "Tahisas";
        }
        if ((result == 1 || result == 2) && (gm == 1 && gd <= 8) || (result == 3) && (gm == 1 && gd <= 8)) {
            mon = "Tahisas";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 1 && gd >= 9)) {
            mon = "Tir";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 2 && gd <= 7)) {
            mon = "Tir";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 2 && gd >= 8)) {
            mon = "Yekatit";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 3 && gd <= 9)) {
            mon = "Yekatit";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 3 && gd >= 10)) {
            mon = "Megabit";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 4 && gd <= 8)) {
            mon = "Megabit";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 4 && gd >= 9)) {
            mon = "Miyaziya";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 5 && gd <= 8)) {
            mon = "Miyaziya";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 5 && gd >= 9)) {
            mon = "Ginbot";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 6 && gd <= 7)) {
            mon = "Ginbot";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 6 && (gd >= 8 && gd <= 30))) {
            mon = "Sene";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 7 && gd <= 7)) {
            mon = "Sene";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 7 && gd >= 8)) {
            mon = "Hamle";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 8 && gd <= 6)) {
            mon = "Hamle";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 8 && gd >= 7)) {
            mon = "Nehase";
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 9 && gd <= 5)) {
            mon = "Nehase";
        }
        if ((result == 1 || result == 2) && (gm == 9 && gd >= 6 && gd <= 10) || ((result == 3) && (gm == 9 && gd >= 6 && gd <= 11))) {
            mon = "Pagumin";
        }
        if ((result == 1 || result == 2) && (gm == 9 && gd > 11)) {
            mon = "Meskerem";
        }
       
        //gregorian to ethiopian only day converter
        if ((result == 1 || result == 2) && (gm == 9 && gd >= 11)) {
            ed -= 10;
        }
        if (result == 3 && gm == 9 && gd >= 12) {
            ed -= 11;

        }
        if ((result == 1 || result == 2) && (gm == 10 && gd <= 10)) {
            ed += 20;
        }
        if (result == 3 && gm == 10 && gd <= 11) {
            ed += 19;
        }

        if ((result == 3) && (gm == 10 && gd >= 12)) {
            ed -= 11;
        }
        if ((result == 1 || result == 2) && (gm == 10 && gd >= 11)) {
            ed -= 10;
        }
        if ((result == 3) && (gm == 11 && gd >= 1 && gd <= 10)) {
            ed += 20;
        }
        if ((result == 1 || result == 2) && (gm == 11 && gd <= 9)) {
            ed += 21;
        }

        if ((result == 3) && (gm == 11 && gd >= 11)) {
            ed -= 10;
        }
        if ((result == 1 || result == 2) && (gm == 11 && gd >= 10)) {
            ed -= 9;
        }

        if ((result == 3) && (gm == 12 && gd >= 11)) {
            ed -= 10;
        }
        if ((result == 1 || result == 2) && (gm == 12 && gd <= 10)) {
            ed -= 9;
        }

        if ((result == 3 && gm == 12 && gd <= 10)) {
            ed += 20;
        }
        if ((result == 3) && (gm == 1 && gd >= 8)) {
            ed += 22;
        }

        if ((result == 1 || result == 2 || result == 3) && (gm == 1 && gd >= 9)) {
            ed -= 8;
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 2 && gd >= 1 && gd <= 7)) {
            ed += 23;
        }

        if ((result == 1 || result == 2 || result == 3) && (gm == 2 && gd >= 8)) {
            ed -= 7;
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 3 && gd >= 1 && gd <= 9)) {
            ed += 21;
        }

        if ((result == 1 || result == 2 || result == 3) && (gm == 3 && gd >= 10)) {
            ed -= 9;
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 4 && gd >= 1 && gd <= 8)) {
            ed += 22;
        }

        if ((result == 1 || result == 2 || result == 3) && (gm == 4 && gd >= 9)) {
            ed -= 8;
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 5 && gd >= 1 && gd <= 8)) {
            ed += 22;
        }

        if ((result == 1 || result == 2 || result == 3) && (gm == 5 && gd >= 9)) {
            ed -= 8;
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 6 && gd <= 7)) {
            ed += 23;
        }

        if ((result == 1 || result == 2 || result == 3) && (gm == 6 && gd >= 8 && gd <= 30)) {
            ed -= 7;
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 7 && gd <= 7)) {
            ed += 23;
        }

        if ((result == 1 || result == 2 || result == 3) && (gm == 7 && gd >= 8)) {
            ed -= 7;
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 8 && gd <= 6)) {
            ed += 24;
        }

        if ((result == 1 || result == 2 || result == 3) && (gm == 8 && gd >= 7)) {
            ed -= 6;
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 9 && gd <= 5)) {
            ed += 25;
        }
        if ((result == 1 || result == 2 || result == 3) && (gm == 9 && gd >= 6 && gd <= 11)) {
            ed -= 5;
        }
         System.out.println("============================================");
        System.out.println("the gregoreian calander = " + ed + "/" + mon + "/" + ey);
        System.out.println("============================================");
    }
}
