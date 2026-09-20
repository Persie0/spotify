package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes4.dex */
public final class i32 extends AbstractC0156e {
    private static final i32 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile q2n0 PARSER;
    private int keySize_;
    private m32 params_;

    static {
        i32 i32Var = new i32();
        DEFAULT_INSTANCE = i32Var;
        AbstractC0156e.m1799l(i32.class, i32Var);
    }

    /* JADX INFO: renamed from: o */
    public static i32 m49537o(fva fvaVar, ztx ztxVar) {
        return (i32) AbstractC0156e.m1797j(DEFAULT_INSTANCE, fvaVar, ztxVar);
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new i32();
            case 4:
                return new h32(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (i32.class) {
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
    public final int m49538m() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: n */
    public final m32 m49539n() {
        m32 m32Var = this.params_;
        return m32Var == null ? m32.m60623m() : m32Var;
    }
}
