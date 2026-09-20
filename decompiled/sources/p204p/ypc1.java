package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public final class ypc1 extends AnimatorListenerAdapter implements x691 {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f274902a;

    /* JADX INFO: renamed from: b */
    public final View f274903b;

    /* JADX INFO: renamed from: c */
    public final View f274904c;

    /* JADX INFO: renamed from: d */
    public boolean f274905d = true;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ bqc1 f274906e;

    public ypc1(bqc1 bqc1Var, ViewGroup viewGroup, View view, View view2) {
        this.f274906e = bqc1Var;
        this.f274902a = viewGroup;
        this.f274903b = view;
        this.f274904c = view2;
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: b */
    public final void mo32231b(z691 z691Var) {
        if (this.f274905d) {
            m94299h();
        }
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: f */
    public final void mo32234f(z691 z691Var) {
        z691Var.mo55874G(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m94299h() {
        this.f274904c.setTag(R.id.save_overlay_view, null);
        this.f274902a.getOverlay().remove(this.f274903b);
        this.f274905d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m94299h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f274902a.getOverlay().remove(this.f274903b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f274903b;
        if (view.getParent() == null) {
            mec1.m61550b(view, this.f274902a);
        } else {
            this.f274906e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.f274904c;
            View view2 = this.f274903b;
            view.setTag(R.id.save_overlay_view, view2);
            mec1.m61550b(view2, this.f274902a);
            this.f274905d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        m94299h();
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: a */
    public final void mo32230a() {
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: c */
    public final void mo32232c() {
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: g */
    public final void mo32235g(z691 z691Var) {
    }
}
