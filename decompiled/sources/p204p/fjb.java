package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum fjb implements od50 {
    CAMPAIGN_USER_STATE_INELIGIBLE_REASON_UNSPECIFIED(0),
    CAMPAIGN_USER_STATE_INELIGIBLE_FRAUD_SUSPECTED(1),
    CAMPAIGN_USER_STATE_INELIGIBLE_ACCOUNT_AGE(2),
    CAMPAIGN_USER_STATE_INELIGIBLE_AGE_RESTRICTION(3),
    CAMPAIGN_USER_STATE_INELIGIBLE_SOLD_OUT(4),
    CAMPAIGN_USER_STATE_INELIGIBLE_CANCELLED(5),
    CAMPAIGN_USER_STATE_INELIGIBLE_SALE_ENDED(6),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f70151a;

    fjb(int i) {
        this.f70151a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f70151a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
