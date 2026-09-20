package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class v130 extends AbstractC0156e {
    private static final v130 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile q2n0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private fva keyValue_ = fva.f73739b;
    private a230 params_;
    private int version_;

    static {
        v130 v130Var = new v130();
        DEFAULT_INSTANCE = v130Var;
        AbstractC0156e.m1799l(v130.class, v130Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m84433n(v130 v130Var) {
        v130Var.version_ = 0;
    }

    /* JADX INFO: renamed from: o */
    public static void m84434o(v130 v130Var, a230 a230Var) {
        v130Var.getClass();
        a230Var.getClass();
        v130Var.params_ = a230Var;
    }

    /* JADX INFO: renamed from: p */
    public static void m84435p(v130 v130Var, bva bvaVar) {
        v130Var.getClass();
        v130Var.keyValue_ = bvaVar;
    }

    /* JADX INFO: renamed from: q */
    public static v130 m84436q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static u130 m84437u() {
        return (u130) DEFAULT_INSTANCE.m1802e();
    }

    /* JADX INFO: renamed from: v */
    public static v130 m84438v(fva fvaVar, ztx ztxVar) {
        return (v130) AbstractC0156e.m1797j(DEFAULT_INSTANCE, fvaVar, ztxVar);
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
                return new v130();
            case 4:
                return new u130();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (v130.class) {
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

    /* JADX INFO: renamed from: r */
    public final fva m84439r() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: s */
    public final a230 m84440s() {
        a230 a230Var = this.params_;
        return a230Var == null ? a230.m24482m() : a230Var;
    }

    /* JADX INFO: renamed from: t */
    public final int m84441t() {
        return this.version_;
    }
}
