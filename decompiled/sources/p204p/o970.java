package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class o970 extends AbstractC0156e {
    private static final o970 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile q2n0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private p970 params_;
    private int version_;

    static {
        o970 o970Var = new o970();
        DEFAULT_INSTANCE = o970Var;
        AbstractC0156e.m1799l(o970.class, o970Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m66447n(o970 o970Var) {
        o970Var.version_ = 0;
    }

    /* JADX INFO: renamed from: o */
    public static void m66448o(o970 o970Var, p970 p970Var) {
        o970Var.getClass();
        p970Var.getClass();
        o970Var.params_ = p970Var;
    }

    /* JADX INFO: renamed from: r */
    public static n970 m66449r() {
        return (n970) DEFAULT_INSTANCE.m1802e();
    }

    /* JADX INFO: renamed from: s */
    public static o970 m66450s(fva fvaVar, ztx ztxVar) {
        return (o970) AbstractC0156e.m1797j(DEFAULT_INSTANCE, fvaVar, ztxVar);
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new o970();
            case 4:
                return new n970();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (o970.class) {
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

    /* JADX INFO: renamed from: p */
    public final p970 m66451p() {
        p970 p970Var = this.params_;
        return p970Var == null ? p970.m69360m() : p970Var;
    }

    /* JADX INFO: renamed from: q */
    public final int m66452q() {
        return this.version_;
    }
}
