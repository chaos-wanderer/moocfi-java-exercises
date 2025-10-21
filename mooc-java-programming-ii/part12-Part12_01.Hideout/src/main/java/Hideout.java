public class Hideout<T> {
    private T hidden;

    public Hideout() {
        this.hidden = null;
    }

    public void putIntoHideout(T toHide) {
        this.hidden = toHide;
    }

    public T takeFromHideout() {
        T temp = hidden;
        hidden = null;
        return temp;
    }

    public boolean isInHideout() {
        if (!(hidden == null)) {
            return true;
        } else {
            return false;
        }
    }




}
