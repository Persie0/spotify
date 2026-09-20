package p204p;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class nv50 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final float f158792a;

    /* JADX INFO: renamed from: b */
    public final float f158793b;

    /* JADX INFO: renamed from: c */
    public final float f158794c;

    /* JADX INFO: renamed from: d */
    public final float f158795d;

    /* JADX INFO: renamed from: e */
    public final dkv0 f158796e;

    /* JADX INFO: renamed from: f */
    public final int f158797f;

    /* JADX INFO: renamed from: g */
    public final ValueAnimator f158798g;

    /* JADX INFO: renamed from: h */
    public boolean f158799h;

    /* JADX INFO: renamed from: i */
    public float f158800i;

    /* JADX INFO: renamed from: j */
    public float f158801j;

    /* JADX INFO: renamed from: k */
    public boolean f158802k = false;

    /* JADX INFO: renamed from: l */
    public boolean f158803l = false;

    /* JADX INFO: renamed from: m */
    public float f158804m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f158805n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ dkv0 f158806o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ qv50 f158807p;

    public nv50(qv50 qv50Var, dkv0 dkv0Var, int i, float f, float f2, float f3, float f4, int i2, dkv0 dkv0Var2) {
        this.f158807p = qv50Var;
        this.f158805n = i2;
        this.f158806o = dkv0Var2;
        this.f158797f = i;
        this.f158796e = dkv0Var;
        this.f158792a = f;
        this.f158793b = f2;
        this.f158794c = f3;
        this.f158795d = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f158798g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new rx4(this, 12));
        valueAnimatorOfFloat.setTarget(dkv0Var.f50039a);
        valueAnimatorOfFloat.addListener(this);
        this.f158804m = 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m65725a(Animator animator) {
        if (!this.f158803l) {
            this.f158796e.m36318A(true);
        }
        this.f158803l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f158804m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m65725a(animator);
        if (this.f158802k) {
            return;
        }
        int i = this.f158805n;
        dkv0 dkv0Var = this.f158806o;
        qv50 qv50Var = this.f158807p;
        if (i <= 0) {
            qv50Var.f192891Y.mo68121a(qv50Var.f192880O0, dkv0Var);
        } else {
            qv50Var.f192894a.add(dkv0Var.f50039a);
            this.f158799h = true;
            if (i > 0) {
                qv50Var.f192880O0.post(new ti3((Object) qv50Var, (Object) this, i, 6, false));
            }
        }
        View view = qv50Var.f192885T0;
        View view2 = dkv0Var.f50039a;
        if (view == view2) {
            qv50Var.m73971r(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
