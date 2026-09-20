package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class g32 extends AbstractC0156e {
    private static final g32 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile q2n0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private fva keyValue_ = fva.f73739b;
    private m32 params_;
    private int version_;

    static {
        g32 g32Var = new g32();
        DEFAULT_INSTANCE = g32Var;
        AbstractC0156e.m1799l(g32.class, g32Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m43422n(g32 g32Var) {
        g32Var.version_ = 0;
    }

    /* JADX INFO: renamed from: o */
    public static void m43423o(g32 g32Var, bva bvaVar) {
        g32Var.getClass();
        g32Var.keyValue_ = bvaVar;
    }

    /* JADX INFO: renamed from: p */
    public static void m43424p(g32 g32Var, m32 m32Var) {
        g32Var.getClass();
        m32Var.getClass();
        g32Var.params_ = m32Var;
    }

    /* JADX INFO: renamed from: t */
    public static f32 m43425t() {
        return (f32) DEFAULT_INSTANCE.m1802e();
    }

    /* JADX INFO: renamed from: u */
    public static g32 m43426u(fva fvaVar, ztx ztxVar) {
        return (g32) AbstractC0156e.m1797j(DEFAULT_INSTANCE, fvaVar, ztxVar);
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new g32();
            case 4:
                return new f32();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (g32.class) {
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
    public final fva m43427q() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: r */
    public final m32 m43428r() {
        m32 m32Var = this.params_;
        return m32Var == null ? m32.m60623m() : m32Var;
    }

    /* JADX INFO: renamed from: s */
    public final int m43429s() {
        return this.version_;
    }
}
