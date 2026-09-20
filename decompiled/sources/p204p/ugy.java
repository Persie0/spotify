package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum ugy implements od50 {
    BEST_PLACE_TO_START(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f230281a;

    ugy(int i) {
        this.f230281a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f230281a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
