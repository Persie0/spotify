package p204p;

/* JADX INFO: loaded from: classes.dex */
public enum w640 implements od50 {
    DEFAULT(0),
    PROMO(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f248252a;

    w640(int i) {
        this.f248252a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f248252a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
