package exercise1.Password;

public class Password {
    private String password;
    private char lastChar;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 6) {
            this.password = password;
            this.lastChar = password.charAt(password.length()-1);
            if (lastChar=='#'){
                for (int i = 1; i<=password.length()-1; i++)
                System.out.print("*");
            } else {System.out.println("Your password in visible version is " + getPassword());}
        } else {
            throw new RuntimeException("Please set password 6 digit or more");
        }
    }
}
