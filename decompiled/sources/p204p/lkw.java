package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum lkw implements od50 {
    VIDEO(0),
    AUDIO(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f134467a;

    lkw(int i) {
        this.f134467a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f134467a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
