package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes4.dex */
public final class p32 extends AbstractC0156e {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final p32 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile q2n0 PARSER;
    private u32 aesCtrKeyFormat_;
    private w130 hmacKeyFormat_;

    static {
        p32 p32Var = new p32();
        DEFAULT_INSTANCE = p32Var;
        AbstractC0156e.m1799l(p32.class, p32Var);
    }

    /* JADX INFO: renamed from: o */
    public static p32 m68980o(fva fvaVar, ztx ztxVar) {
        return (p32) AbstractC0156e.m1797j(DEFAULT_INSTANCE, fvaVar, ztxVar);
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new p32();
            case 4:
                return new h32(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (p32.class) {
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

    /* JADX INFO: renamed from: m */
    public final u32 m68981m() {
        u32 u32Var = this.aesCtrKeyFormat_;
        return u32Var == null ? u32.m82263m() : u32Var;
    }

    /* JADX INFO: renamed from: n */
    public final w130 m68982n() {
        w130 w130Var = this.hmacKeyFormat_;
        return w130Var == null ? w130.m86970m() : w130Var;
    }
}
