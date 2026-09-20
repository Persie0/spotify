package p204p;

import android.animation.Animator;
import com.spotify.campaigns.paragraph.view.ParagraphView;

/* JADX INFO: loaded from: classes6.dex */
public final class qbm implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f187115a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ParagraphView f187116b;

    public /* synthetic */ qbm(ParagraphView paragraphView, int i) {
        this.f187115a = i;
        this.f187116b = paragraphView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f187115a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f187115a) {
            case 0:
                this.f187116b.setVisibility(8);
                break;
            default:
                this.f187116b.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f187115a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f187115a;
    }

    /* JADX INFO: renamed from: a */
    private final void m72495a(Animator animator) {
    }

    /* JADX INFO: renamed from: b */
    private final void m72496b(Animator animator) {
    }

    /* JADX INFO: renamed from: c */
    private final void m72497c(Animator animator) {
    }

    /* JADX INFO: renamed from: d */
    private final void m72498d(Animator animator) {
    }

    /* JADX INFO: renamed from: e */
    private final void m72499e(Animator animator) {
    }

    /* JADX INFO: renamed from: f */
    private final void m72500f(Animator animator) {
    }
}
