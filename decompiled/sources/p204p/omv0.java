package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum omv0 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    REFERRALS_ENTRYPOINT_SURFACE_UNSPECIFIED(0),
    REFERRALS_ENTRYPOINT_SURFACE_BLEND(1),
    REFERRALS_ENTRYPOINT_SURFACE_JAM(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f167104a;

    omv0(int i) {
        this.f167104a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f167104a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
