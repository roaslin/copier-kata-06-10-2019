public class Copier {
    private final ISource source;
    private final IDestination iDestination;

    public Copier(ISource source, IDestination iDestination) {
        this.source = source;
        this.iDestination = iDestination;
    }

    public void copy() {
        char copiedChar = source.getChar();
        iDestination.setChar(copiedChar);
    }
}
