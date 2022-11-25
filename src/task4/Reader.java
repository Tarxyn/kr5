package task4;

public class Reader {
    private String FCs;
    private int number;
    private String faculty;
    private String birth;
    private String phone;

    public Reader(String FCs, int number, String faculty, String birth, String phone) {
        this.FCs = FCs;
        this.number = number;
        this.faculty = faculty;
        this.birth = birth;
        this.phone = phone;
    }

    public String getFCs() {
        return FCs;
    }

    public void setFCs(String FCs) {
        this.FCs = FCs;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(int quantity) {
        System.out.println(getFCs() + " take " + quantity + " books");
    }

    public void takeBook(String... books) {
        System.out.print(getFCs() + " take books: ");
        for (String book: books) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(getFCs() + " take books: ");
        for (Book book: books) {
            System.out.print(book.getAuthor() + " " + "\"" + book.getName() + "\"" + ", ");
        }
        System.out.println();
    }

    public void returnBook(int quantity) {
        System.out.println(getFCs() + " return " + quantity + " books");
    }

    public void returnBook(String... books) {
        System.out.print(getFCs() + " return books: ");
        for (String book: books) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(getFCs() + " return books: ");
        for (Book book: books) {
            System.out.print(book.getAuthor() + " " + "\"" + book.getName() + "\"" + ", ");
        }
        System.out.println();
    }
}
