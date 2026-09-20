package p204p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class dln0 {

    /* JADX INFO: renamed from: i */
    public float f50266i;

    /* JADX INFO: renamed from: a */
    public float f50258a = -1.0f;

    /* JADX INFO: renamed from: b */
    public float f50259b = -1.0f;

    /* JADX INFO: renamed from: c */
    public float f50260c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f50261d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f50262e = -1.0f;

    /* JADX INFO: renamed from: f */
    public float f50263f = -1.0f;

    /* JADX INFO: renamed from: g */
    public float f50264g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f50265h = -1.0f;

    /* JADX INFO: renamed from: j */
    public final fln0 f50267j = new fln0(0, 0);

    /* JADX INFO: renamed from: a */
    public final void m36388a(ViewGroup.LayoutParams layoutParams, int i, int i2) {
        int i3 = layoutParams.width;
        fln0 fln0Var = this.f50267j;
        ((ViewGroup.MarginLayoutParams) fln0Var).width = i3;
        int i4 = layoutParams.height;
        ((ViewGroup.MarginLayoutParams) fln0Var).height = i4;
        boolean z = false;
        boolean z2 = (fln0Var.f70829b || i3 == 0) && this.f50258a < 0.0f;
        if ((fln0Var.f70828a || i4 == 0) && this.f50259b < 0.0f) {
            z = true;
        }
        float f = this.f50258a;
        if (f >= 0.0f) {
            layoutParams.width = Math.round(i * f);
        }
        float f2 = this.f50259b;
        if (f2 >= 0.0f) {
            layoutParams.height = Math.round(i2 * f2);
        }
        float f3 = this.f50266i;
        if (f3 >= 0.0f) {
            if (z2) {
                layoutParams.width = Math.round(layoutParams.height * f3);
                fln0Var.f70829b = true;
            }
            if (z) {
                layoutParams.height = Math.round(layoutParams.width / this.f50266i);
                fln0Var.f70828a = true;
            }
        }
    }

    public final String toString() {
        return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", Float.valueOf(this.f50258a), Float.valueOf(this.f50259b), Float.valueOf(this.f50260c), Float.valueOf(this.f50261d), Float.valueOf(this.f50262e), Float.valueOf(this.f50263f), Float.valueOf(this.f50264g), Float.valueOf(this.f50265h));
    }
}
