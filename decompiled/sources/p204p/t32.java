package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes4.dex */
public final class t32 extends AbstractC0156e {
    private static final t32 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile q2n0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private fva keyValue_ = fva.f73739b;
    private v32 params_;
    private int version_;

    static {
        t32 t32Var = new t32();
        DEFAULT_INSTANCE = t32Var;
        AbstractC0156e.m1799l(t32.class, t32Var);
    }

    /* JADX INFO: renamed from: m */
    public static void m79944m(t32 t32Var) {
        t32Var.version_ = 0;
    }

    /* JADX INFO: renamed from: n */
    public static void m79945n(t32 t32Var, v32 v32Var) {
        t32Var.getClass();
        v32Var.getClass();
        t32Var.params_ = v32Var;
    }

    /* JADX INFO: renamed from: o */
    public static void m79946o(t32 t32Var, bva bvaVar) {
        t32Var.getClass();
        t32Var.keyValue_ = bvaVar;
    }

    /* JADX INFO: renamed from: p */
    public static t32 m79947p() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static s32 m79948t() {
        return (s32) DEFAULT_INSTANCE.m1802e();
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new t32();
            case 4:
                return new s32(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (t32.class) {
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
    public final fva m79949q() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: r */
    public final v32 m79950r() {
        v32 v32Var = this.params_;
        return v32Var == null ? v32.m84529m() : v32Var;
    }

    /* JADX INFO: renamed from: s */
    public final int m79951s() {
        return this.version_;
    }
}
