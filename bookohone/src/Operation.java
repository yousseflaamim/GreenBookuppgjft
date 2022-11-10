
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Operation  {
  //int conut = 0;

    public static ArrayList<Contact> list = new ArrayList<Contact>();

    public static ArrayList<Adminstratore> list1 = new ArrayList<Adminstratore>();
    public static ArrayList<Vistore> list2 = new ArrayList<Vistore>();


    static menuofchosse m = new menuofchosse();
    static Scanner scanner = new Scanner(System.in);

    public Operation()  {

    }

    public static void addlogic() {
     try {
         int ax = scanner.nextInt();

         while (true) {
             if (ax == 1 || ax == 2 || ax == 3) {
                 switch (ax) {
                     case 1:
                         addnew();
                         menuofchosse.menu();
                         break;
                     case 2:
                         showall();
                         menuofchosse.menu();
                         break;
                     case 3:
                         updtcontact();
                         menuofchosse.menu();
                         break;
                     default:
                         break;
                 }
             } else {
                 System.out.println("plese chose number 1 to 3");
             }
         }
     }catch (Exception e){
         System.out.println("information isn't correct pleas try aging");
     }
    }

    public static void addnew() {
     try {
         Scanner scanner = new Scanner(System.in);

         System.out.println("enter your name");
         String name = scanner.nextLine();
         System.out.println("enter your after-name");
         String aftrname = scanner.nextLine();
         System.out.println(".................");
         System.out.println("enter you city");
         String city = scanner.nextLine();
         System.out.println("Enter you street");
         String street = scanner.nextLine();
         System.out.println("pleas enter number phone do you want updater ex 07534567");
         int numberphone = scanner.nextInt();

         System.out.println("Enter your age");
         int age = scanner.nextInt();

         System.out.println("pleas enter number phone2 do you want updater ex 07534567");
         int numberphone1 = scanner.nextInt();
         System.out.println("enter you zipcode");
         int zipcode = scanner.nextInt();
         System.out.println("enter you apt-number");
         int aptnumber = scanner.nextInt();
         Contact admn1 = new Contact(name, city, aftrname, street, age, numberphone, numberphone1, zipcode, aptnumber);
         list.add(admn1);


         System.out.println("contact add sucssfule");
         menuofchosse.menu();
     }catch (Exception e){
         System.out.println("information isn't correct pleas try aging");
     }
    }
////////////////menu search//////////////////////
    public static void searchlogic() {

            try {

                int search = scanner.nextInt();
                if (search == 0 || search == 1 || search == 2 || search == 3 || search == 4 || search == 5 || search == 6) {
                    switch (search) {
                        case 0 -> showall();
                        case 1 -> Operation.searchByaftrname();
                        case 2 -> searchBystreat();
                        case 3 -> searchByname();
                        case 4 -> searchBynumberPhone();
                        case 5 -> searchByage();
                        case 6 -> menuofchosse.menu();
                        default -> {
                        }

                    }
                } else {
                    System.out.println("plase chose numbers 1 to 5 ");
                }
            }catch (Exception e){
                System.out.println("information isn't correct pleas try aging");
            }

    }
/////////////////////// search aftrname////////////////
    public static void searchByaftrname() {
      try {
          Scanner scanner = new Scanner(System.in);

          System.out.println("pls enter after-name search");
          System.out.println("..............................");
          String aftrnam = scanner.next();
          int flag = 1;
          Iterator<Contact> itadm = list.iterator();
          while (itadm.hasNext()) {
              Contact admn1 = itadm.next();
              if (aftrnam.equals(admn1.getAftername())) ;
              System.out.println("name is " + admn1.getName() + " \n after-name " + admn1.getAftername() + "\n city" + admn1.getCity() + "age is" + admn1.getAge() +
                      " \n number-phone " + admn1.getNumberphone() + "\n street " + admn1.getStreet() + "\n zipcode " + admn1.getZipcode()
                      + " \n aprtnumber " + admn1.getAptnumber());
              flag = 0;
          }
          if (flag == 1) {
              System.out.println("after-name isn't exist");
          }
      }catch (Exception e){
          System.out.println("information isn't correct pleas try aging");
      }
        menuofchosse.searchMeue();
    }
    ///////////////////////////search name//////////////////
    public static void searchByname() {
      try {
          System.out.println("plz enter name search");

          System.out.println("..............................");
          String aftrnam = scanner.next();
          int flag = 1;
          Iterator<Contact> itadm = list.iterator();
          while (itadm.hasNext()) {
              Contact admn1 = itadm.next();
              if (aftrnam.equals(admn1.getName())) ;
              System.out.println("name is " + admn1.getName() + " \n after-name " + admn1.aftername + "\n city" + admn1.getCity() + "age is" + admn1.getAge() +
                      " \n number-phone " + admn1.getNumberphone() + "\n street " + admn1.getStreet() + "\n zipcod " + admn1.getZipcode()
                      + " \n aprtnumber " + admn1.getAptnumber());
              flag = 0;
          }
          if (flag == 1) {
              System.out.println("after-name isnt exist");
          }
      }catch (Exception e){
          System.out.println("information isn't correct pleas try aging");
      }
        menuofchosse.searchMeue();

    }
/////////////////////////////////////search streat/////////////////////
    public static void searchBystreat() {
      try {
          System.out.println("plais enter after-name search");

          System.out.println("..............................");
          String aftrnam = scanner.next();
          int flag = 1;
          Iterator<Contact> itadm = list.iterator();
          while (itadm.hasNext()) {
              Contact admn1 = itadm.next();
              if (aftrnam.equals(admn1.getStreet())) ;
              System.out.println("name is " + admn1.getName() + " \n after-name " + admn1.getAftername() + "\n city" + admn1.getCity() + "age is " + admn1.getAge() +
                      " \n number-phone " + admn1.getNumberphone() + "\n street " + admn1.getStreet() + "\n zipcode " + admn1.getZipcode()
                      + " \n aprtnumber " + admn1.getAptnumber());
              flag = 0;
          }
          if (flag == 1) {
              System.out.println("street isn't exist");
          }
      }catch (Exception e){
          System.out.println("information isn't correct pleas try aging");
      }
        menuofchosse.searchMeue();
    }
///////////////////////////////search numberphone/////////////////
    public static void searchBynumberPhone() {
      try {
          Scanner scanner = new Scanner(System.in);

          System.out.println("plaes enter number-phone search");
          System.out.println("..............................");
          int numberphone = scanner.nextInt();
          int flag = 1;
          Iterator<Contact> itadm = list.iterator();
          while (itadm.hasNext()) {
              Contact admn1 = itadm.next();
              if (numberphone == (admn1.getNumberphone())) ;
              System.out.println("name is " + admn1.getName() + " \n after-name " + admn1.aftername + "\n city" + admn1.getCity() + "age is " + admn1.getAge() +
                      " \n number-phone " + admn1.getNumberphone() + "\n street " + admn1.getStreet() + "\n zipcode " + admn1.getZipcode()
                      + " \n apt number " + admn1.getAptnumber());
              flag = 0;
          }
          if (flag == 1) {
              System.out.println("number-phone isn't exist");
          }
      }catch (Exception e){
          System.out.println("Information isn't correct please try again");
      }
        menuofchosse.searchMeue();

    }
/////////////////////////////search age/////////////////////
    public static void searchByage() {
       try {
           Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter age search");
        System.out.println("..............................");
        int age = scanner.nextInt();
        int flag = 1;
        Iterator<Contact> itadm = list.iterator();
        while (itadm.hasNext()) {
            Contact admn1 = itadm.next();
            if (age == (admn1.getAge())) ;
            System.out.println("name is " + admn1.getName() + " \n after-name is" + admn1.getAftername() + "\n city is" + admn1.getCity() + "\n age is" + admn1.getAge() +
                    " \n number-phone is " + admn1.getNumberphone() + "\n street is" + admn1.getStreet() + "\n zipcode is" + admn1.getZipcode()
                    + " \n aprt number is" + admn1.getAptnumber());
            flag = 0;
        }
        if (flag == 1) {
            System.out.println("age isn't exist");
        }
        }catch (Exception e){
           System.out.println("Information isn't correct please try again");
       }
        menuofchosse.searchMeue();

    }
////////////////////////////show all lista//////////////////////////
    public static void showall() {
if(list.isEmpty()) {System.out.println("lista is empty");}else {
    Iterator<Contact> itadm = list.iterator();
    for (Iterator<Contact> it = itadm; it.hasNext(); ) {
        Contact admin1 = it.next();
        System.out.println(admin1);


    }
}

        menuofchosse.menu();
    }

///////////////////////////////update contact///////////////////////////////
    public static void updtcontact() {
        Scanner scanner = new Scanner(System.in);

            try {

            int opd = scanner.nextInt();
            if (opd == 1 || opd == 2 || opd == 3 || opd == 4 || opd == 5 || opd == 6) {
                switch (opd) {
                    case 1 -> nameUpdatera();
                    case 2 -> cityUpdatera();
                    case 3 -> numberPhoneUppdater();
                    case 4 -> afterNameUpdatera();
                    case 5 -> ageUppdater();
                    case 6 -> menuofchosse.menu();
                }
            } else {
                System.out.println("Please choose 1 to 5 ");

            }
        }catch (Exception e){
                System.out.println("Information isn't correct pleas try aging");}

    }
////////////////////////update name//////////////////////////////////////
    public static void nameUpdatera() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println("Enter id of manger");
            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Please enter name if do you want update");
                String nameupd = scanner1.nextLine();
                System.out.println("Enter new name");
                String newname = scanner1.nextLine();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (nameupd.equals(admin1.getName())) {
                        admin1.setName(newname);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("your name isn't exist");
                }
            } else {
                System.out.println(" :( you are not manger :( ");
            }
        }
        menuofchosse.updatera();
    }
