package p204p;

import android.animation.Animator;
import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: classes6.dex */
public final class dwa implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53649a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EncoreButton f53650b;

    public /* synthetic */ dwa(EncoreButton encoreButton, int i) {
        this.f53649a = i;
        this.f53650b = encoreButton;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f53649a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f53649a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f53649a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f53649a) {
            case 0:
                this.f53650b.setVisibility(0);
                break;
            default:
                this.f53650b.setVisibility(0);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m37135a(Animator animator) {
    }

    /* JADX INFO: renamed from: b */
    private final void m37136b(Animator animator) {
    }

    /* JADX INFO: renamed from: c */
    private final void m37137c(Animator animator) {
    }

    /* JADX INFO: renamed from: d */
    private final void m37138d(Animator animator) {
    }

    /* JADX INFO: renamed from: e */
    private final void m37139e(Animator animator) {
    }

    /* JADX INFO: renamed from: f */
    private final void m37140f(Animator animator) {
    }
}
