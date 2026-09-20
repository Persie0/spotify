package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class zlp extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f284042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ amp f284043b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f284044c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f284045d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ cmp f284046e;

    public /* synthetic */ zlp(cmp cmpVar, amp ampVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f284042a = i;
        this.f284046e = cmpVar;
        this.f284043b = ampVar;
        this.f284044c = viewPropertyAnimator;
        this.f284045d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f284042a) {
            case 0:
                this.f284044c.setListener(null);
                View view = this.f284045d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                amp ampVar = this.f284043b;
                dkv0 dkv0Var = ampVar.f17170a;
                cmp cmpVar = this.f284046e;
                cmpVar.m61992d(dkv0Var);
                cmpVar.f39755r.remove(ampVar.f17170a);
                cmpVar.m33404p();
                break;
            default:
                this.f284044c.setListener(null);
                View view2 = this.f284045d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                amp ampVar2 = this.f284043b;
                dkv0 dkv0Var2 = ampVar2.f17171b;
                cmp cmpVar2 = this.f284046e;
                cmpVar2.m61992d(dkv0Var2);
                cmpVar2.f39755r.remove(ampVar2.f17171b);
                cmpVar2.m33404p();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f284042a) {
            case 0:
                dkv0 dkv0Var = this.f284043b.f17170a;
                this.f284046e.getClass();
                break;
            default:
                dkv0 dkv0Var2 = this.f284043b.f17171b;
                this.f284046e.getClass();
                break;
        }
    }
}
