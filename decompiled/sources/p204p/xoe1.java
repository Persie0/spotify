package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum xoe1 implements od50 {
    ALBUM(0),
    BOOK(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f264271a;

    xoe1(int i) {
        this.f264271a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f264271a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
