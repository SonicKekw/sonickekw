public class lap {
    private String login;
    private String password;
    private String confirmPassword;


    public lap(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean IsTrueString(String s) {
        if (s == null || s.isEmpty() || s.length() > 20) {
            return false;
        }
        String s1 = s.replaceAll("[^a-zA-Z0-9_]", "");
        if (s1.equals(s)) {
            return true;
        } else return false;
    }



    public static void IsLogPassTrue
            (String login, String password, String confirmPassword)
            throws wle, wpe {
        if (!IsTrueString(login)) {
            throw new wle("Логин не верный!");
        }
        if (!IsTrueString(password)) {
            throw new wpe("Пароль не верный!");
        }
        if (!password.equals(confirmPassword)) {
            throw new wpe("Подтверждение пароля не совпадает!");
        }
        if (IsTrueString(login) && IsTrueString(password) && password.equals(confirmPassword)) {
            System.out.println(true);
        }
    }


    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }
}