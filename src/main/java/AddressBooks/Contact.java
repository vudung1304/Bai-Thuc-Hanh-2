package AddressBooks;

public class Contact {
    private String name;
    private String phone;
    private String email;
    private String company;

    public Contact(String name, String phone, String email, String company) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
