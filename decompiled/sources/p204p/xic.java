package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class xic extends AbstractC0156e {
    private static final xic DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile q2n0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private fva keyValue_ = fva.f73739b;
    private int version_;

    static {
        xic xicVar = new xic();
        DEFAULT_INSTANCE = xicVar;
        AbstractC0156e.m1799l(xic.class, xicVar);
    }

    /* JADX INFO: renamed from: n */
    public static void m91110n(xic xicVar) {
        xicVar.version_ = 0;
    }

    /* JADX INFO: renamed from: o */
    public static void m91111o(xic xicVar, bva bvaVar) {
        xicVar.getClass();
        xicVar.keyValue_ = bvaVar;
    }

    /* JADX INFO: renamed from: r */
    public static wic m91112r() {
        return (wic) DEFAULT_INSTANCE.m1802e();
    }

    /* JADX INFO: renamed from: s */
    public static xic m91113s(fva fvaVar, ztx ztxVar) {
        return (xic) AbstractC0156e.m1797j(DEFAULT_INSTANCE, fvaVar, ztxVar);
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new xic();
            case 4:
                return new wic();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (xic.class) {
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

    /* JADX INFO: renamed from: p */
    public final fva m91114p() {
        return this.keyValue_;
    }

    /* JADX INFO: renamed from: q */
    public final int m91115q() {
        return this.version_;
    }
}