////////////////////////////////update city/////////////////////
    public static void cityUpdatera() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("list is Empty");
        } else {
            System.out.println("enter id manger");
            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("pleas enter city do you want updater");
                String cityupd = scanner1.nextLine();
                System.out.println("entr new name");
                String newcity = scanner1.nextLine();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (cityupd.equals(admin1.getCity())) {
                        admin1.setCity(newcity);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("your city isn't exist");
                }
            } else {
                System.out.println(" :( you are not manger :(");
            }
        }
        menuofchosse.updatera();

    }
////////////////////////////update numberphone//////////////////////////
    public static void numberPhoneUppdater() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println("enter id manger");
            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("pleas enter number phone do you want updater ex 07534567");
                int numberphoneupd = scanner1.nextInt();
                System.out.println("entr new name");
                int newnumberphon = scanner1.nextInt();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (numberphoneupd == (admin1.getNumberphone())) {
                        admin1.setNumberphone(newnumberphon);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("your number phone isn't exist");
                }
            } else {
                System.out.println(" :( you are not manger :(");
            }
        }
        menuofchosse.updatera();

    }
////////////////////////////////update age//////////////////
    public static void ageUppdater() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println("enter id manger");

            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("pleas enter  age do you want updater ");
                int age = scanner1.nextInt();
                System.out.println("entr new age");
                int newAge = scanner1.nextInt();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (age == (admin1.getAge())) {
                        admin1.setNumberphone(newAge);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("your age isn't exist");
                }
            } else {
                System.out.println(" :( you are not manger :(");
            }
        }
        menuofchosse.updatera();

    }
