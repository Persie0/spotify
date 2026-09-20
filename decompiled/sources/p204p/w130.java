package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes4.dex */
public final class w130 extends AbstractC0156e {
    private static final w130 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile q2n0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private a230 params_;
    private int version_;

    static {
        w130 w130Var = new w130();
        DEFAULT_INSTANCE = w130Var;
        AbstractC0156e.m1799l(w130.class, w130Var);
    }

    /* JADX INFO: renamed from: m */
    public static w130 m86970m() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static w130 m86971p(fva fvaVar, ztx ztxVar) {
        return (w130) AbstractC0156e.m1797j(DEFAULT_INSTANCE, fvaVar, ztxVar);
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new w130();
            case 4:
                return new h32(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (w130.class) {
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
    public final int m86972n() {
        return this.keySize_;
    }

    /* JADX INFO: renamed from: o */
    public final a230 m86973o() {
        a230 a230Var = this.params_;
        return a230Var == null ? a230.m24482m() : a230Var;
    }
}
