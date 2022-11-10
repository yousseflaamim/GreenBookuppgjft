# GreenBookuppgjft

        System.out.println(".............................");
        System.out.println("..<<<menu of green book>>....");
        System.out.println(".............................");
        System.out.println(".......0 entry with manger.....");
        System.out.println(".............................");
        System.out.println(" .....1 add new contact......");
        System.out.println(".............................");
        System.out.println("..... 2 check for list......");
        System.out.println("..............................");
        System.out.println("......3 show lista............");
        System.out.println("..............................");
        System.out.println("......4 uppdateracontact  .....");
        System.out.println("..............................");
        System.out.println("......5 deletemenu............");
        System.out.println("..............................");
        System.out.println("...... 6 quite................");
        System.out.println(".............................");
        System.out.println(".............................");

         //this choose first menu.............................................

        try {

                int selk = sc.nextInt();



               if  (selk == 0 || selk == 1 || selk == 2 || selk == 3 || selk == 4 || selk == 5 || selk == 6) {

                    switch (selk) {
                        case 0:
                            addvistor_adminstor();
                            break;
                        case 1:
                            addcontact();
                            break;
                        case 2:
                            searchMeue();
                            break;
                        case 3:
                            showlista();
                            break;
                        case 4:
                            updatera();
                            break;
                        case 5:
                            deletcontact();
                            break;
                        case 6:
                            System.out.println("Good bie see you soon");
                            System.exit(0);
                        default:


                    }
                } else {
                    System.out.println("Please choose number 1 to 6 ");
                }
            }catch (Exception e){ System.out.println("pPlease choose number 1 to 6  try againe");


        }menu();

        }

    public static void addvistor_adminstor(){
        System.out.println("....<<<..menu add adminstor..>>>........");
        System.out.println(".... 1 addmanger....");
        System.out.println(".............................");
        System.out.println("... .2 listOfadminster ..");
        System.out.println("..............................");
        System.out.println("..... 3 lista of vistore......");
        System.out.println("...............................");
        System.out.println("..... 4 add vistore............");
        System.out.println(".............................");
        System.out.println("..... 5 back-menu...............");
        System.out.println(".............................");
        try {



                int lis = sc.nextInt();
                if (lis == 1 || lis == 2 || lis == 3 || lis == 4 || lis == 5) {
                    switch (lis) {
                        case 1 -> Operation.addaAdminster();
                        case 2 -> Operation.listaOfadminster();
                        case 3 -> Operation.listaOfvistore();
                        case 4 -> Operation.addVistore();
                        case 5 -> menu();

                    }
                } else {
                    System.out.println("plas chose number 1 to 5");
                }

            }catch (Exception e){
            System.out.println("information isn't correct pleas tey aging");
        }menu();

        }

// .........1 add new contact.................................
    public static void addcontact() {
        System.out.println("...........................");
        System.out.println("...<<.menuAddcontact.>>....");
        System.out.println("...........................");
        System.out.println("...1 add new contact.........");
        System.out.println("...........................");
        System.out.println("...2 showlista.............");
        System.out.println(".............................");
        System.out.println("...4 back to menu............");
        System.out.println("...........................");
        System.out.println("...........................");

       op.addlogic();
    }
//............2 menu-search
    public static void searchMeue() {
        System.out.println("...............................");
        System.out.println("....<<..searchmenu..>>..........");
        System.out.println("....0 showlista.........");
        System.out.println("...............................");
        System.out.println("....1 search by name...........");
        System.out.println("...............................");
        System.out.println("....2 search by city............");
        System.out.println("...............................");
        System.out.println(".....3 search by numberphone.....");
        System.out.println("...............................");
        System.out.println(".....4 showlista................");
        System.out.println("...............................");
        System.out.println("......5 searchbyage...............");
        System.out.println("...............................");
        System.out.println("......6 back to menu................");
        System.out.println("..................................");


        Operation.searchlogic();
    }
//,,,,,3 of menu
    public static void showlista() {

        System.out.println("lista is ");
        Operation.showall();

    }
//...........4 menu
    public static void updatera() {
        System.out.println("...............................");
        System.out.println("....<<..uppdateraMenu..>>........");
        System.out.println("...............................");
        System.out.println("....1 uppdatera name...........");
        System.out.println("...............................");
        System.out.println("....2 uppdatera city............");
        System.out.println("...............................");
        System.out.println(".....3 uppdatera numberphone.....");
        System.out.println("...............................");
        System.out.println(".....4  uppdatera aftername.....");
        System.out.println("...............................");
        System.out.println("..... 5 uppdatera age............");
        System.out.println("...................................");
        System.out.println(".......6 back to menu..........");
        System.out.println("...................................");
        Operation.updtcontact();
    }

//....... 5 menu.......................................................
    public static void deletcontact() {
        System.out.println("...........................");
        System.out.println("...<<.deleted-menu.>>....");
        System.out.println("...........................");
        System.out.println("...1 showlista.........");
        System.out.println("...........................");
        System.out.println("...2  deleted contact.............");
        System.out.println(".............................");
        System.out.println("...3  deleted all............");
        System.out.println("...........................");
        System.out.println("....4 back to menu.........");
        System.out.println("...........................");
        Operation.deletMenu();
    }

}
