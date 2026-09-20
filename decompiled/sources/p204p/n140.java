package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum n140 implements od50 {
    /* JADX INFO: Fake field, exist only in values array */
    AUDIENCE_UNSPECIFIED(0),
    AUDIENCE_LOGIN5(1),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIENCE_ACCOUNTS_SSO(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f149296a;

    n140(int i) {
        this.f149296a = i;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f149296a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
