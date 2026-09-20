package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum poe1 implements od50 {
    OPEN(0),
    LOCKED(1),
    CAPPED(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f179697a;

    poe1(int i) {
        this.f179697a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f179697a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
