public class TestValidateAccount {
    public static void main(String[] args) {
        String[] arrString = new String[10];
        arrString[0] = "123a_c_";
        arrString[1] = "_abc123";
        arrString[2] = "______";
        arrString[3] = "123456";
        arrString[4] = "abcdefg";
        arrString[5] = ".@afafsfa";
        arrString[6] = "12345";
        arrString[7] = "1234_";
        arrString[8] = "ffsad";
        arrString[9] = "123afjdHbc_";
        Validate validate = new Validate();
        for (String string : arrString) {
            System.out.println(validate.validateAccount(string));
        }
    }
}
