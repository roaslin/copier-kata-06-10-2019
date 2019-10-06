public class Copier {
    private final ISource source;

    public Copier(ISource source) {
        this.source = source;
    }

    public void copy() {
        source.getChar();
    }
}
