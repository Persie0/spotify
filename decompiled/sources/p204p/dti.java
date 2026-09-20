package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum dti implements od50 {
    CONNECT(0),
    CAST(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f52855a;

    dti(int i) {
        this.f52855a = i;
    }

    /* JADX INFO: renamed from: a */
    public static dti m36854a(int i) {
        if (i == 0) {
            return CONNECT;
        }
        if (i != 1) {
            return null;
        }
        return CAST;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f52855a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
