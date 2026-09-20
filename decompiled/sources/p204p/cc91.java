package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class cc91 extends AnimatorListenerAdapter implements x691 {

    /* JADX INFO: renamed from: a */
    public final View f36354a;

    /* JADX INFO: renamed from: b */
    public final View f36355b;

    /* JADX INFO: renamed from: c */
    public int[] f36356c;

    /* JADX INFO: renamed from: d */
    public float f36357d;

    /* JADX INFO: renamed from: e */
    public float f36358e;

    /* JADX INFO: renamed from: f */
    public final float f36359f;

    /* JADX INFO: renamed from: g */
    public final float f36360g;

    /* JADX INFO: renamed from: h */
    public boolean f36361h;

    public cc91(View view, View view2, float f, float f2) {
        this.f36355b = view;
        this.f36354a = view2;
        this.f36359f = f;
        this.f36360g = f2;
        int[] iArr = (int[]) view2.getTag(R.id.transition_position);
        this.f36356c = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transition_position, null);
        }
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: a */
    public final void mo32230a() {
        if (this.f36356c == null) {
            this.f36356c = new int[2];
        }
        int[] iArr = this.f36356c;
        View view = this.f36355b;
        view.getLocationOnScreen(iArr);
        this.f36354a.setTag(R.id.transition_position, this.f36356c);
        this.f36357d = view.getTranslationX();
        this.f36358e = view.getTranslationY();
        view.setTranslationX(this.f36359f);
        view.setTranslationY(this.f36360g);
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: b */
    public final void mo32231b(z691 z691Var) {
        this.f36361h = true;
        float f = this.f36359f;
        View view = this.f36355b;
        view.setTranslationX(f);
        view.setTranslationY(this.f36360g);
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: c */
    public final void mo32232c() {
        float f = this.f36357d;
        View view = this.f36355b;
        view.setTranslationX(f);
        view.setTranslationY(this.f36358e);
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: d */
    public final void mo32233d(z691 z691Var) {
        if (this.f36361h) {
            return;
        }
        this.f36354a.setTag(R.id.transition_position, null);
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: f */
    public final void mo32234f(z691 z691Var) {
        mo32233d(z691Var);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f36361h = true;
        float f = this.f36359f;
        View view = this.f36355b;
        view.setTranslationX(f);
        view.setTranslationY(this.f36360g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        float f = this.f36359f;
        View view = this.f36355b;
        view.setTranslationX(f);
        view.setTranslationY(this.f36360g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // p204p.x691
    /* JADX INFO: renamed from: g */
    public final void mo32235g(z691 z691Var) {
    }
}
