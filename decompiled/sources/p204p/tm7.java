package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum tm7 implements od50 {
    AUTHENTICATOR_ATTACHMENT_UNSPECIFIED(0),
    AUTHENTICATOR_ATTACHMENT_PLATFORM(1),
    AUTHENTICATOR_ATTACHMENT_CROSS_PLATFORM(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f221618a;

    tm7(int i) {
        this.f221618a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f221618a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
