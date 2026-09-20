package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum d5w implements od50 {
    UNKNOWN(0),
    FULL(1),
    TRAILER(2),
    BONUS(3);


    /* JADX INFO: renamed from: a */
    public final int f45511a;

    d5w(int i) {
        this.f45511a = i;
    }

    /* JADX INFO: renamed from: a */
    public static d5w m35033a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return FULL;
        }
        if (i == 2) {
            return TRAILER;
        }
        if (i != 3) {
            return null;
        }
        return BONUS;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f45511a;
    }
}
