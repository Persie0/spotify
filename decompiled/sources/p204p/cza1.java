package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum cza1 implements od50 {
    BIO_AUDIENCE_UNSPECIFIED(0),
    BIO_AUDIENCE_SELF_ONLY(1),
    BIO_AUDIENCE_CONNECTIONS_ONLY(2),
    BIO_AUDIENCE_PUBLIC(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f43515a;

    cza1(int i) {
        this.f43515a = i;
    }

    /* JADX INFO: renamed from: a */
    public static cza1 m34429a(int i) {
        if (i == 0) {
            return BIO_AUDIENCE_UNSPECIFIED;
        }
        if (i == 1) {
            return BIO_AUDIENCE_SELF_ONLY;
        }
        if (i == 2) {
            return BIO_AUDIENCE_CONNECTIONS_ONLY;
        }
        if (i != 3) {
            return null;
        }
        return BIO_AUDIENCE_PUBLIC;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43515a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
