package p204p;

import com.google.crypto.tink.shaded.protobuf.AbstractC0156e;

/* JADX INFO: loaded from: classes.dex */
public final class du60 extends AbstractC0156e {
    private static final du60 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile q2n0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private fva value_ = fva.f73739b;

    static {
        du60 du60Var = new du60();
        DEFAULT_INSTANCE = du60Var;
        AbstractC0156e.m1799l(du60.class, du60Var);
    }

    /* JADX INFO: renamed from: m */
    public static void m36901m(du60 du60Var, String str) {
        du60Var.getClass();
        str.getClass();
        du60Var.typeUrl_ = str;
    }

    /* JADX INFO: renamed from: n */
    public static void m36902n(du60 du60Var, bva bvaVar) {
        du60Var.getClass();
        du60Var.value_ = bvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m36903o(du60 du60Var, cu60 cu60Var) {
        du60Var.getClass();
        if (cu60Var != cu60.UNRECOGNIZED) {
            du60Var.keyMaterialType_ = cu60Var.f42065a;
        } else {
            cu60Var.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: renamed from: p */
    public static du60 m36904p() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static bu60 m36905t() {
        return (bu60) DEFAULT_INSTANCE.m1802e();
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
                return new cbu0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new du60();
            case 4:
                return new bu60(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q2n0 q2n0Var = PARSER;
                if (q2n0Var != null) {
                    return q2n0Var;
                }
                synchronized (du60.class) {
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

    /* JADX INFO: renamed from: q */
    public final cu60 m36906q() {
        cu60 cu60Var;
        int i = this.keyMaterialType_;
        if (i == 0) {
            cu60Var = cu60.UNKNOWN_KEYMATERIAL;
        } else if (i == 1) {
            cu60Var = cu60.SYMMETRIC;
        } else if (i == 2) {
            cu60Var = cu60.ASYMMETRIC_PRIVATE;
        } else if (i != 3) {
            cu60Var = i != 4 ? null : cu60.REMOTE;
        } else {
            cu60Var = cu60.ASYMMETRIC_PUBLIC;
        }
        return cu60Var == null ? cu60.UNRECOGNIZED : cu60Var;
    }

    /* JADX INFO: renamed from: r */
    public final String m36907r() {
        return this.typeUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final fva m36908s() {
        return this.value_;
    }
}
