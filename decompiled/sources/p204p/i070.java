package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i070 extends AbstractC0156e {
    private static final i070 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile q2n0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private zd50 key_ = h3t0.f87315d;
    private int primaryKeyId_;

    static {
        i070 i070Var = new i070();
        DEFAULT_INSTANCE = i070Var;
        AbstractC0156e.m1799l(i070.class, i070Var);
    }

    /* JADX INFO: renamed from: m */
    public static void m49299m(i070 i070Var, int i) {
        i070Var.primaryKeyId_ = i;
    }

    /* JADX INFO: renamed from: n */
    public static void m49300n(i070 i070Var, h070 h070Var) {
        i070Var.getClass();
        zd50 zd50Var = i070Var.key_;
        if (!((AbstractC1696b9) zd50Var).f24728a) {
            int size = zd50Var.size();
            i070Var.key_ = zd50Var.mo46604h(size == 0 ? 10 : size * 2);
        }
        i070Var.key_.add(h070Var);
    }

    /* JADX INFO: renamed from: s */
    public static f070 m49301s() {
        return (f070) DEFAULT_INSTANCE.m1802e();
    }

    /* JADX INFO: renamed from: t */
    public static i070 m49302t(byte[] bArr, ztx ztxVar) {
        return (i070) AbstractC0156e.m1798k(DEFAULT_INSTANCE, bArr, ztxVar);
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", h070.class});
            case 3:
                return new i070();
            case 4:
                return new f070(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (i070.class) {
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
    public final h070 m49303o(int i) {
        return (h070) this.key_.get(i);
    }

    /* JADX INFO: renamed from: p */
    public final int m49304p() {
        return this.key_.size();
    }

    /* JADX INFO: renamed from: q */
    public final List m49305q() {
        return this.key_;
    }

    /* JADX INFO: renamed from: r */
    public final int m49306r() {
        return this.primaryKeyId_;
    }
}
