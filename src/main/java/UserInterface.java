import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    Database database = new Database();
    Scanner scanner = new Scanner(System.in);

    private void startProgram() {
        System.out.println("------------------------------------");
        System.out.println("VELKOMMEN TIL SUPERHELTE PROGRAMMET!");
        System.out.println("------------------------------------");
        System.out.println("Du har nu følgende valgmuligheder:");

    }

    private void menuvalg() {
        int menuvalg;

        do {
            System.out.println("1. Opret superhelt");
            System.out.println("2. Søg i databasen");
            System.out.println("3. Se listen af superhelte");
            System.out.println("4. Slet en superhelt ");
            System.out.println("5. Afslut\n");
            System.out.println("Indtast nummer: ");
            menuvalg = scanner.nextInt();
            scanner.nextLine();

            if (menuvalg == 1) {
                System.out.println("Indtast navnet på din superhelt:");
                String navn = scanner.nextLine();
                System.out.println("Indtast virkeligt navn:");
                String rigtigNavn = scanner.nextLine();
                System.out.println("Indtast superkraft: ");
                String superkræft = scanner.nextLine();
                //   System.out.println("Indtast Superheltens powerlevel: ");
                double powerlevel = 0;
                int opdagelsesÅr = 0;

                boolean error = false;
                do {
                    error = false;
                    try {
                        System.out.println("Hvor høj er din superhelts powerlevel? (Et almindeligt menneske er 1.0) ");
                        powerlevel = scanner.nextDouble();
                    } catch (InputMismatchException ime) {
                        System.out.println("Indtast en numerisk værdi: ");
                        error = true;
                        scanner.nextLine();
                    }
                } while (error);

                do {
                    error = false;
                    try {
                        System.out.println("Indtast Superheltens opdagelsesår: ");
                        opdagelsesÅr = scanner.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.println("Indtast en numerisk værdi: ");
                        error = true;
                        scanner.nextLine();
                    }
                } while (error);

                System.out.println("Superhelt er nu oprettet\n");
                database.createSuperhero(navn, rigtigNavn, superkræft, powerlevel, opdagelsesÅr);
            }
            if (menuvalg == 2) {

                Superhero fundet = null;
                boolean error = false;
                do {
                    error = false;
                    System.out.println("Søg efter helt: ");
                    String søgning = scanner.nextLine();
                    fundet = database.searchForSuperhero(søgning);
                    if (fundet == null) {
                        error = true;
                    }

                } while (error);
                System.out.println("Rediger data og tryk Enter. Hvis data ikke skal redigeres tryk kun Enter");
                System.out.println("Hvis dataen ikke skal redigeres for powerlevel & opdagelsesår: Tryk 0 for at skip: \n");
                System.out.println("Superhelt navn: " + fundet.getSuperheltNavn());
                String newName = scanner.nextLine();
                if (!newName.isEmpty())
                    fundet.setSuperheltNavn(newName);

                System.out.println("Superhelts rigtige navn: " + fundet.getRigtigenavn());
                String newRealName = scanner.nextLine();
                if (!newRealName.isEmpty())
                    fundet.setRigtigeNavn(newRealName);

                System.out.println("Superkræft: " + fundet.getSuperkræft());
                String newSuperpower = scanner.nextLine();
                if (!newSuperpower.isEmpty())
                    fundet.setSuperkræft(newSuperpower);

                System.out.println("Powerlevel: " + fundet.getPowerlevel());
                double newPowerlevel = scanner.nextDouble();
                if (newPowerlevel != 0)
                    fundet.setPowerlevel(newPowerlevel);
                else
                    fundet.setPowerlevel(fundet.getPowerlevel());

                System.out.println("Opdagelsesår: " + fundet.getOpdagelsesår());
                int newDiscoveryYear = scanner.nextInt();
                if (newDiscoveryYear != 0)
                    fundet.setOpdagelsesår(newDiscoveryYear);
                else
                    fundet.setOpdagelsesår(fundet.getOpdagelsesår());
            }
            if (menuvalg == 3) {
                for (Superhero superhero : database.getSuperheroes()) {
                    System.out.println("Superheltens navn: " + superhero.getSuperheltNavn());
                    System.out.println("Superheltens rigtige navn: " + superhero.getRigtigenavn());
                    System.out.println("Superkræft: " + superhero.getSuperkræft());
                    System.out.println("Powerevel: " + superhero.getPowerlevel());
                    System.out.println("Opdagelsesår: " + superhero.getOpdagelsesår());
                    System.out.println(" ");
                }
            }
            if (menuvalg == 4) {
                System.out.println("Slet en superhelt ");
                Superhero fundet = null;
                boolean error = false;
                do {
                    error = false;
                    System.out.println("Søg efter superhelt: ");
                    String søgning = scanner.nextLine();
                    fundet = database.searchForSuperhero(søgning);
                    if (fundet != null) {
                        System.out.println("Fundet superhelt:  ");
                    } else {
                        System.out.println("Kunne ikke finde superhelt ");
                        error = true;
                    }

                } while (error);
                database.deleteSuperhero(fundet);
                System.out.println("Sletning af superhelt succesfuldt. \n");
            }

            else if (menuvalg == 5) ;

        } while (menuvalg != 5);
        System.out.println("Tak for at bruge programmet! ");
    }

    public void start() {
        startProgram();
        menuvalg();
    }

}