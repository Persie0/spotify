package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class d42 extends AbstractC0156e {
    private static final d42 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile q2n0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private fva keyValue_ = fva.f73739b;
    private int version_;

    static {
        d42 d42Var = new d42();
        DEFAULT_INSTANCE = d42Var;
        AbstractC0156e.m1799l(d42.class, d42Var);
    }

    /* JADX INFO: renamed from: m */
    public static void m34899m(d42 d42Var) {
        d42Var.version_ = 0;
    }

    /* JADX INFO: renamed from: n */
    public static void m34900n(d42 d42Var, bva bvaVar) {
        d42Var.getClass();
        d42Var.keyValue_ = bvaVar;
    }

    /* JADX INFO: renamed from: q */
    public static c42 m34901q() {
        return (c42) DEFAULT_INSTANCE.m1802e();
    }

    /* JADX INFO: renamed from: r */
    public static d42 m34902r(fva fvaVar, ztx ztxVar) {
        return (d42) AbstractC0156e.m1797j(DEFAULT_INSTANCE, fvaVar, ztxVar);
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new d42();
            case 4:
                return new c42(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (d42.class) {
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

    /* JADX INFO: renamed from: o */
    public final fva m34903o() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: p */
    public final int m34904p() {
        return this.version_;
    }
}
