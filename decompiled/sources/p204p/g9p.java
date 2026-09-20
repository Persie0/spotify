package p204p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.encoreconsumermobile.elements.downloadbutton.DownloadButtonView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class g9p extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77849a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f77850b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f77851c;

    public /* synthetic */ g9p(int i, Object obj, Object obj2) {
        this.f77849a = i;
        this.f77850b = obj;
        this.f77851c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f77849a) {
            case 5:
                ((alc1) this.f77850b).mo26286a((View) this.f77851c);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f77849a) {
            case 0:
                ((LinearLayout) ((ycc) this.f77850b).f271453b).setVisibility(8);
                ((c9p) this.f77851c).invoke();
                return;
            case 1:
                ((DownloadButtonView) this.f77850b).setDrawable((u2s) this.f77851c);
                animator.removeAllListeners();
                return;
            case 2:
                ((nku) this.f77850b).setDrawable((u2s) this.f77851c);
                animator.removeAllListeners();
                return;
            case 3:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f77850b;
                lottieAnimationView.f1477h.f196990b.removeAllListeners();
                w0r w0rVar = (w0r) this.f77851c;
                if (w0rVar.f246795b < ((List) ((ia70) w0rVar.f246796c).f100167c).size() - 1) {
                    w0rVar.f246795b++;
                    w0rVar.m86960c(lottieAnimationView);
                    return;
                }
                int iM38547C = edb.m38547C(w0rVar.f246794a);
                if (iM38547C == 0) {
                    lottieAnimationView.setMinFrame((int) lottieAnimationView.getMaxFrame());
                    lottieAnimationView.setRepeatCount(0);
                    lottieAnimationView.setRepeatMode(1);
                } else {
                    if (iM38547C != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lottieAnimationView.m1183e();
                    lottieAnimationView.setVisibility(8);
                }
                utu0 utu0Var = (utu0) w0rVar.f246799f;
                if (utu0Var != null) {
                    ((key0) utu0Var.f233995a).m56244a();
                    return;
                }
                return;
            case 4:
                ((LinearLayout) this.f77850b).setVisibility(8);
                ((pgm0) this.f77851c).invoke();
                return;
            case 5:
                ((alc1) this.f77850b).mo26287d((View) this.f77851c);
                return;
            case 6:
                View view = (View) this.f77850b;
                view.setAlpha(1.0f);
                view.setVisibility(4);
                View view2 = (View) this.f77851c;
                view2.setVisibility(0);
                view2.setAlpha(0.0f);
                view2.animate().setListener(null).alpha(1.0f).start();
                return;
            default:
                awd1 awd1Var = (awd1) this.f77850b;
                awd1Var.m27306f(1.0f);
                wvd1.m89083f((View) this.f77851c, awd1Var);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f77849a) {
            case 5:
                ((alc1) this.f77850b).mo26288e();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
