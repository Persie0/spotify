package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class o32 extends AbstractC0156e {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final o32 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile q2n0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private t32 aesCtrKey_;
    private v130 hmacKey_;
    private int version_;

    static {
        o32 o32Var = new o32();
        DEFAULT_INSTANCE = o32Var;
        AbstractC0156e.m1799l(o32.class, o32Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m66170n(o32 o32Var) {
        o32Var.version_ = 0;
    }

    /* JADX INFO: renamed from: o */
    public static void m66171o(o32 o32Var, t32 t32Var) {
        o32Var.getClass();
        t32Var.getClass();
        o32Var.aesCtrKey_ = t32Var;
    }

    /* JADX INFO: renamed from: p */
    public static void m66172p(o32 o32Var, v130 v130Var) {
        o32Var.getClass();
        v130Var.getClass();
        o32Var.hmacKey_ = v130Var;
    }

    /* JADX INFO: renamed from: t */
    public static n32 m66173t() {
        return (n32) DEFAULT_INSTANCE.m1802e();
    }

    /* JADX INFO: renamed from: u */
    public static o32 m66174u(fva fvaVar, ztx ztxVar) {
        return (o32) AbstractC0156e.m1797j(DEFAULT_INSTANCE, fvaVar, ztxVar);
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new o32();
            case 4:
                return new n32();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (o32.class) {
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
    public final t32 m66175q() {
        t32 t32Var = this.aesCtrKey_;
        return t32Var == null ? t32.m79947p() : t32Var;
    }

    /* JADX INFO: renamed from: r */
    public final v130 m66176r() {
        v130 v130Var = this.hmacKey_;
        return v130Var == null ? v130.m84436q() : v130Var;
    }

    /* JADX INFO: renamed from: s */
    public final int m66177s() {
        return this.version_;
    }
}
