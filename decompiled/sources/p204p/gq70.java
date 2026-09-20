package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum gq70 implements qd50 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED_HORIZONTAL_ALIGNMENT(0),
    START(1),
    CENTER_HORIZONTALLY(2),
    END(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f83379a;

    gq70(int i) {
        this.f83379a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m45411a() {
        if (this != UNRECOGNIZED) {
            return this.f83379a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
