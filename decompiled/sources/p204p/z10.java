package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import com.spotify.messaging.messagingplatformimpl.slate.SlateView;
import com.spotify.yourlibrary.yourlibraryx.shared.offlinesync.DownloadProgressBannerView;

/* JADX INFO: loaded from: classes3.dex */
public final class z10 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f278197b;

    public /* synthetic */ z10(Object obj, int i) {
        this.f278196a = i;
        this.f278197b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f278196a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f278197b;
                actionBarOverlayLayout.f137X0 = null;
                actionBarOverlayLayout.f125L0 = false;
                break;
            case 13:
                ((LottieAnimationView) this.f278197b).setVisibility(8);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r4v38, types: [p.eh00, p.qe70] */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f278196a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f278197b;
                actionBarOverlayLayout.f137X0 = null;
                actionBarOverlayLayout.f125L0 = false;
                break;
            case 1:
                s1c s1cVar = (s1c) this.f278197b;
                SlateView slateView = s1cVar.f204671b;
                int i = s1cVar.f204678i;
                klh.m56843o(i);
                slateView.mo15328m(i);
                break;
            case 2:
                ((k6c) this.f278197b).f119715b = false;
                break;
            case 3:
                hqb hqbVar = (hqb) this.f278197b;
                if (hqbVar.isActive()) {
                    hqbVar.resumeWith(w2a1.f247311a);
                }
                break;
            case 4:
                ((DownloadProgressBannerView) this.f278197b).setVisibility(8);
                break;
            case 5:
                kis kisVar = (kis) this.f278197b;
                kisVar.f257281c.setChecked(kisVar.f123084k);
                kisVar.f123090q.start();
                break;
            case 6:
                ufx ufxVar = (ufx) this.f278197b;
                ufxVar.f229900W0 = false;
                ufxVar.f229905Z.f115319d = true;
                break;
            case 7:
                ((HideBottomViewOnScrollBehavior) this.f278197b).f1996c = null;
                break;
            case 8:
            default:
                super.onAnimationEnd(animator);
                break;
            case 9:
                ((aqc0) this.f278197b).f18205N1 = true;
                break;
            case 10:
                ((qrc0) this.f278197b).f191816o = true;
                break;
            case 11:
                ((q0m0) this.f278197b).f184028b.mo37908Q();
                break;
            case 12:
                ((View) this.f278197b).setVisibility(4);
                break;
            case 13:
                ((LottieAnimationView) this.f278197b).setVisibility(8);
                break;
            case 14:
                RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) this.f278197b;
                recyclerViewFastScroller.setVisibility(4);
                recyclerViewFastScroller.setTranslationX(0.0f);
                recyclerViewFastScroller.setAlpha(1.0f);
                recyclerViewFastScroller.f5084Q0 = null;
                break;
            case 15:
                ((ObjectAnimator) this.f278197b).start();
                break;
            case 16:
                w481 w481Var = (w481) this.f278197b;
                v481 v481Var = w481Var.f247750b;
                if (v481Var != null) {
                    TooltipContainer tooltipContainer = (TooltipContainer) ((utu0) v481Var).f233995a;
                    tooltipContainer.f3827h = null;
                    w481 w481Var2 = tooltipContainer.f3820a;
                    w481Var2.setHidden(true);
                    w481Var2.setAnimationListener(null);
                }
                if (w481Var.f247745O0.mo49279c()) {
                    ((n09) ((z281) w481Var.f247745O0.mo49278b())).m63302f(w481Var.f247746P0);
                    w481Var.f247745O0 = C2244p5.f174033a;
                }
                break;
            case 17:
                ((po70) this.f278197b).invoke(animator);
                break;
            case 18:
                ((qe70) this.f278197b).invoke();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f278196a) {
            case 8:
                super.onAnimationRepeat(animator);
                zk80 zk80Var = (zk80) this.f278197b;
                zk80Var.f283680h = (zk80Var.f283680h + 1) % zk80Var.f283679g.f107387c.length;
                zk80Var.f283681i = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f278196a) {
            case 2:
                ((k6c) this.f278197b).f119715b = true;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z10(eh00 eh00Var) {
        this.f278196a = 18;
        this.f278197b = (qe70) eh00Var;
    }

    public z10(LottieAnimationView lottieAnimationView, kpo0 kpo0Var) {
        this.f278196a = 13;
        this.f278197b = lottieAnimationView;
    }
}
