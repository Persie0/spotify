package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum sop0 implements od50 {
    READY(0),
    PENDING(1);


    /* JADX INFO: renamed from: a */
    public final int f212631a;

    sop0(int i) {
        this.f212631a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f212631a;
    }
}
