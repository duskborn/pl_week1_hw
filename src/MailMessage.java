public class MailMessage implements Message<String>{

    private String from;
    private String to;
    private String content;

    MailMessage(String from, String to, String content){
        this.from = from;
        this.to = to;
        this.content = content;
    }

    String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getContent() {
        return content;
    }

}
