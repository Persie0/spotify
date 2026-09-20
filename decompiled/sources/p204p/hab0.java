package p204p;

import android.graphics.PointF;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class hab0 extends qz8 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: L0 */
    public boolean f89174L0;

    /* JADX INFO: renamed from: X */
    public float f89175X;

    /* JADX INFO: renamed from: Y */
    public u8b0 f89176Y;

    /* JADX INFO: renamed from: Z */
    public boolean f89177Z;

    /* JADX INFO: renamed from: d */
    public float f89178d;

    /* JADX INFO: renamed from: e */
    public boolean f89179e;

    /* JADX INFO: renamed from: f */
    public long f89180f;

    /* JADX INFO: renamed from: g */
    public float f89181g;

    /* JADX INFO: renamed from: h */
    public float f89182h;

    /* JADX INFO: renamed from: i */
    public int f89183i;

    /* JADX INFO: renamed from: t */
    public float f89184t;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        super.m74292b();
        m74293c(m46926m());
        m46927q(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.f89177Z) {
            m46927q(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        u8b0 u8b0Var = this.f89176Y;
        if (u8b0Var == null || !this.f89177Z) {
            return;
        }
        long j2 = this.f89180f;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / ((1.0E9f / u8b0Var.f227895n) / Math.abs(this.f89178d));
        float f = this.f89181g;
        if (m46926m()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fM46925l = m46925l();
        float fM46924k = m46924k();
        PointF pointF = eff0.f59045a;
        if (f2 >= fM46925l && f2 <= fM46924k) {
            z = true;
        }
        float f3 = this.f89181g;
        float fM38732b = eff0.m38732b(f2, m46925l(), m46924k());
        this.f89181g = fM38732b;
        if (this.f89174L0) {
            fM38732b = (float) Math.floor(fM38732b);
        }
        this.f89182h = fM38732b;
        this.f89180f = j;
        if (!this.f89174L0 || this.f89181g != f3) {
            m74298i();
        }
        if (!z) {
            if (getRepeatCount() == -1 || this.f89183i < getRepeatCount()) {
                m74295e();
                this.f89183i++;
                if (getRepeatMode() == 2) {
                    this.f89179e = !this.f89179e;
                    this.f89178d = -this.f89178d;
                } else {
                    float fM46924k2 = m46926m() ? m46924k() : m46925l();
                    this.f89181g = fM46924k2;
                    this.f89182h = fM46924k2;
                }
                this.f89180f = j;
            } else {
                float fM46925l2 = this.f89178d < 0.0f ? m46925l() : m46924k();
                this.f89181g = fM46925l2;
                this.f89182h = fM46925l2;
                m46927q(true);
                m74293c(m46926m());
            }
        }
        if (this.f89176Y == null) {
            return;
        }
        float f4 = this.f89182h;
        if (f4 < this.f89184t || f4 > this.f89175X) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f89184t), Float.valueOf(this.f89175X), Float.valueOf(this.f89182h)));
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fM46925l;
        float fM46924k;
        float fM46925l2;
        if (this.f89176Y == null) {
            return 0.0f;
        }
        if (m46926m()) {
            fM46925l = m46924k() - this.f89182h;
            fM46924k = m46924k();
            fM46925l2 = m46925l();
        } else {
            fM46925l = this.f89182h - m46925l();
            fM46924k = m46924k();
            fM46925l2 = m46925l();
        }
        return fM46925l / (fM46924k - fM46925l2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(m46923j());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        u8b0 u8b0Var = this.f89176Y;
        if (u8b0Var == null) {
            return 0L;
        }
        return (long) u8b0Var.m82567b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f89177Z;
    }

    /* JADX INFO: renamed from: j */
    public final float m46923j() {
        u8b0 u8b0Var = this.f89176Y;
        if (u8b0Var == null) {
            return 0.0f;
        }
        float f = this.f89182h;
        float f2 = u8b0Var.f227893l;
        return (f - f2) / (u8b0Var.f227894m - f2);
    }

    /* JADX INFO: renamed from: k */
    public final float m46924k() {
        u8b0 u8b0Var = this.f89176Y;
        if (u8b0Var == null) {
            return 0.0f;
        }
        float f = this.f89175X;
        return f == 2.1474836E9f ? u8b0Var.f227894m : f;
    }

    /* JADX INFO: renamed from: l */
    public final float m46925l() {
        u8b0 u8b0Var = this.f89176Y;
        if (u8b0Var == null) {
            return 0.0f;
        }
        float f = this.f89184t;
        return f == -2.1474836E9f ? u8b0Var.f227893l : f;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m46926m() {
        return this.f89178d < 0.0f;
    }

    /* JADX INFO: renamed from: q */
    public final void m46927q(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f89177Z = false;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m46928r(float f) {
        if (this.f89181g == f) {
            return;
        }
        float fM38732b = eff0.m38732b(f, m46925l(), m46924k());
        this.f89181g = fM38732b;
        if (this.f89174L0) {
            fM38732b = (float) Math.floor(fM38732b);
        }
        this.f89182h = fM38732b;
        this.f89180f = 0L;
        m74298i();
    }

    /* JADX INFO: renamed from: s */
    public final void m46929s(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f2 + ")");
        }
        u8b0 u8b0Var = this.f89176Y;
        float f3 = u8b0Var == null ? -3.4028235E38f : u8b0Var.f227893l;
        float f4 = u8b0Var == null ? Float.MAX_VALUE : u8b0Var.f227894m;
        float fM38732b = eff0.m38732b(f, f3, f4);
        float fM38732b2 = eff0.m38732b(f2, f3, f4);
        if (fM38732b == this.f89184t && fM38732b2 == this.f89175X) {
            return;
        }
        this.f89184t = fM38732b;
        this.f89175X = fM38732b2;
        m46928r((int) eff0.m38732b(this.f89182h, fM38732b, fM38732b2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f89179e) {
            return;
        }
        this.f89179e = false;
        this.f89178d = -this.f89178d;
    }
}
