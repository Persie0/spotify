package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum e6f0 implements od50 {
    MIXED(0),
    AUDIO(1),
    VIDEO(2);


    /* JADX INFO: renamed from: a */
    public final int f56634a;

    e6f0(int i) {
        this.f56634a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f56634a;
    }
}
