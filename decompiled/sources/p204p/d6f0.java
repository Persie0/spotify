package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum d6f0 implements od50 {
    SEQUENTIAL(1),
    EPISODIC(2),
    RECENT(3);


    /* JADX INFO: renamed from: a */
    public final int f45690a;

    d6f0(int i) {
        this.f45690a = i;
    }

    /* JADX INFO: renamed from: a */
    public static d6f0 m35113a(int i) {
        if (i == 1) {
            return SEQUENTIAL;
        }
        if (i == 2) {
            return EPISODIC;
        }
        if (i != 3) {
            return null;
        }
        return RECENT;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f45690a;
    }
}
