package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class o42 extends AbstractC0156e {
    private static final o42 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile q2n0 PARSER;
    private int keySize_;

    static {
        o42 o42Var = new o42();
        DEFAULT_INSTANCE = o42Var;
        AbstractC0156e.m1799l(o42.class, o42Var);
    }

    /* JADX INFO: renamed from: m */
    public static void m66225m(o42 o42Var) {
        o42Var.keySize_ = 64;
    }

    /* JADX INFO: renamed from: o */
    public static n42 m66226o() {
        return (n42) DEFAULT_INSTANCE.m1802e();
    }

    /* JADX INFO: renamed from: p */
    public static o42 m66227p(fva fvaVar, ztx ztxVar) {
        return (o42) AbstractC0156e.m1797j(DEFAULT_INSTANCE, fvaVar, ztxVar);
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"keySize_"});
            case 3:
                return new o42();
            case 4:
                return new n42(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (o42.class) {
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

    /* JADX INFO: renamed from: n */
    public final int m66228n() {
        return this.keySize_;
    }
}
