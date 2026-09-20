package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class l070 extends AbstractC0156e {
    private static final l070 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile q2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        l070 l070Var = new l070();
        DEFAULT_INSTANCE = l070Var;
        AbstractC0156e.m1799l(l070.class, l070Var);
    }

    /* JADX INFO: renamed from: m */
    public static void m57789m(l070 l070Var, String str) {
        l070Var.getClass();
        str.getClass();
        l070Var.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: n */
    public static void m57790n(l070 l070Var, hzl0 hzl0Var) {
        l070Var.getClass();
        l070Var.outputPrefixType_ = hzl0Var.m49277b();
    }

    /* JADX INFO: renamed from: o */
    public static void m57791o(l070 l070Var, su60 su60Var) {
        l070Var.getClass();
        l070Var.status_ = su60Var.m79385a();
    }

    /* JADX INFO: renamed from: p */
    public static void m57792p(l070 l070Var, int i) {
        l070Var.keyId_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static k070 m57793r() {
        return (k070) DEFAULT_INSTANCE.m1802e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0156e
    /* JADX INFO: renamed from: f */
    public final Object mo1803f(int i) {
        q2n0 q110Var;
        switch (edb.m38547C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new l070();
            case 4:
                return new k070(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (l070.class) {
                    try {
                        q110Var = PARSER;
                        if (q110Var == null) {
                            q110Var = new q110();
                            PARSER = q110Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return q110Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m57794q() {
        return this.keyId_;
    }
}
