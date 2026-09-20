package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum ns90 implements od50 {
    SCHEDULED(0),
    LIVE(1),
    ENDED(2),
    CANCELLED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f157723a;

    ns90(int i) {
        this.f157723a = i;
    }

    /* JADX INFO: renamed from: a */
    public static ns90 m65507a(int i) {
        if (i == 0) {
            return SCHEDULED;
        }
        if (i == 1) {
            return LIVE;
        }
        if (i == 2) {
            return ENDED;
        }
        if (i != 3) {
            return null;
        }
        return CANCELLED;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f157723a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
