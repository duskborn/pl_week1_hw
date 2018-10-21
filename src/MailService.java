import java.util.*;
        import java.util.function.Consumer;

public class MailService<T> implements Consumer<Message<T>>{


    private Map<String, List<T>> mailBox = new HashMap<String, List<T>>(){
        @Override
        public List<T> get(Object o) {
            if (!super.containsKey(o)) super.put((String) o, new ArrayList<>());
            return super.get(o);
        }
    };

    Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Message<T> o) {
        mailBox.get(o.getTo()).add(o.getContent());
    }
}