///////////////////////////update after name////////////////
    public static void afterNameUpdatera() {
        Scanner scanner = new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println("enter id manger");
            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("pleas enter after-name do you want updater");
                String aftrnameupd = scanner1.nextLine();
                System.out.println(" entr new name");
                String newaftrname = scanner1.nextLine();
                int flag = 1;
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (aftrnameupd.equals(admin1.getAftername())) {
                        admin1.setAftername(newaftrname);
                        flag = 0;
                    }
                }
                if (flag == 1) {
                    System.out.println("your after-name isn't exist");
                }
            } else {
                System.out.println(" :( you are not manger :( ");
            }
        }
        menuofchosse.updatera();

    }
/////////////////////////deleted menu////////////////
    public static void deletMenu() {
        Scanner scanner = new Scanner(System.in);

            try {

                int del = scanner.nextInt();
                if (del == 1 || del == 2 || del == 3 || del == 4) {
                    switch (del) {
                        case 1:
                            showall();
                            break;
                        case 2:
                            deltedContact();
                            break;
                        case 3:
                            deletedAll();
                            break;
                        case 4:
                            menuofchosse.menu();
                            break;

                    }
                } else {
                    System.out.println("pleas chose number 1 to 4");
                }
            }catch (Exception e){
                System.out.println("information isn't correct pleas try aging");
            }

    }
