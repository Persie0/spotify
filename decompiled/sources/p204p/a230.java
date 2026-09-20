package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes4.dex */
public final class a230 extends AbstractC0156e {
    private static final a230 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile q2n0 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        a230 a230Var = new a230();
        DEFAULT_INSTANCE = a230Var;
        AbstractC0156e.m1799l(a230.class, a230Var);
    }

    /* JADX INFO: renamed from: m */
    public static a230 m24482m() {
        return DEFAULT_INSTANCE;
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new a230();
            case 4:
                return new h32(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (a230.class) {
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
    public final sd20 m24483n() {
        sd20 sd20Var;
        int i = this.hash_;
        if (i == 0) {
            sd20Var = sd20.UNKNOWN_HASH;
        } else if (i == 1) {
            sd20Var = sd20.SHA1;
        } else if (i == 2) {
            sd20Var = sd20.SHA384;
        } else if (i != 3) {
            sd20Var = i != 4 ? null : sd20.SHA512;
        } else {
            sd20Var = sd20.SHA256;
        }
        return sd20Var == null ? sd20.UNRECOGNIZED : sd20Var;
    }

    /* JADX INFO: renamed from: o */
    public final int m24484o() {
        return this.tagSize_;
    }
}
