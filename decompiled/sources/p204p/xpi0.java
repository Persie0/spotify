package p204p;

import android.view.View;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class xpi0 {

    /* JADX INFO: renamed from: a */
    public float f264671a;

    /* JADX INFO: renamed from: b */
    public float f264672b;

    /* JADX INFO: renamed from: c */
    public float f264673c;

    /* JADX INFO: renamed from: d */
    public float f264674d;

    /* JADX INFO: renamed from: e */
    public float f264675e;

    /* JADX INFO: renamed from: f */
    public float f264676f;

    public xpi0(float f, float f2, float f3, float f4) {
        this.f264671a = f;
        this.f264672b = f2;
        this.f264673c = f3;
        this.f264674d = f4;
        this.f264675e = f3 - f;
        this.f264676f = f4 - f2;
    }

    /* JADX INFO: renamed from: a */
    public final void m91705a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        this.f264671a = f;
        this.f264672b = f2;
        this.f264673c = f + view.getWidth();
        this.f264674d = f2 + view.getHeight();
        this.f264675e = view.getWidth();
        this.f264676f = view.getHeight();
    }

    /* JADX INFO: renamed from: b */
    public final void m91706b(xpi0 xpi0Var) {
        this.f264671a = xpi0Var.f264671a;
        this.f264672b = xpi0Var.f264672b;
        this.f264673c = xpi0Var.f264673c;
        this.f264674d = xpi0Var.f264674d;
        this.f264675e = xpi0Var.f264675e;
        this.f264676f = xpi0Var.f264676f;
    }

    /* JADX INFO: renamed from: c */
    public final float m91707c() {
        return (this.f264672b + this.f264674d) / 2.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m91708d(float f, float f2, float f3, float f4) {
        float fMax = Math.max(this.f264671a, f);
        float fMax2 = Math.max(this.f264672b, f2);
        m91706b(new xpi0(fMax, fMax2, Math.max(fMax, Math.min(this.f264673c, f3)), Math.max(fMax2, Math.min(this.f264674d, f4))));
    }

    /* JADX INFO: renamed from: e */
    public final float m91709e(xpi0 xpi0Var) {
        return (Math.min(this.f264674d, xpi0Var.f264674d) - Math.max(this.f264672b, xpi0Var.f264672b)) / this.f264676f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xpi0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xpi0 xpi0Var = (xpi0) obj;
        return this.f264671a == xpi0Var.f264671a && this.f264672b == xpi0Var.f264672b && this.f264673c == xpi0Var.f264673c && this.f264674d == xpi0Var.f264674d && this.f264675e == xpi0Var.f264675e && this.f264676f == xpi0Var.f264676f;
    }

    public final int hashCode() {
        return Float.hashCode(this.f264676f) + AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f264671a) * 31, 31, this.f264672b), 31, this.f264673c), 31, this.f264674d), 31, this.f264675e);
    }

    public final String toString() {
        return "Rect(" + this.f264671a + ", " + this.f264672b + ", " + this.f264675e + ", " + this.f264676f + ")";
    }

    public /* synthetic */ xpi0() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