////////////////////deleted contact///////////////////////
    public static void deltedContact() {

        if (list.isEmpty()) {
            System.out.println("<<<list is Empty>>>");
        } else {

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter id of manger");
            int id = scanner.nextInt();
            if (Operation.check_manager(id)) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("entr name contact do you want delete");
                System.out.println(".....................................");
                String name = scanner1.nextLine();
                Iterator<Contact> itadm = list.iterator();
                while (itadm.hasNext()) {
                    Contact admin1 = itadm.next();
                    if (name.equals(admin1.getName())) {
                        itadm.remove();
                        System.out.println(" :) deleted is successful :)");
                    } else {
                        System.out.println("this name isn't exist");
                    }
                }

            } else {
                System.out.println(" :( you are not manger :(");
            }

        }
        menuofchosse.deletcontact();

    }
////////////////////////////////////deleted all//////////////
    public static void deletedAll() {
        // Scanner scanner=new Scanner(System.in);
        if (list.isEmpty()) {
            System.out.println("<<<list is empty >>>");

        } else {
            try {


                Scanner scanner1 = new Scanner(System.in);
                System.out.println("enter your id ");
                int id = scanner1.nextInt();
                if (Operation.check_manager(id)) {
                    list.removeAll(list);
                    System.out.println("is empty");
                } else {
                    System.out.println(" :( you are not manger :(");
                }
            }catch (Exception e){
                System.out.println("information isn't correct pleas try aging");
            }
        }
        menuofchosse.deletcontact();
    }
/////////////////////////////////add administer//////////////////
    public static void addaAdminster() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter name of administer");
            String namadmins = scanner.nextLine();
            System.out.println("enter after-name of administer");
            String aftrdmins = scanner.nextLine();
            System.out.println("enter  number phone");
            int phondmins = scanner.nextInt();
            System.out.println("enter  id");
            int id = scanner.nextInt();
            System.out.println("enter type of usera");
            System.out.print(" manager ?  (1:yes) , (2:no)? ");
            int x = scanner.nextInt();
            String type;
            if (x == 1) {
                type = "Manager";
            } else {
                type = null;
            }
            Adminstratore admin = new Adminstratore(namadmins, aftrdmins, phondmins, type, id);
            list1.add(admin);
            //  menuofchosse.menu();
        }catch (Exception e){
            System.out.println("information isn't correct pleas try aging");
        }
    }
    //////////////////////////////check manger///////////////////////////
    public static boolean check_manager(int id) {

        boolean stat = false;
        for (int i = 0; i < list1.size(); i++) {
            if (id == list1.get(i).getId()) {
                if (list1.get(i).isManager()) {
                    stat = true;
                }
            }
        }
        return stat;
    }
//////////////////////////show list administer/////////////////////
    public static void listaOfadminster() {
        if (list1.isEmpty()) {
            System.out.println("list of manger is empty");

        } else {
            for (Adminstratore ad : list1
            ) {
                System.out.println(ad);
            }
        }

    }
/////////////////////////////////show lit visitor////////////////
    public static void listaOfvistore() {
        if (list2.isEmpty()) {
            System.out.println("list of visitor is empty");
        } else {
            for (Adminstratore ad : list1
            ) {
                System.out.println(ad);
            }
        }

    }
////////////////////////////add vistor///////////////////
    public static void addVistore() {

            try {

                Scanner scanner = new Scanner(System.in);

                System.out.println("enter name of visitor");
                String namadmins1 = scanner.nextLine();
                System.out.println("enter afternaem of vistore");
                String aftrdmins1 = scanner.nextLine();
                System.out.println("enter  number phone");
                int phondmins1 = scanner.nextInt();

                Vistore vist = new Vistore(namadmins1, aftrdmins1, phondmins1);
                list2.add(vist);
                System.out.println("add visitor is suffuse");
            } catch (Exception e) {
                System.out.println("isn't correct try aging");
            }//menuofchosse.menu();
        }

    }




