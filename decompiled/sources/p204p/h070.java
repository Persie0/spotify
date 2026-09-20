package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class h070 extends AbstractC0156e {
    private static final h070 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile q2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private du60 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        h070 h070Var = new h070();
        DEFAULT_INSTANCE = h070Var;
        AbstractC0156e.m1799l(h070.class, h070Var);
    }

    /* JADX INFO: renamed from: m */
    public static void m46259m(h070 h070Var, du60 du60Var) {
        h070Var.getClass();
        h070Var.keyData_ = du60Var;
    }

    /* JADX INFO: renamed from: n */
    public static void m46260n(h070 h070Var, hzl0 hzl0Var) {
        h070Var.getClass();
        h070Var.outputPrefixType_ = hzl0Var.m49277b();
    }

    /* JADX INFO: renamed from: o */
    public static void m46261o(h070 h070Var) {
        h070Var.getClass();
        h070Var.status_ = su60.ENABLED.m79385a();
    }

    /* JADX INFO: renamed from: p */
    public static void m46262p(h070 h070Var, int i) {
        h070Var.keyId_ = i;
    }

    /* JADX INFO: renamed from: v */
    public static g070 m46263v() {
        return (g070) DEFAULT_INSTANCE.m1802e();
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new h070();
            case 4:
                return new g070(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (h070.class) {
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
    public final du60 m46264q() {
        du60 du60Var = this.keyData_;
        return du60Var == null ? du60.m36904p() : du60Var;
    }

    /* JADX INFO: renamed from: r */
    public final int m46265r() {
        return this.keyId_;
    }

    /* JADX INFO: renamed from: s */
    public final hzl0 m46266s() {
        hzl0 hzl0VarM49276a = hzl0.m49276a(this.outputPrefixType_);
        return hzl0VarM49276a == null ? hzl0.UNRECOGNIZED : hzl0VarM49276a;
    }

    /* JADX INFO: renamed from: t */
    public final su60 m46267t() {
        su60 su60Var;
        int i = this.status_;
        if (i == 0) {
            su60Var = su60.UNKNOWN_STATUS;
        } else if (i == 1) {
            su60Var = su60.ENABLED;
        } else if (i != 2) {
            su60Var = i != 3 ? null : su60.DESTROYED;
        } else {
            su60Var = su60.DISABLED;
        }
        return su60Var == null ? su60.UNRECOGNIZED : su60Var;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m46268u() {
        return this.keyData_ != null;
    }
}
