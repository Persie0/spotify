package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class m070 extends AbstractC0156e {
    private static final m070 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile q2n0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private zd50 keyInfo_ = h3t0.f87315d;
    private int primaryKeyId_;

    static {
        m070 m070Var = new m070();
        DEFAULT_INSTANCE = m070Var;
        AbstractC0156e.m1799l(m070.class, m070Var);
    }

    /* JADX INFO: renamed from: m */
    public static void m60416m(m070 m070Var, int i) {
        m070Var.primaryKeyId_ = i;
    }

    /* JADX INFO: renamed from: n */
    public static void m60417n(m070 m070Var, l070 l070Var) {
        m070Var.getClass();
        zd50 zd50Var = m070Var.keyInfo_;
        if (!((AbstractC1696b9) zd50Var).f24728a) {
            int size = zd50Var.size();
            m070Var.keyInfo_ = zd50Var.mo46604h(size == 0 ? 10 : size * 2);
        }
        m070Var.keyInfo_.add(l070Var);
    }

    /* JADX INFO: renamed from: p */
    public static j070 m60418p() {
        return (j070) DEFAULT_INSTANCE.m1802e();
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", l070.class});
            case 3:
                return new m070();
            case 4:
                return new j070(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (m070.class) {
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
    public final l070 m60419o() {
        return (l070) this.keyInfo_.get(0);
    }
}
