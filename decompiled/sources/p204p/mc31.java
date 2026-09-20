package p204p;

/* JADX INFO: loaded from: classes5.dex */
public enum mc31 implements od50 {
    SNOOZE_DURATION_30_DAYS(0),
    /* JADX INFO: Fake field, exist only in values array */
    SNOOZE_DURATION_10_SECS(99),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f142027a;

    mc31(int i) {
        this.f142027a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f142027a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
