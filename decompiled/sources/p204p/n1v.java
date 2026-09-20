package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class n1v extends AbstractC0156e {
    private static final n1v DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile q2n0 PARSER;
    private fva encryptedKeyset_ = fva.f73739b;
    private m070 keysetInfo_;

    static {
        n1v n1vVar = new n1v();
        DEFAULT_INSTANCE = n1vVar;
        AbstractC0156e.m1799l(n1v.class, n1vVar);
    }

    /* JADX INFO: renamed from: m */
    public static void m63522m(n1v n1vVar, bva bvaVar) {
        n1vVar.getClass();
        n1vVar.encryptedKeyset_ = bvaVar;
    }

    /* JADX INFO: renamed from: n */
    public static void m63523n(n1v n1vVar, m070 m070Var) {
        n1vVar.getClass();
        n1vVar.keysetInfo_ = m070Var;
    }

    /* JADX INFO: renamed from: p */
    public static m1v m63524p() {
        return (m1v) DEFAULT_INSTANCE.m1802e();
    }

    /* JADX INFO: renamed from: q */
    public static n1v m63525q(byte[] bArr, ztx ztxVar) {
        return (n1v) AbstractC0156e.m1798k(DEFAULT_INSTANCE, bArr, ztxVar);
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new n1v();
            case 4:
                return new m1v(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (n1v.class) {
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
    public final fva m63526o() {
        return this.encryptedKeyset_;
    }
}
