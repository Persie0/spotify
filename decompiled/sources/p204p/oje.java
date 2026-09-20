package p204p;

/* JADX INFO: loaded from: classes6.dex */
public enum oje implements od50 {
    CLIENT_CAPABILITY_UNSPECIFIED(0),
    CAMPAIGN_CARD_RESERVED_SHARE_V1(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f166053a;

    oje(int i) {
        this.f166053a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f166053a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
