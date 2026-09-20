package p204p;

import android.animation.Animator;

/* JADX INFO: loaded from: classes6.dex */
public final class bwa implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f31592a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zv41 f31593b;

    public /* synthetic */ bwa(zv41 zv41Var, int i) {
        this.f31592a = i;
        this.f31593b = zv41Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f31592a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31592a) {
            case 0:
                break;
            case 1:
                this.f31593b.m97091m(null, Boolean.FALSE);
                break;
            case 2:
                break;
            case 3:
                this.f31593b.m97091m(null, Boolean.FALSE);
                break;
            default:
                this.f31593b.m97091m(null, Boolean.FALSE);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f31592a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f31592a) {
            case 0:
                this.f31593b.m97091m(null, Boolean.TRUE);
                break;
            case 2:
                this.f31593b.m97091m(null, Boolean.TRUE);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m30662a(Animator animator) {
    }

    /* JADX INFO: renamed from: b */
    private final void m30663b(Animator animator) {
    }

    /* JADX INFO: renamed from: c */
    private final void m30664c(Animator animator) {
    }

    /* JADX INFO: renamed from: d */
    private final void m30665d(Animator animator) {
    }

    /* JADX INFO: renamed from: e */
    private final void m30666e(Animator animator) {
    }

    /* JADX INFO: renamed from: f */
    private final void m30667f(Animator animator) {
    }

    /* JADX INFO: renamed from: g */
    private final void m30668g(Animator animator) {
    }

    /* JADX INFO: renamed from: h */
    private final void m30669h(Animator animator) {
    }

    /* JADX INFO: renamed from: i */
    private final void m30670i(Animator animator) {
    }

    /* JADX INFO: renamed from: j */
    private final void m30671j(Animator animator) {
    }

    /* JADX INFO: renamed from: k */
    private final void m30672k(Animator animator) {
    }

    /* JADX INFO: renamed from: l */
    private final void m30673l(Animator animator) {
    }

    /* JADX INFO: renamed from: m */
    private final void m30674m(Animator animator) {
    }

    /* JADX INFO: renamed from: n */
    private final void m30675n(Animator animator) {
    }

    /* JADX INFO: renamed from: o */
    private final void m30676o(Animator animator) {
    }
}
