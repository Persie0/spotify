package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum c6f0 implements od50 {
    SEQUENTIAL(1),
    EPISODIC(2),
    RECENT(3);


    /* JADX INFO: renamed from: a */
    public final int f34528a;

    c6f0(int i) {
        this.f34528a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f34528a;
    }
}
