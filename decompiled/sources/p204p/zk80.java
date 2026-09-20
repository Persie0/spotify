package p204p;

import android.animation.ObjectAnimator;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zk80 extends AbstractC2440u5 {

    /* JADX INFO: renamed from: X */
    public static final tjc f283676X = new tjc(8, Float.class, "animationFraction");

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f283677e;

    /* JADX INFO: renamed from: f */
    public final ydy f283678f;

    /* JADX INFO: renamed from: g */
    public final gl80 f283679g;

    /* JADX INFO: renamed from: h */
    public int f283680h;

    /* JADX INFO: renamed from: i */
    public boolean f283681i;

    /* JADX INFO: renamed from: t */
    public float f283682t;

    public zk80(gl80 gl80Var) {
        super(3);
        this.f283680h = 1;
        this.f283679g = gl80Var;
        this.f283678f = new ydy();
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: Q */
    public final void mo29745Q() {
        if (this.f283677e == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f283676X, 0.0f, 1.0f);
            this.f283677e = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f283677e.setInterpolator(null);
            this.f283677e.setRepeatCount(-1);
            this.f283677e.addListener(new z10(this, 8));
        }
        this.f283681i = true;
        this.f283680h = 1;
        Arrays.fill((int[]) this.f226863d, vtg1.m86385l(this.f283679g.f107387c[0], ((tn40) this.f226861b).f59398t));
        this.f283677e.start();
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: d */
    public final void mo29747d() {
        ObjectAnimator objectAnimator = this.f283677e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: x */
    public final void mo29748x() {
        this.f283681i = true;
        this.f283680h = 1;
        Arrays.fill((int[]) this.f226863d, vtg1.m86385l(this.f283679g.f107387c[0], ((tn40) this.f226861b).f59398t));
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: K */
    public final void mo29744K() {
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: S */
    public final void mo29746S() {
    }

    @Override // p204p.AbstractC2440u5
    /* JADX INFO: renamed from: G */
    public final void mo29743G(h09 h09Var) {
    }
}
