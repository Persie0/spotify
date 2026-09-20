package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum y8x implements od50 {
    EVENT_TYPE_UNKNOWN(0),
    DISMISS(1),
    VIEW(2),
    CLICK(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f270405a;

    y8x(int i) {
        this.f270405a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f270405a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
