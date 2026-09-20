package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum f6f0 implements od50 {
    MIXED(0),
    AUDIO(1),
    VIDEO(2);


    /* JADX INFO: renamed from: a */
    public final int f66398a;

    f6f0(int i) {
        this.f66398a = i;
    }

    /* JADX INFO: renamed from: a */
    public static f6f0 m40860a(int i) {
        if (i == 0) {
            return MIXED;
        }
        if (i == 1) {
            return AUDIO;
        }
        if (i != 2) {
            return null;
        }
        return VIDEO;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f66398a;
    }
}
