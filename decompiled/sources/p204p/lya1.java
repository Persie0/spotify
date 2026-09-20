package p204p;

/* JADX INFO: loaded from: classes9.dex */
public enum lya1 implements od50 {
    USER_VERIFICATION_UNSPECIFIED(0),
    USER_VERIFICATION_REQUIRED(1),
    USER_VERIFICATION_PREFERRED(2),
    USER_VERIFICATION_DISCOURAGED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f138020a;

    lya1(int i) {
        this.f138020a = i;
    }

    /* JADX INFO: renamed from: a */
    public static lya1 m60236a(int i) {
        if (i == 0) {
            return USER_VERIFICATION_UNSPECIFIED;
        }
        if (i == 1) {
            return USER_VERIFICATION_REQUIRED;
        }
        if (i == 2) {
            return USER_VERIFICATION_PREFERRED;
        }
        if (i != 3) {
            return null;
        }
        return USER_VERIFICATION_DISCOURAGED;
    }

    @Override // p204p.od50
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f138020a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
