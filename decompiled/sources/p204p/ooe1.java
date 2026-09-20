package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum ooe1 implements od50 {
    ALBUM(0),
    SINGLE(1),
    COMPILATION(2),
    EP(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f167584a;

    ooe1(int i) {
        this.f167584a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f167584a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
