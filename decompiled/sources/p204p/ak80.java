package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ak80 {

    /* JADX INFO: renamed from: b */
    public static final float f16456b;

    /* JADX INFO: renamed from: c */
    public static final float f16457c;

    /* JADX INFO: renamed from: d */
    public static final float f16458d;

    /* JADX INFO: renamed from: a */
    public final float f16459a;

    static {
        m26200a(0.0f);
        m26200a(0.5f);
        f16456b = 0.5f;
        m26200a(-1.0f);
        f16457c = -1.0f;
        m26200a(1.0f);
        f16458d = 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public static void m26200a(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            nt40.m65599c("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m26201b(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == f16456b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == f16457c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == f16458d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ak80) {
            return Float.compare(this.f16459a, ((ak80) obj).f16459a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16459a);
    }

    public final String toString() {
        return m26201b(this.f16459a);
    }
}
