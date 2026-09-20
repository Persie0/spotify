package p204p;

/* JADX INFO: loaded from: classes7.dex */
public enum zhy0 implements od50 {
    SCORE_THRESHOLD_UNSPECIFIED(0),
    SCORE_THRESHOLD_NO_ANSWER(1),
    SCORE_THRESHOLD_LOW(2),
    SCORE_THRESHOLD_MEDIUM(3),
    SCORE_THRESHOLD_HIGH(4),
    SCORE_THRESHOLD_PERFECT(5),
    SCORE_THRESHOLD_INCORRECT(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f283042a;

    zhy0(int i) {
        this.f283042a = i;
    }

    /* JADX INFO: renamed from: a */
    public static zhy0 m96182a(int i) {
        switch (i) {
            case 0:
                return SCORE_THRESHOLD_UNSPECIFIED;
            case 1:
                return SCORE_THRESHOLD_NO_ANSWER;
            case 2:
                return SCORE_THRESHOLD_LOW;
            case 3:
                return SCORE_THRESHOLD_MEDIUM;
            case 4:
                return SCORE_THRESHOLD_HIGH;
            case 5:
                return SCORE_THRESHOLD_PERFECT;
            case 6:
                return SCORE_THRESHOLD_INCORRECT;
            default:
                return null;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f283042a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
