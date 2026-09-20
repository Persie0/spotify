package p204p;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class k1i0 extends j1i0 {

    /* JADX INFO: renamed from: a */
    public float f118355a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f118356b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f118357c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ MotionLayout f118358d;

    public k1i0(MotionLayout motionLayout) {
        this.f118358d = motionLayout;
    }

    @Override // p204p.j1i0
    /* JADX INFO: renamed from: a */
    public final float mo52165a() {
        return this.f118358d.f657U0;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.f118355a;
        MotionLayout motionLayout = this.f118358d;
        if (f2 > 0.0f) {
            float f3 = this.f118357c;
            if (f2 / f3 < f) {
                f = f2 / f3;
            }
            motionLayout.f657U0 = f2 - (f3 * f);
            return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.f118356b;
        }
        float f4 = this.f118357c;
        if ((-f2) / f4 < f) {
            f = (-f2) / f4;
        }
        motionLayout.f657U0 = (f4 * f) + f2;
        return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.f118356b;
    }
}
