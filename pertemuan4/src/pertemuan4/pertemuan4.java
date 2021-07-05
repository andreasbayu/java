package pertemuan4;

import java.io.*;


public class pertemuan4 {
    public static void main(String[] args) throws IOException {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        // // setter 
        // Login setter = new Login();
        // setter.setUsername("budi");
        // setter.setPassword("12345");
        // System.out.println(setter.getUsername());
        // System.out.println(setter.getPassword());

        // // tanpa inisialisasi
        // Login tanpa = new Login();
        // System.out.println(tanpa.getUsername());
        // System.out.println(tanpa.getPassword());

        // // dengan construc
        // Login construct = new Login("kocak", "1239");
        // System.out.println(construct.getUsername());
        // System.out.println(construct.getPassword());

        Login user1 = new Login();
        Login user2 = new Login("", "");
        String line = "=======================";
        boolean lAdmin = false;
        while (true) {
            System.out.println(line);
            System.out.println("Login");
            System.out.println(line);
            System.out.println("1. Login");
            System.out.println("2. Ubh Pw Admin");
            System.out.println("3. Buat User");
            System.out.println("4. Data USER");
            System.out.println("5. keluar");
            System.out.println(line);
            System.out.print("Pilih > ");
            int input = Integer.parseInt(buff.readLine());

            switch (input) {
                case 1:
                    System.out.print("username : ");
                    String username = buff.readLine();
                    System.out.print("password : ");
                    String password = buff.readLine();

                    if (username.equals(user1.getUsername()) && password.equals(user1.getPassword())) {
                        System.out.println("Success Admin");
                        lAdmin = true;
                    } else if (username.equals(user2.getUsername()) && password.equals(user2.getPassword())) {
                        System.out.printf("Hai User %s\n", user2.getUsername());
                    } else {
                        System.out.println("Failed");
                    }
                    break;
                case 2:
                    System.out.print("PW lama : ");
                    String oldPw = buff.readLine();
                    System.out.print("PW baru : ");
                    String newPw = buff.readLine();
                    System.out.println();

                    if (oldPw.equals(user1.getPassword())) {
                        user1.setPassword(newPw);
                        System.out.println("Success");
                    } else {
                        System.out.println("failed");
                    }
                    break;
                case 3:
                    if (lAdmin) {
                        System.out.print("username : ");
                        String usernameBaru = buff.readLine();
                        System.out.print("password : ");
                        String passwordBaru = buff.readLine();
                        user2.setUsername(usernameBaru);
                        user2.setPassword(passwordBaru);
                    } else {
                        System.out.println("Anda Bukan Admin");
                    }
                    break;
                case 4:
                    System.out.println("Admin");
                    System.out.println("Username : " + user1.getUsername());
                    System.out.println("Password : " + user1.getPassword());
                    System.out.println("User");
                    System.out.println("Username : " + user2.getUsername());
                    System.out.println("Password : " + user2.getPassword());
                    break;
                case 5:
                    System.exit(0);;
                default:
                    continue;
            }
        }
    }
}
