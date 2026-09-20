package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum eq70 implements qd50 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED_CONTENT_SCALE(0),
    FIT(1),
    CROP(2),
    FILL_BOUNDS(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f61806a;

    eq70(int i) {
        this.f61806a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m39723a() {
        if (this != UNRECOGNIZED) {
            return this.f61806a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
