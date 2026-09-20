package p204p;

/* JADX INFO: loaded from: classes4.dex */
public enum ggf1 implements naf1 {
    JS_CODE_UNSPECIFIED(0),
    JS_CODE_SUCCESS(1),
    JS_NETWORK_ERROR(2),
    JS_INTERNAL_ERROR(3),
    JS_INVALID_SITE_KEY(4),
    JS_INVALID_SITE_KEY_TYPE(5),
    JS_3P_APP_PACKAGE_NAME_NOT_ALLOWED(6),
    JS_INVALID_ACTION(7),
    JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED(8),
    JS_PROGRAM_ERROR(9),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f79667a;

    ggf1(int i) {
        this.f79667a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f79667a);
    }
}
