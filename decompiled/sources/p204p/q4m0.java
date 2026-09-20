package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum q4m0 implements od50 {
    PAGE_UNSPECIFIED(0),
    CHALLENGE_PAGE(1),
    QUIZ_PAGE(2),
    RESULTS_PAGE_SOLO(3),
    ROUND_ERROR(4),
    Q_AND_A(5),
    CHALLENGE_RESULT(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f185255a;

    q4m0(int i) {
        this.f185255a = i;
    }

    /* JADX INFO: renamed from: a */
    public static q4m0 m72172a(int i) {
        switch (i) {
            case 0:
                return PAGE_UNSPECIFIED;
            case 1:
                return CHALLENGE_PAGE;
            case 2:
                return QUIZ_PAGE;
            case 3:
                return RESULTS_PAGE_SOLO;
            case 4:
                return ROUND_ERROR;
            case 5:
                return Q_AND_A;
            case 6:
                return CHALLENGE_RESULT;
            default:
                return null;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f185255a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
