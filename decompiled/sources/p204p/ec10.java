package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum ec10 implements od50 {
    ACTIVE(0),
    EXPANDED_TRIAL_ACTIVE(1),
    PREMIUM_TRIAL_ACTIVE(2),
    TRIAL_WITH_OFFLINE_ACTIVE(3),
    PREMIUM_NO_OFFLINE_ACTIVE(4),
    NO_TRIAL_HOLDOUT(5),
    TRIAL_DELAY(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f58210a;

    ec10(int i) {
        this.f58210a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f58210a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
