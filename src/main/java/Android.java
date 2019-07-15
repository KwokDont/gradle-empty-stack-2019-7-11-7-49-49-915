public class Android extends Phone {

    private final String os = "Android";

    public Android(String phoneName, String coloe) {
        super(phoneName, coloe);
    }

    @Override
    public String takePhoneCall(String phoneNum) {
        return String.format("%s 打电话给：%s。",os ,phoneNum);
    }

    @Override
    public String sendMessage(String content) {
        return String.format("%s 发送消息：[%s]”。",os ,content);
    }

    public String getOs() {
        return os;
    }
}
