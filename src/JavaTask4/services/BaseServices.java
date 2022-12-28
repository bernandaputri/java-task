package JavaTask4.services;

public class BaseServices {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String action() {
        while (true) {
            String option = QuestionService.questionString("Ingin menambah/mengubah pesanan? (ubah/tambah/kembali) ");
            if (option.equalsIgnoreCase("tambah")) {
                return "tambah";
            } else if (option.equalsIgnoreCase("ubah")) {
                return "ubah";
            } else if (option.equalsIgnoreCase("kembali")) {
                return "kembali";
            } else {
                System.out.println("Pilihan tidak tersedia, silahkan ulangi.");
                continue;
            }
        }
    }
    
}
