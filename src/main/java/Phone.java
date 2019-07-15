public class Phone {
    private final String phoneName;
    private final String odel;

    public Phone(String phoneName, String odel) {
        this.phoneName = phoneName;
        this.odel = odel;
    }

    public String takePhoneCall(String phoneNum){
        return String.format(" make phone call to：%s。",phoneNum);
    }

    public String sendMessage(String content){
        return String.format("send message to：%s”。",content);
    }

    public String getPhoneName() {
        return phoneName;
    }

    public String getOdel() {
        return odel;
    }
}
