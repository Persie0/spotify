package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum z5f0 implements od50 {
    AD(0),
    SUBSCRIPTION(1),
    CATALOGUE_ALL(2),
    SHUFFLE(3),
    COMMERCIAL(4);


    /* JADX INFO: renamed from: a */
    public final int f279559a;

    z5f0(int i) {
        this.f279559a = i;
    }

    /* JADX INFO: renamed from: a */
    public static z5f0 m95460a(int i) {
        if (i == 0) {
            return AD;
        }
        if (i == 1) {
            return SUBSCRIPTION;
        }
        if (i == 2) {
            return CATALOGUE_ALL;
        }
        if (i == 3) {
            return SHUFFLE;
        }
        if (i != 4) {
            return null;
        }
        return COMMERCIAL;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f279559a;
    }
}
