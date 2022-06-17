package Raka.Pratama.Data;

public class Category {
    private String Id;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        if (id == "One"){
            Id = id;
        }
    }

    public Boolean isExpensive() {
        return Expensive;
    }

    public void setExpensive(Boolean expensive) {
        if (!expensive){
            Expensive = expensive;
        }
    }

    private boolean Expensive;


}