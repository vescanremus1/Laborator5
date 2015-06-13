package com.company;

import java.util.Scanner;

/**
 * Created by Mihai on 6/13/2015.
 */
public class DoLogin {


    Login[] loginList = new Login[3];

    DoLogin() {
        Login l1 = new Login("i", "p");
        Login l2 = new Login("v", "v");
        Login l3 = new Login("a", "a");

        loginList[0] = l1;
        loginList[1] = l2;
        loginList[2] = l3;
    }








    public boolean login() {
        boolean found=false;

            Scanner sc = new Scanner(System.in);
            String user;
            System.out.print("enter username=");
            user=sc.next();
            String pwd;
            System.out.print("enter pwd=");
            pwd=sc.next();

            if(search(user,pwd,loginList))
              found=true;

            System.out.println("n ai ghicit");

return found;



    }


    public boolean loginUntilSuccess() {
        boolean found=false;

        do {
            Scanner sc = new Scanner(System.in);
            String user;
            System.out.print("enter username=");
            user = sc.next();
            String pwd;
            System.out.print("enter pwd=");
            pwd = sc.next();

            if (search(user, pwd, loginList)) {
                found = true;
                break;
            }
            System.out.println("n ai ghicit");

        }
        while(true);

        return found;



    }

    private static boolean search(String u, String p, Login[] l) {
        boolean found=false;
        for(int i =0;i<l.length;i++){
            Login ll = l[i];
            if(u.equals(ll.getUser()) && p.equals(ll.getPassword())) {
                found=true;
                break;
            }
        }
        return found;
    }





}
