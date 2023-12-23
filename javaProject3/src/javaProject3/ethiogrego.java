package javaProject3;

import java.util.Scanner;

public class ethiogrego {

    public void ethioconverter() {
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
        System.out.println("please enter ethiopian day, month, year respectively");
        ed = s.nextInt();
        em = s.nextInt();
        ey = s.nextInt();
        gy = ey;
        gd = ed;
        int result = ey % 4;

        //ethiopian into gregoreian calander converter
        if ((result == 0 && em < 4) || (result == 0 && em == 4 && ed <= 21)) {
            gy += 7;
        } else if ((result == 0 && em > 4) || (result == 0 && em == 4 && ed > 21)) {
            gy += 8;
        }
        //ethiopian into gregoreian only month converter
        if ((result == 0) && (em == 1 && ed <= 19)) {
            mon = "September";
        }
        if ((result == 0) && (em == 1 && ed > 19 && ed <= 30)) {
            mon = "October";
        }
        if ((result == 0) && (em == 2 && ed <= 20)) {
            mon = "October";
        }
        if ((result == 0) && (em == 2 && ed > 20)) {
            mon = "November";
        }
        if ((result == 0) && (em == 3 && ed <= 20)) {
            mon = "November";
        } else if ((result == 0) && (em == 3 && ed > 20)) {
            mon = "December";
        }
        if ((result == 0) && (em == 4 && ed <= 21)) {
            mon = "December";
        } else if ((result == 0) && (em == 4 && ed > 21)) {
            mon = "January";
        }
        if ((result == 0) && (em == 5 && ed <= 22)) {
            mon = "January";
        } else if ((result == 0) && (em == 5 && ed > 22)) {
            mon = "February";
        }
        if ((result == 0) && (em == 6 && ed <= 21)) {
            mon = "February";
        } else if ((result == 0) && (em == 6 && ed > 21)) {
            mon = "March";
        }
        if ((result == 0) && (em == 7 && ed <= 22)) {
            mon = "March";
        } else if ((result == 0) && (em == 7 && ed > 22)) {
            mon = "April";
        }
        if ((result == 0) && (em == 8 && ed <= 22)) {
            mon = "April";
        } else if ((result == 0) && (em == 8 && ed > 22)) {
            mon = "May";
        }
        if ((result == 0) && (em == 9 && ed <= 23)) {
            mon = "May";
        } else if ((result == 0) && (em == 9 && ed > 23)) {
            mon = "June";
        }
        if ((result == 0) && (em == 10 && ed <= 23)) {
            mon = "June";
        } else if ((result == 0) && (em == 10 && ed > 23)) {
            mon = "July";
        }
        if ((result == 0) && (em == 11 && ed <= 24)) {
            mon = "July";
        } else if ((result == 0) && (em == 11 && ed > 24)) {
            mon = "Augest";
        }
        if ((result == 0) && (em == 12 && ed <= 25)) {
            mon = "Augest";
        } else if ((result == 0) && (em == 12 && ed > 25)) {
            mon = "September";
        }
        if ((result == 0) && (em == 13 && ed >= 1)) {
            mon = "September";
        }
        if ((result == 0) && em == 1) {
            gd += 11;
            for (; gd > 30; gd--) {
                i += 1;
                if (gd == 31) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 0) && em == 2) {
            gd += 11;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }

        if ((result == 0) && em == 3) {
            gd += 10;
            for (; gd > 30; gd--) {
                i += 1;
                if (gd == 31) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 0) && em == 4) {
            gd += 10;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 0) && em == 5) {
            gd += 9;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 0) && em == 6) {
            gd += 8;
            for (; gd > 29; gd--) {
                i += 1;
                if (gd == 30) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 0) && em == 7) {
            gd += 9;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 0) && em == 8) {
            gd += 8;
            for (; gd > 30; gd--) {
                i += 1;
                if (gd == 31) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 0) && em == 9) {
            gd += 8;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 0) && em == 10) {
            gd += 7;
            for (; gd > 30; gd--) {
                i += 1;
                if (gd == 31) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 0) && em == 11) {
            gd += 7;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 0) && em == 12) {
            gd += 6;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 0) && em == 13) {
            gd += 5;
        }

        //ethiopian into gregoreian calander converter
        if ((result == 1 && em < 4) || (result == 2 && em < 4) || (result == 3 && em < 4)) {
            gy += 7;
        } else if ((result == 1 && em == 4 && ed <= 22) || (result == 2 && em == 4 && ed <= 22) || (result == 3 && em == 4 && ed <= 22) && em == 4 && ed <= 22) {
            gy += 7;
        } else if (result == 1 || result == 2 || result == 3 && em == 4 && ed > 23) {
            gy += 8;
        } else if ((result == 1 || result == 2 || result == 3 && em > 4)) {
            gy += 8;
        }
        //ethiopian into gregoreian only month converter
        if ((result == 1 || result == 2 || result == 3) && (em == 1 && ed <= 19)) {
            // if(ed>=12 && ed<=19 )
            mon = "September";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 1 && ed > 19 && ed <= 30)) {
            mon = "October";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 2 && ed <= 20)) {
            mon = "October";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 2 && ed > 20)) {
            mon = "November";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 3 && ed <= 20)) {
            mon = "November";
        } else if ((result == 1 || result == 2 || result == 3) && (em == 3 && ed > 20)) {
            mon = "December";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 4 && ed <= 21)) {
            mon = "December";
        } else if ((result == 1 || result == 2 || result == 3) && (em == 4 && ed > 21)) {
            mon = "January";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 5 && ed <= 22)) {
            mon = "January";
        } else if ((result == 1 || result == 2 || result == 3) && (em == 5 && ed > 22)) {
            mon = "February";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 6 && ed <= 21)) {
            mon = "February";
        } else if ((result == 1 || result == 2 || result == 3) && (em == 6 && ed > 21)) {
            mon = "March";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 7 && ed <= 22)) {
            mon = "March";
        } else if ((result == 1 || result == 2 || result == 3) && (em == 7 && ed > 22)) {
            mon = "April";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 8 && ed <= 22)) {
            mon = "April";
        } else if ((result == 1 || result == 2 || result == 3) && (em == 8 && ed > 22)) {
            mon = "May";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 9 && ed <= 23)) {
            mon = "May";
        } else if ((result == 1 || result == 2 || result == 3) && (em == 9 && ed > 23)) {
            mon = "June";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 10 && ed <= 23)) {
            mon = "June";
        } else if ((result == 1 || result == 2 || result == 3) && (em == 10 && ed > 23)) {
            mon = "July";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 11 && ed <= 24)) {
            mon = "July";
        } else if ((result == 1 || result == 2 || result == 3) && (em == 11 && ed > 24)) {
            mon = "Augest";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 12 && ed <= 25)) {
            mon = "Augest";
        } else if ((result == 1 || result == 2 || result == 3) && (em == 12 && ed > 25)) {
            mon = "September";
        }
        if ((result == 1 || result == 2 || result == 3) && (em == 13 && ed >= 1)) {
            mon = "September";
        }
        if ((result == 1 || result == 2 || result == 3) && em == 1) {
            gd += 10;
            for (; gd > 30; gd--) {
                i += 1;
                if (gd == 31) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 1 || result == 2 || result == 3) && em == 2) {
            gd += 10;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }

        if ((result == 1 || result == 2 || result == 3) && em == 3) {
            gd += 9;
            for (; gd > 30; gd--) {
                i += 1;
                if (gd == 31) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 1 || result == 2 || result == 3) && em == 4) {
            gd += 9;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 1 || result == 2 || result == 3) && em == 5) {
            gd += 8;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 1 || result == 2 || result == 3) && em == 6) {
            gd += 7;
            for (; gd > 28; gd--) {
                i += 1;
                if (gd == 29) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 1 || result == 2 || result == 3) && em == 7) {
            gd += 9;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 1 || result == 2 || result == 3) && em == 8) {
            gd += 8;
            for (; gd > 30; gd--) {
                i += 1;
                if (gd == 31) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 1 || result == 2 || result == 3) && em == 9) {
            gd += 8;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 1 || result == 2 || result == 3) && em == 10) {
            gd += 7;
            for (; gd > 30; gd--) {
                i += 1;
                if (gd == 31) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 1 || result == 2 || result == 3) && em == 11) {
            gd += 7;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 1 || result == 2 || result == 3) && em == 12) {
            gd += 6;
            for (; gd > 31; gd--) {
                i += 1;
                if (gd == 32) {
                    gd = 0;
                    gd += i;
                    break;
                }
            }
        }
        if ((result == 1 || result == 2 || result == 3) && em == 13) {
            gd += 5;
        }
        System.out.println("the gregoreian calander = " + gd + "/" + mon + "/" + gy);
    }
}
