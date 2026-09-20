package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum h6f0 implements od50 {
    UNKNOWN(0),
    NONE(1),
    ALLOWED(2),
    MANDATORY(3);


    /* JADX INFO: renamed from: a */
    public final int f88084a;

    h6f0(int i) {
        this.f88084a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f88084a;
    }
}
