package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum ym91 implements od50 {
    IMAGE(0),
    VIDEO(1),
    VIDEO_LOOPING(2),
    VIDEO_LOOPING_RANDOM(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f274200a;

    ym91(int i) {
        this.f274200a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f274200a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
