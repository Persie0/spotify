package p204p;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class xdq implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f260520a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f260521b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f260522c;

    public /* synthetic */ xdq(int i, Object obj, Object obj2) {
        this.f260520a = i;
        this.f260521b = obj;
        this.f260522c = obj2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f260520a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f260520a) {
            case 0:
                break;
            case 1:
                bc21 bc21Var = ((klv) this.f260521b).f65135c;
                if (bc21Var != null) {
                    ((jva1) bc21Var.f25759b).f116294a.onNext(gva1.f84712a);
                }
                break;
            default:
                ((ParagraphView) this.f260521b).setVisibility(8);
                ((ParagraphView) this.f260522c).setVisibility(8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f260520a) {
            case 0:
                deq deqVar = (deq) this.f260521b;
                if (!deqVar.f48144X) {
                    ((ValueAnimator) this.f260522c).cancel();
                    deqVar.f48148c.setSecondaryProgress(0);
                    ((Drawable) deqVar.f48153h.getValue()).setAlpha(0);
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f260520a) {
            case 1:
                Iterator it = ((List) this.f260522c).iterator();
                while (it.hasNext()) {
                    ((ParagraphView) it.next()).setVisibility(0);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m90421a(Animator animator) {
    }

    /* JADX INFO: renamed from: b */
    private final void m90422b(Animator animator) {
    }

    /* JADX INFO: renamed from: c */
    private final void m90423c(Animator animator) {
    }

    /* JADX INFO: renamed from: d */
    private final void m90424d(Animator animator) {
    }

    /* JADX INFO: renamed from: e */
    private final void m90425e(Animator animator) {
    }

    /* JADX INFO: renamed from: f */
    private final void m90426f(Animator animator) {
    }

    /* JADX INFO: renamed from: g */
    private final void m90427g(Animator animator) {
    }

    /* JADX INFO: renamed from: h */
    private final void m90428h(Animator animator) {
    }
}
