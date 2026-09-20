package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum wsa implements od50 {
    DARK(0),
    LIGHT(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f254571a;

    wsa(int i) {
        this.f254571a = i;
    }

    /* JADX INFO: renamed from: a */
    public static wsa m88882a(int i) {
        if (i == 0) {
            return DARK;
        }
        if (i != 1) {
            return null;
        }
        return LIGHT;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f254571a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
