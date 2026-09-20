package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class xpc1 extends AnimatorListenerAdapter implements x691 {

    /* JADX INFO: renamed from: a */
    public final View f264604a;

    /* JADX INFO: renamed from: b */
    public final int f264605b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f264606c;

    /* JADX INFO: renamed from: e */
    public boolean f264608e;

    /* JADX INFO: renamed from: f */
    public boolean f264609f = false;

    /* JADX INFO: renamed from: d */
    public final boolean f264607d = true;

    public xpc1(View view, int i) {
        this.f264604a = view;
        this.f264605b = i;
        this.f264606c = (ViewGroup) view.getParent();
        m91668h(true);
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: a */
    public final void mo32230a() {
        m91668h(false);
        if (this.f264609f) {
            return;
        }
        bpc1.m30115b(this.f264604a, this.f264605b);
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: c */
    public final void mo32232c() {
        m91668h(true);
        if (this.f264609f) {
            return;
        }
        bpc1.m30115b(this.f264604a, 0);
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: f */
    public final void mo32234f(z691 z691Var) {
        z691Var.mo55874G(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m91668h(boolean z) {
        ViewGroup viewGroup;
        if (!this.f264607d || this.f264608e == z || (viewGroup = this.f264606c) == null) {
            return;
        }
        this.f264608e = z;
        mif1.m61858K(viewGroup, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f264609f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f264609f) {
            bpc1.m30115b(this.f264604a, this.f264605b);
            ViewGroup viewGroup = this.f264606c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m91668h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            bpc1.m30115b(this.f264604a, 0);
            ViewGroup viewGroup = this.f264606c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.f264609f) {
            bpc1.m30115b(this.f264604a, this.f264605b);
            ViewGroup viewGroup = this.f264606c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m91668h(false);
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: b */
    public final void mo32231b(z691 z691Var) {
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: g */
    public final void mo32235g(z691 z691Var) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
