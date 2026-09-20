package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum w5f0 implements od50 {
    DEFAULT(0),
    SMALL(1),
    LARGE(2),
    XLARGE(3);


    /* JADX INFO: renamed from: a */
    public final int f248082a;

    w5f0(int i) {
        this.f248082a = i;
    }

    /* JADX INFO: renamed from: a */
    public static w5f0 m87244a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return SMALL;
        }
        if (i == 2) {
            return LARGE;
        }
        if (i != 3) {
            return null;
        }
        return XLARGE;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f248082a;
    }
}
