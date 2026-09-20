package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum gw2 implements od50 {
    UNDEFINED(0),
    ALBUM(1),
    SINGLE(2),
    COMPILATION(3),
    EP(4),
    AUDIOBOOK(5),
    PODCAST(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f84883a;

    gw2(int i) {
        this.f84883a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f84883a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
