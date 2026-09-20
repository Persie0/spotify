package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum k761 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    UNSUPPORTED(1),
    SUPPORTED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f119990a;

    k761(int i) {
        this.f119990a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f119990a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
