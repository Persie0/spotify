package p204p;

/* JADX INFO: loaded from: classes11.dex */
public enum oax0 implements od50 {
    STATE_UNSPECIFIED(0),
    STATE_NOT_STARTED(1),
    STATE_IN_PROGRESS(2),
    STATE_FINISHED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f163490a;

    oax0(int i) {
        this.f163490a = i;
    }

    /* JADX INFO: renamed from: a */
    public static oax0 m66583a(int i) {
        if (i == 0) {
            return STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return STATE_NOT_STARTED;
        }
        if (i == 2) {
            return STATE_IN_PROGRESS;
        }
        if (i != 3) {
            return null;
        }
        return STATE_FINISHED;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f163490a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
