package p204p;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class m1i0 {

    /* JADX INFO: renamed from: a */
    public float f138976a = Float.NaN;

    /* JADX INFO: renamed from: b */
    public float f138977b = Float.NaN;

    /* JADX INFO: renamed from: c */
    public int f138978c = -1;

    /* JADX INFO: renamed from: d */
    public int f138979d = -1;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ MotionLayout f138980e;

    public m1i0(MotionLayout motionLayout) {
        this.f138980e = motionLayout;
    }

    /* JADX INFO: renamed from: a */
    public final void m60537a() {
        int i = this.f138978c;
        MotionLayout motionLayout = this.f138980e;
        if (i != -1 || this.f138979d != -1) {
            if (i == -1) {
                motionLayout.m339N(this.f138979d);
            } else {
                int i2 = this.f138979d;
                if (i2 == -1) {
                    motionLayout.m336K(i);
                } else {
                    motionLayout.m337L(i, i2);
                }
            }
            motionLayout.setState(o1i0.f160765b);
        }
        if (Float.isNaN(this.f138977b)) {
            if (Float.isNaN(this.f138976a)) {
                return;
            }
            motionLayout.setProgress(this.f138976a);
        } else {
            motionLayout.m335J(this.f138976a, this.f138977b);
            this.f138976a = Float.NaN;
            this.f138977b = Float.NaN;
            this.f138978c = -1;
            this.f138979d = -1;
        }
    }
}
