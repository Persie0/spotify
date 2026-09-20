package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum fq70 implements qd50 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f72091a;

    fq70(int i) {
        this.f72091a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m42398a() {
        if (this != UNRECOGNIZED) {
            return this.f72091a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
