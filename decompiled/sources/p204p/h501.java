package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum h501 implements od50 {
    ACCEPTED(0),
    BAD_REQUEST(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f87698a;

    h501(int i) {
        this.f87698a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f87698a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
