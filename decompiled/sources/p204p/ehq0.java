package p204p;

import androidx.datastore.preferences.protobuf.AbstractC0048e;

/* JADX INFO: loaded from: classes.dex */
public final class ehq0 extends AbstractC0048e {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final ehq0 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile t2n0 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ehq0 ehq0Var = new ehq0();
        DEFAULT_INSTANCE = ehq0Var;
        AbstractC0048e.m520h(ehq0.class, ehq0Var);
    }

    /* JADX INFO: renamed from: i */
    public static void m38980i(ehq0 ehq0Var, long j) {
        ehq0Var.valueCase_ = 4;
        ehq0Var.value_ = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: j */
    public static void m38981j(ehq0 ehq0Var, String str) {
        ehq0Var.getClass();
        ehq0Var.valueCase_ = 5;
        ehq0Var.value_ = str;
    }

    /* JADX INFO: renamed from: k */
    public static void m38982k(ehq0 ehq0Var, bhq0 bhq0Var) {
        ehq0Var.getClass();
        ehq0Var.value_ = bhq0Var.m66037b();
        ehq0Var.valueCase_ = 6;
    }

    /* JADX INFO: renamed from: l */
    public static void m38983l(ehq0 ehq0Var, double d) {
        ehq0Var.valueCase_ = 7;
        ehq0Var.value_ = Double.valueOf(d);
    }

    /* JADX INFO: renamed from: m */
    public static void m38984m(ehq0 ehq0Var, boolean z) {
        ehq0Var.valueCase_ = 1;
        ehq0Var.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: n */
    public static void m38985n(ehq0 ehq0Var, float f) {
        ehq0Var.valueCase_ = 2;
        ehq0Var.value_ = Float.valueOf(f);
    }

    /* JADX INFO: renamed from: o */
    public static void m38986o(ehq0 ehq0Var, int i) {
        ehq0Var.valueCase_ = 3;
        ehq0Var.value_ = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: q */
    public static ehq0 m38987q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static dhq0 m38988y() {
        return (dhq0) ((o110) DEFAULT_INSTANCE.mo521d(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0048e
    /* JADX INFO: renamed from: d */
    public final Object mo521d(int i) {
        t2n0 s110Var;
        switch (edb.m38547C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ebu0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", chq0.class});
            case 3:
                return new ehq0();
            case 4:
                return new dhq0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t2n0 t2n0Var = PARSER;
                if (t2n0Var != null) {
                    return t2n0Var;
                }
                synchronized (ehq0.class) {
                    try {
                        s110Var = PARSER;
                        if (s110Var == null) {
                            s110Var = new s110();
                            PARSER = s110Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return s110Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m38989p() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final double m38990r() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: s */
    public final float m38991s() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: t */
    public final int m38992t() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public final long m38993u() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: v */
    public final String m38994v() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: w */
    public final chq0 m38995w() {
        return this.valueCase_ == 6 ? (chq0) this.value_ : chq0.m32809k();
    }

    /* JADX INFO: renamed from: x */
    public final int m38996x() {
        return m5p0.m60869a(this.valueCase_);
    }
}
