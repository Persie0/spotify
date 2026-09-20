package p204p;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class jlv implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113689a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f113690b;

    public /* synthetic */ jlv(View view, int i) {
        this.f113689a = i;
        this.f113690b = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f113689a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f113689a) {
            case 0:
                break;
            case 1:
                this.f113690b.setVisibility(8);
                break;
            default:
                this.f113690b.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f113689a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f113689a) {
            case 0:
                this.f113690b.setVisibility(0);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m53718a(Animator animator) {
    }

    /* JADX INFO: renamed from: b */
    private final void m53719b(Animator animator) {
    }

    /* JADX INFO: renamed from: c */
    private final void m53720c(Animator animator) {
    }

    /* JADX INFO: renamed from: d */
    private final void m53721d(Animator animator) {
    }

    /* JADX INFO: renamed from: e */
    private final void m53722e(Animator animator) {
    }

    /* JADX INFO: renamed from: f */
    private final void m53723f(Animator animator) {
    }

    /* JADX INFO: renamed from: g */
    private final void m53724g(Animator animator) {
    }

    /* JADX INFO: renamed from: h */
    private final void m53725h(Animator animator) {
    }

    /* JADX INFO: renamed from: i */
    private final void m53726i(Animator animator) {
    }
}
