package p204p;

/* JADX INFO: loaded from: classes10.dex */
public enum wh7 implements od50 {
    AUTH_PROVIDER_STATE_UNSPECIFIED(0),
    AUTH_PROVIDER_STATE_LOGIN_ONLY(1),
    AUTH_PROVIDER_STATE_LOGIN_SIGNUP(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f251271a;

    wh7(int i) {
        this.f251271a = i;
    }

    /* JADX INFO: renamed from: a */
    public static wh7 m88115a(int i) {
        if (i == 0) {
            return AUTH_PROVIDER_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return AUTH_PROVIDER_STATE_LOGIN_ONLY;
        }
        if (i != 2) {
            return null;
        }
        return AUTH_PROVIDER_STATE_LOGIN_SIGNUP;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f251271a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
