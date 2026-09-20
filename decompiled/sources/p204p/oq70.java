package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum oq70 implements qd50 {
    /* JADX INFO: Fake field, exist only in values array */
    DEFAULT_IDENTITY(0),
    BACKGROUND_NODE(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f168128a;

    oq70(int i) {
        this.f168128a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m67609a() {
        if (this != UNRECOGNIZED) {
            return this.f168128a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
