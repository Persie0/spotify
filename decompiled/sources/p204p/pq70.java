package p204p;

/* JADX INFO: loaded from: classes3.dex */
public enum pq70 implements qd50 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED_VERTICAL_ALIGNMENT(0),
    TOP(1),
    CENTER_VERTICALLY(2),
    BOTTOM(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f180208a;

    pq70(int i) {
        this.f180208a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m70621a() {
        if (this != UNRECOGNIZED) {
            return this.f180208a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
