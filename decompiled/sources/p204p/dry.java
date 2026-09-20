package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum dry implements od50 {
    BLOCKING(0),
    BACKGROUND_SYNC(1),
    ASYNC(2),
    PUSH_INITIATED(3),
    RECONNECT(4),
    UNRECOGNIZED(-1);

    private static final rd50 internalValueMap = new r46(11);
    private final int value;

    dry(int i) {
        this.value = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
