package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class j970 extends AbstractC0156e {
    private static final j970 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile q2n0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private k970 params_;
    private int version_;

    static {
        j970 j970Var = new j970();
        DEFAULT_INSTANCE = j970Var;
        AbstractC0156e.m1799l(j970.class, j970Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m52732n(j970 j970Var) {
        j970Var.version_ = 0;
    }

    /* JADX INFO: renamed from: o */
    public static void m52733o(j970 j970Var, k970 k970Var) {
        j970Var.getClass();
        k970Var.getClass();
        j970Var.params_ = k970Var;
    }

    /* JADX INFO: renamed from: r */
    public static i970 m52734r() {
        return (i970) DEFAULT_INSTANCE.m1802e();
    }

    /* JADX INFO: renamed from: s */
    public static j970 m52735s(fva fvaVar, ztx ztxVar) {
        return (j970) AbstractC0156e.m1797j(DEFAULT_INSTANCE, fvaVar, ztxVar);
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
                return new j970();
            case 4:
                return new i970();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (j970.class) {
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
    public final k970 m52736p() {
        k970 k970Var = this.params_;
        return k970Var == null ? k970.m55770m() : k970Var;
    }

    /* JADX INFO: renamed from: q */
    public final int m52737q() {
        return this.version_;
    }
}
