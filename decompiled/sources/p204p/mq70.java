package p204p;

import androidx.glance.appwidget.protobuf.AbstractC0059e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class mq70 extends AbstractC0059e {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final mq70 DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile p2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private yd50 children_ = g3t0.f76281d;
    private boolean hasAction_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        mq70 mq70Var = new mq70();
        DEFAULT_INSTANCE = mq70Var;
        AbstractC0059e.m669i(mq70.class, mq70Var);
    }

    /* JADX INFO: renamed from: l */
    public static void m62516l(mq70 mq70Var, nq70 nq70Var) {
        mq70Var.getClass();
        mq70Var.type_ = nq70Var.m65385a();
    }

    /* JADX INFO: renamed from: m */
    public static void m62517m(mq70 mq70Var, fq70 fq70Var) {
        mq70Var.getClass();
        mq70Var.width_ = fq70Var.m42398a();
    }

    /* JADX INFO: renamed from: n */
    public static void m62518n(mq70 mq70Var, fq70 fq70Var) {
        mq70Var.getClass();
        mq70Var.height_ = fq70Var.m42398a();
    }

    /* JADX INFO: renamed from: o */
    public static void m62519o(mq70 mq70Var, gq70 gq70Var) {
        mq70Var.getClass();
        mq70Var.horizontalAlignment_ = gq70Var.m45411a();
    }

    /* JADX INFO: renamed from: p */
    public static void m62520p(mq70 mq70Var, pq70 pq70Var) {
        mq70Var.getClass();
        mq70Var.verticalAlignment_ = pq70Var.m70621a();
    }

    /* JADX INFO: renamed from: q */
    public static void m62521q(mq70 mq70Var, eq70 eq70Var) {
        mq70Var.getClass();
        mq70Var.imageScale_ = eq70Var.m39723a();
    }

    /* JADX INFO: renamed from: r */
    public static void m62522r(mq70 mq70Var) {
        mq70Var.getClass();
        mq70Var.identity_ = oq70.BACKGROUND_NODE.m67609a();
    }

    /* JADX INFO: renamed from: s */
    public static void m62523s(mq70 mq70Var, boolean z) {
        mq70Var.hasAction_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static void m62524t(mq70 mq70Var, ArrayList arrayList) {
        yd50 yd50Var = mq70Var.children_;
        if (!((AbstractC1659a9) yd50Var).f13439a) {
            g3t0 g3t0Var = (g3t0) yd50Var;
            int i = g3t0Var.f76283c;
            mq70Var.children_ = g3t0Var.m43514d(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = mq70Var.children_;
        Charset charset = ce50.f37010a;
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(arrayList.size() + ((g3t0) randomAccess).f76283c);
        }
        g3t0 g3t0Var2 = (g3t0) randomAccess;
        int i2 = g3t0Var2.f76283c;
        for (Object obj : arrayList) {
            if (obj == null) {
                String str = "Element at index " + (g3t0Var2.f76283c - i2) + " is null.";
                for (int i3 = g3t0Var2.f76283c - 1; i3 >= i2; i3--) {
                    g3t0Var2.remove(i3);
                }
                throw new NullPointerException(str);
            }
            g3t0Var2.add(obj);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m62525u(mq70 mq70Var, boolean z) {
        mq70Var.hasImageDescription_ = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m62526v(mq70 mq70Var, boolean z) {
        mq70Var.hasImageColorFilter_ = z;
    }

    /* JADX INFO: renamed from: w */
    public static mq70 m62527w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static lq70 m62528x() {
        return (lq70) ((l110) DEFAULT_INSTANCE.mo670b(5));
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
                return new bbu0(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", mq70.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_"});
            case 3:
                return new mq70();
            case 4:
                return new lq70();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                p2n0 p2n0Var = PARSER;
                if (p2n0Var != null) {
                    return p2n0Var;
                }
                synchronized (mq70.class) {
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
}
