package p204p;

/* JADX INFO: loaded from: classes2.dex */
public enum j3a1 implements od50 {
    UNKNOWN(0),
    ANCHOR_PAYWALL(1),
    OAP_OTP(2),
    OAP_LINKING(3),
    AUDIOBOOK_DIRECT_SALES(4),
    ABP(5),
    AUDIOBOOK_PROMOTION(6),
    LEARNING_DIRECT_SALES(8),
    PREMIUM_KPOP_EARLY_ACCESS(9),
    OPAL(11),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f108342a;

    j3a1(int i) {
        this.f108342a = i;
    }

    /* JADX INFO: renamed from: a */
    public static j3a1 m52255a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ANCHOR_PAYWALL;
            case 2:
                return OAP_OTP;
            case 3:
                return OAP_LINKING;
            case 4:
                return AUDIOBOOK_DIRECT_SALES;
            case 5:
                return ABP;
            case 6:
                return AUDIOBOOK_PROMOTION;
            case 7:
            case 10:
            default:
                return null;
            case 8:
                return LEARNING_DIRECT_SALES;
            case 9:
                return PREMIUM_KPOP_EARLY_ACCESS;
            case 11:
                return OPAL;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f108342a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
