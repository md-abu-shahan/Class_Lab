package task;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Home h = new Home();
        h.parsonal();
//        String s = new String ();
    }
}

class Home {

    private void addres() {
        System.out.println("Kuarpar");
    }

    private void phone() {
        System.out.println("01703844436");
    }

    private void village() {
        System.out.println("Gorpur , sylhet");
    }

    private void sibling() {
        System.out.println("six brother and one sister");
    }

    private void email() {
        System.out.println("shahanahmed668@gmail.com");
    }

    private void sisterBirthYear() {
        System.out.println("2009");
    }

    private void brotherName(int a) {
        switch (a) {
            case 1:
                System.out.println("MD. ABU SUFIAN");
                break;
            case 2:
                System.out.println("MD. ABU REDWAN");
                break;
            case 3:
                System.out.println("MD. ABU RAYHAN");
                break;
            case 4:
                System.out.println("MD. ABU BURHAN");
                break;
            case 5:
                System.out.println("MD. ABU SHAHAN");
                break;
            case 6:
                System.out.println("MD. ABU SHUHAN");
                break;
        }
    }

    private void brotherBirthYear(int a) {
        switch (a) {
            case 1:
                System.out.println("1988");
                break;
            case 2:
                System.out.println("1990");
                break;
            case 3:
                System.out.println("1993");
                break;
            case 4:
                System.out.println("1995");
                break;
            case 5:
                System.out.println("1997");
                break;
            case 6:
                System.out.println("2000");
                break;
        }
    }

    private void sisterName() {
        System.out.println("MARIAM NUSAYBA");
    }

    public void parsonal() {
        System.out.println(" addres\n phone\n village\n sibline\n email\n BrotherName\n sisterName\n brotherBathYear\n sisterBathYear \n\n");
        Scanner scan = new Scanner(System.in);
        String s[] = new String[10];
        System.out.println("what kind of matarial do you want about me\n");
        for (int i = 0; i < 1; i++) {
            s[i] = scan.nextLine();
            switch (s[i]) {
                case "addres":
                    addres();
                    break;
                case "phone":
                    phone();
                    break;
                case "village":
                    village();
                    break;
                case "sisterName":
                    sisterName();
                    break;
                case "sibline":
                    sibling();
                    break;
                case "email":
                    email();
                    break;
                case "sisterBathYear":
                    sisterBathYear();
                    break;
                case "brotherName":
                    System.out.println("which brother press 1 2 3 4 5 6");
                    int c = scan.nextInt();
                    brotherName(c);
                    break;
                case "brotherBathYear":
                    System.out.println("which brother press 1 2 3 4 5 6");
                    int d = scan.nextInt();
                    brotherBathYear();
                    break;
                default:
                    System.out.println("not found");
                    break;
            }
        }
    }

    private void sisterBathYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void brotherBathYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
