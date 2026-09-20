package p204p;

import android.animation.Animator;
import android.widget.ImageView;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: classes6.dex */
public final class awa implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ParagraphView f20441a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EncoreButton f20442b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ImageView f20443c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ImageView f20444d;

    public awa(ParagraphView paragraphView, EncoreButton encoreButton, ImageView imageView, ImageView imageView2) {
        this.f20441a = paragraphView;
        this.f20442b = encoreButton;
        this.f20443c = imageView;
        this.f20444d = imageView2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f20441a.setVisibility(8);
        this.f20442b.setVisibility(8);
        this.f20443c.setVisibility(8);
        this.f20444d.setVisibility(8);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
