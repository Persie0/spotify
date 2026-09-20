package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum iu51 implements od50 {
    UNKNOWN(0),
    SPOTIFY(1),
    GOOGLE(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f105870a;

    iu51(int i) {
        this.f105870a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f105870a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
