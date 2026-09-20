package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum djb implements od50 {
    CAMPAIGN_STATE_UNSPECIFIED(0),
    CAMPAIGN_STATE_ACTIVE(1),
    CAMPAIGN_STATE_PAUSED(2),
    CAMPAIGN_STATE_CANCELLED(3),
    CAMPAIGN_STATE_COMPLETED(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f49640a;

    djb(int i) {
        this.f49640a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f49640a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
