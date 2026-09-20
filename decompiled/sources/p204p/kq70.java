package p204p;

import androidx.glance.appwidget.protobuf.AbstractC0059e;

/* JADX INFO: loaded from: classes.dex */
public final class kq70 extends AbstractC0059e {
    private static final kq70 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile p2n0 PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private mq70 layout_;

    static {
        kq70 kq70Var = new kq70();
        DEFAULT_INSTANCE = kq70Var;
        AbstractC0059e.m669i(kq70.class, kq70Var);
    }

    /* JADX INFO: renamed from: k */
    public static void m57081k(kq70 kq70Var, mq70 mq70Var) {
        kq70Var.getClass();
        mq70Var.getClass();
        kq70Var.layout_ = mq70Var;
        kq70Var.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: l */
    public static void m57082l(kq70 kq70Var, int i) {
        kq70Var.layoutIndex_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static jq70 m57083o() {
        return (jq70) ((l110) DEFAULT_INSTANCE.mo670b(5));
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0059e
    /* JADX INFO: renamed from: b */
    public final Object mo670b(int i) {
        p2n0 p110Var;
        switch (edb.m38547C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new bbu0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new kq70();
            case 4:
                return new jq70(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                p2n0 p2n0Var = PARSER;
                if (p2n0Var != null) {
                    return p2n0Var;
                }
                synchronized (kq70.class) {
                    try {
                        p110Var = PARSER;
                        if (p110Var == null) {
                            p110Var = new p110();
                            PARSER = p110Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return p110Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: m */
    public final mq70 m57084m() {
        mq70 mq70Var = this.layout_;
        return mq70Var == null ? mq70.m62527w() : mq70Var;
    }

    /* JADX INFO: renamed from: n */
    public final int m57085n() {
        return this.layoutIndex_;
    }
}
