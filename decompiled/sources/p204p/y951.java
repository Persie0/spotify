package p204p;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.spotify.campaigns.storytelling.controls.stories.StoriesProgressBar;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class y951 {

    /* JADX INFO: renamed from: a */
    public final bun0 f270510a;

    /* JADX INFO: renamed from: b */
    public final hg51 f270511b;

    /* JADX INFO: renamed from: c */
    public final ca51 f270512c;

    /* JADX INFO: renamed from: d */
    public final v951 f270513d;

    /* JADX INFO: renamed from: e */
    public final ca51 f270514e;

    /* JADX INFO: renamed from: f */
    public final v951 f270515f;

    public y951(Activity activity, bun0 bun0Var, hg51 hg51Var) {
        this.f270510a = bun0Var;
        this.f270511b = hg51Var;
        ca51 ca51Var = new ca51(activity, bun0Var);
        this.f270512c = ca51Var;
        v951 v951Var = new v951(activity);
        this.f270513d = v951Var;
        this.f270514e = ca51Var;
        this.f270515f = v951Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m93148a(cb51 cb51Var) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        Completable completableAndThenCompletable;
        boolean z = cb51Var instanceof ra51;
        ca51 ca51Var = this.f270512c;
        if (z) {
            ca51Var.f35731S0.setStoriesCount(((ra51) cb51Var).f197202a);
            return;
        }
        if (cb51Var instanceof za51) {
            int i = ((za51) cb51Var).f280985a;
            ca51Var.f35750l1.m67615b();
            StoriesProgressBar storiesProgressBar = ca51Var.f35731S0;
            storiesProgressBar.currentStory = i;
            storiesProgressBar.currentStoryProgress = 0.0f;
            storiesProgressBar.invalidate();
            ca51Var.f35737Y0.setEnabled(false);
            return;
        }
        int i2 = 8;
        if (!(cb51Var instanceof bb51)) {
            if (cb51Var.equals(va51.f239127a)) {
                ca51Var.f35732T0.setVisibility(8);
                ca51Var.f35733U0.setVisibility(0);
                oqb oqbVar = ca51Var.f35750l1;
                ValueAnimator valueAnimator3 = (ValueAnimator) oqbVar.f168147d;
                if (valueAnimator3 != null) {
                    valueAnimator3.pause();
                }
                oqbVar.f168145b = true;
                return;
            }
            if (cb51Var.equals(ya51.f270814a)) {
                ca51Var.f35732T0.setVisibility(0);
                ca51Var.f35733U0.setVisibility(8);
                oqb oqbVar2 = ca51Var.f35750l1;
                if (!oqbVar2.f168146c && (valueAnimator2 = (ValueAnimator) oqbVar2.f168147d) != null) {
                    valueAnimator2.resume();
                }
                oqbVar2.f168145b = false;
                return;
            }
            if (cb51Var.equals(sa51.f207143a)) {
                View view = ca51Var.f35734V0;
                view.setVisibility(4);
                view.setClickable(false);
                View view2 = ca51Var.f35735W0;
                view2.setVisibility(0);
                view2.setClickable(true);
                return;
            }
            if (cb51Var.equals(ta51.f218460a)) {
                View view3 = ca51Var.f35734V0;
                view3.setVisibility(0);
                view3.setClickable(true);
                View view4 = ca51Var.f35735W0;
                view4.setVisibility(4);
                view4.setClickable(false);
                return;
            }
            if (cb51Var.equals(ab51.f14012a)) {
                ca51Var.f35740b1.setVisibility(0);
                View view5 = ca51Var.f35737Y0;
                view5.setVisibility(0);
                view5.setEnabled(true);
                return;
            }
            if (cb51Var.equals(ua51.f228387a)) {
                ca51Var.f35740b1.setVisibility(8);
                ca51Var.f35737Y0.setVisibility(8);
                return;
            }
            if (cb51Var.equals(wa51.f249401a)) {
                oqb oqbVar3 = ca51Var.f35750l1;
                ValueAnimator valueAnimator4 = (ValueAnimator) oqbVar3.f168147d;
                if (valueAnimator4 != null) {
                    valueAnimator4.pause();
                }
                oqbVar3.f168146c = true;
                return;
            }
            if (!cb51Var.equals(xa51.f259565a)) {
                throw new NoWhenBranchMatchedException();
            }
            oqb oqbVar4 = ca51Var.f35750l1;
            if (!oqbVar4.f168145b && (valueAnimator = (ValueAnimator) oqbVar4.f168147d) != null) {
                valueAnimator.resume();
            }
            oqbVar4.f168146c = false;
            return;
        }
        ec51 ec51Var = ((bb51) cb51Var).f25440a;
        oqb oqbVar5 = ca51Var.f35750l1;
        View view6 = ca51Var.f35740b1;
        View view7 = ca51Var.f35737Y0;
        StoriesProgressBar storiesProgressBar2 = ca51Var.f35731S0;
        Context context = ca51Var.getContext();
        int i3 = ec51Var.f58228a;
        String strValueOf = String.valueOf(i3 + 1);
        String strValueOf2 = String.valueOf(storiesProgressBar2.getStoriesCount());
        String str = ec51Var.f58230c;
        storiesProgressBar2.setContentDescription(context.getString(R.string.storytelling_progressbar_accessibility_label, strValueOf, strValueOf2, str));
        view7.setContentDescription(ca51Var.getContext().getString(R.string.storytelling_share_accessibility_label, str));
        Disposable disposable = ca51Var.f35751m1;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposableSubscribe = null;
        ca51Var.f35751m1 = null;
        bun0 bun0Var = ca51Var.f35730R0;
        int i4 = 2;
        if (bun0Var != null) {
            String str2 = (String) storiesProgressBar2.getContentDescription();
            if (((InterfaceC2609yd) bun0Var.f31172e).mo76361c()) {
                completableAndThenCompletable = new CompletableAndThenCompletable(Completable.m23291w(500L, TimeUnit.MILLISECONDS, Schedulers.f10370c), new i2j0(i4, bun0Var, str2));
            } else {
                completableAndThenCompletable = CompletableEmpty.f7437a;
                wj50.m88279p(completableAndThenCompletable);
            }
            disposableSubscribe = completableAndThenCompletable.subscribe();
        } else {
            view6 = view6;
        }
        ca51Var.f35751m1 = disposableSubscribe;
        oqbVar5.m67615b();
        kyf1 kyf1Var = ec51Var.f58229b;
        if (kyf1Var instanceof nb51) {
            storiesProgressBar2.currentStory = i3;
            storiesProgressBar2.currentStoryProgress = 1.0f;
            storiesProgressBar2.invalidate();
        } else {
            if (!(kyf1Var instanceof mb51)) {
                throw new NoWhenBranchMatchedException();
            }
            mb51 mb51Var = (mb51) kyf1Var;
            long millis = mb51Var.f141804i.toMillis(mb51Var.f141803h);
            dh31 dh31Var = new dh31(i2, ca51Var, ec51Var);
            hm11 hm11Var = new hm11(19, ca51Var, ec51Var);
            oqbVar5.m67615b();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(millis);
            nlv0 nlv0Var = new nlv0();
            valueAnimatorOfFloat.addUpdateListener(new rx4(dh31Var, 19));
            valueAnimatorOfFloat.addListener(new axv(nlv0Var, hm11Var, nlv0Var, i4));
            valueAnimatorOfFloat.start();
            oqbVar5.f168147d = valueAnimatorOfFloat;
        }
        dj01 dj01Var = ec51Var.f58231d;
        if (wj50.m88271j(dj01Var, cj01.f38472a)) {
            view6.setVisibility(0);
            view7.setVisibility(0);
            view7.setEnabled(true);
        } else {
            View view8 = view6;
            if (!wj50.m88271j(dj01Var, bj01.f27583a)) {
                throw new NoWhenBranchMatchedException();
            }
            view8.setVisibility(8);
            view7.setVisibility(8);
        }
    }
}
