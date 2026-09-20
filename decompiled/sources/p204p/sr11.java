package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum sr11 implements od50 {
    UNKNOWN_LABEL(0),
    NOT_STARTED(1),
    IN_PROGRESS(2),
    COMPLETED(3);


    /* JADX INFO: renamed from: a */
    public final int f213212a;

    sr11(int i) {
        this.f213212a = i;
    }

    /* JADX INFO: renamed from: a */
    public static sr11 m78985a(int i) {
        if (i == 0) {
            return UNKNOWN_LABEL;
        }
        if (i == 1) {
            return NOT_STARTED;
        }
        if (i == 2) {
            return IN_PROGRESS;
        }
        if (i != 3) {
            return null;
        }
        return COMPLETED;
    }

    @Override // p204p.od50
    public final int getNumber() {
        return this.f213212a;
    }
}
