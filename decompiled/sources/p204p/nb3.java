package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum nb3 implements od50 {
    START(0),
    CENTER(1),
    END(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f152172a;

    nb3(int i) {
        this.f152172a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f152172a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
