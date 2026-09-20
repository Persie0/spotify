package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum u5f0 implements od50 {
    FULL(0),
    TRAILER(1),
    BONUS(2);


    /* JADX INFO: renamed from: a */
    public final int f227012a;

    u5f0(int i) {
        this.f227012a = i;
    }

    /* JADX INFO: renamed from: a */
    public static u5f0 m82405a(int i) {
        if (i == 0) {
            return FULL;
        }
        if (i == 1) {
            return TRAILER;
        }
        if (i != 2) {
            return null;
        }
        return BONUS;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f227012a;
    }
}
