package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.spotify.encoreconsumermobile.elements.playindicator.PlayIndicatorView;

/* JADX INFO: loaded from: classes6.dex */
public final class glo0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f81123a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlayIndicatorView f81124b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ r9b0 f81125c;

    public glo0(int i, PlayIndicatorView playIndicatorView, r9b0 r9b0Var) {
        this.f81123a = i;
        this.f81124b = playIndicatorView;
        this.f81125c = r9b0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r9b0 pausedDrawable;
        int i = this.f81123a;
        PlayIndicatorView playIndicatorView = this.f81124b;
        if (i == 1) {
            playIndicatorView.getPlayingDrawable().m75030k();
            pausedDrawable = playIndicatorView.getPlayingDrawable();
        } else {
            pausedDrawable = playIndicatorView.getPausedDrawable();
        }
        playIndicatorView.setImageDrawable(pausedDrawable);
        this.f81125c.f196990b.removeAllListeners();
        playIndicatorView.f3706T0 = false;
    }
}
