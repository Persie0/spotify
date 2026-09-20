package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum slx implements od50 {
    UNSPECIFIED(0),
    ORIGINAL(1),
    PREMIUM_EXCLUSIVE_CONTENT(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f210512a;

    slx(int i) {
        this.f210512a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f210512a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
