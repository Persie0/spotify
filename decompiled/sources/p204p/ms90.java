package p204p;

/* JADX INFO: loaded from: classes8.dex */
public enum ms90 implements od50 {
    UNRECOGNIZED_CTA_DISPLAY_VALUE(0),
    LOCKED_GET_ON_THE_LIST(1),
    GET_ON_THE_LIST(2),
    ON_THE_LIST(3),
    LOCKED_NOTIFY_ME(4),
    NOTIFY_ME(5),
    WILL_BE_NOTIFIED(6),
    NOTIFY_ME_UPSELL(7),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f146735a;

    ms90(int i) {
        this.f146735a = i;
    }

    /* JADX INFO: renamed from: a */
    public static ms90 m62705a(int i) {
        switch (i) {
            case 0:
                return UNRECOGNIZED_CTA_DISPLAY_VALUE;
            case 1:
                return LOCKED_GET_ON_THE_LIST;
            case 2:
                return GET_ON_THE_LIST;
            case 3:
                return ON_THE_LIST;
            case 4:
                return LOCKED_NOTIFY_ME;
            case 5:
                return NOTIFY_ME;
            case 6:
                return WILL_BE_NOTIFIED;
            case 7:
                return NOTIFY_ME_UPSELL;
            default:
                return null;
        }
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f146735a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
