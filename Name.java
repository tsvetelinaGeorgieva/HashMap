import java.util.Objects;

public class Name {
    public String mark;
    public String model;

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Name(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(mark, name.mark) && Objects.equals(model, name.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model);
    }
}
