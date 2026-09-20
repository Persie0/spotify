package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class uu60 extends AbstractC0156e {
    private static final uu60 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile q2n0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private fva value_ = fva.f73739b;

    static {
        uu60 uu60Var = new uu60();
        DEFAULT_INSTANCE = uu60Var;
        AbstractC0156e.m1799l(uu60.class, uu60Var);
    }

    /* JADX INFO: renamed from: m */
    public static void m83967m(uu60 uu60Var, String str) {
        uu60Var.getClass();
        uu60Var.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: n */
    public static void m83968n(uu60 uu60Var, bva bvaVar) {
        uu60Var.getClass();
        uu60Var.value_ = bvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m83969o(uu60 uu60Var, hzl0 hzl0Var) {
        uu60Var.getClass();
        uu60Var.outputPrefixType_ = hzl0Var.m49277b();
    }

    /* JADX INFO: renamed from: p */
    public static uu60 m83970p() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static tu60 m83971t() {
        return (tu60) DEFAULT_INSTANCE.m1802e();
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new uu60();
            case 4:
                return new tu60(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (uu60.class) {
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
    public final hzl0 m83972q() {
        hzl0 hzl0VarM49276a = hzl0.m49276a(this.outputPrefixType_);
        return hzl0VarM49276a == null ? hzl0.UNRECOGNIZED : hzl0VarM49276a;
    }

    /* JADX INFO: renamed from: r */
    public final String m83973r() {
        return this.typeUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final fva m83974s() {
        return this.value_;
    }
}
