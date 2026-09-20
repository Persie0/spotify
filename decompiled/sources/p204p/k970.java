package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes4.dex */
public final class k970 extends AbstractC0156e {
    private static final k970 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile q2n0 PARSER;
    private String keyUri_ = "";

    static {
        k970 k970Var = new k970();
        DEFAULT_INSTANCE = k970Var;
        AbstractC0156e.m1799l(k970.class, k970Var);
    }

    /* JADX INFO: renamed from: m */
    public static k970 m55770m() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static k970 m55771o(fva fvaVar, ztx ztxVar) {
        return (k970) AbstractC0156e.m1797j(DEFAULT_INSTANCE, fvaVar, ztxVar);
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 3:
                return new k970();
            case 4:
                return new h32(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (k970.class) {
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
    public final String m55772n() {
        return this.keyUri_;
    }
}
