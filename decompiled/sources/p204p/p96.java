package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum p96 implements od50 {
    DEFAULT(0),
    ARTIST(1),
    SHOW(2),
    USER(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f175168a;

    p96(int i) {
        this.f175168a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f175168a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
