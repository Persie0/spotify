package p204p;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class fl50 implements db51 {

    /* JADX INFO: renamed from: L0 */
    public final yi01 f70691L0;

    /* JADX INFO: renamed from: X */
    public TextView f70692X;

    /* JADX INFO: renamed from: Y */
    public AnimatorSet f70693Y;

    /* JADX INFO: renamed from: Z */
    public ibp f70694Z;

    /* JADX INFO: renamed from: a */
    public final Activity f70695a;

    /* JADX INFO: renamed from: b */
    public final el50 f70696b;

    /* JADX INFO: renamed from: c */
    public final String f70697c;

    /* JADX INFO: renamed from: d */
    public final mb51 f70698d;

    /* JADX INFO: renamed from: e */
    public final String f70699e;

    /* JADX INFO: renamed from: f */
    public final dj01 f70700f;

    /* JADX INFO: renamed from: g */
    public View f70701g;

    /* JADX INFO: renamed from: h */
    public TextView f70702h;

    /* JADX INFO: renamed from: i */
    public TextView f70703i;

    /* JADX INFO: renamed from: t */
    public TextView f70704t;

    public fl50(Activity activity, el50 el50Var) {
        mb51 mb51Var = new mb51(8300L, TimeUnit.MILLISECONDS);
        String string = activity.getString(R.string.accessibility_title);
        dj01 dj01VarM53187j = jfg1.m53187j(el50Var);
        this.f70695a = activity;
        this.f70696b = el50Var;
        this.f70697c = "blend-intro-story";
        this.f70698d = mb51Var;
        this.f70699e = string;
        this.f70700f = dj01VarM53187j;
        this.f70691L0 = yi01.f273015a;
    }

    @Override // p204p.db51
    /* JADX INFO: renamed from: a */
    public final void mo35522a() {
        AnimatorSet animatorSet = this.f70693Y;
        if (animatorSet != null) {
            animatorSet.pause();
        }
    }

    @Override // p204p.db51
    /* JADX INFO: renamed from: b */
    public final String mo35523b() {
        return this.f70697c;
    }

    @Override // p204p.db51
    /* JADX INFO: renamed from: c */
    public final void mo35524c() {
        AnimatorSet animatorSet = this.f70693Y;
        if (animatorSet != null) {
            animatorSet.resume();
        }
    }

    @Override // p204p.db51
    /* JADX INFO: renamed from: d */
    public final aj01 mo35525d() {
        return this.f70691L0;
    }

    @Override // p204p.db51
    public final void dispose() {
        AnimatorSet animatorSet = this.f70693Y;
        if (animatorSet != null) {
            cjf1.m32985z(animatorSet);
        }
    }

    @Override // p204p.db51
    /* JADX INFO: renamed from: e */
    public final View mo35526e(ibp ibpVar, bc21 bc21Var) {
        this.f70694Z = ibpVar;
        Activity activity = this.f70695a;
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.story_intro, (ViewGroup) new FrameLayout(activity), false);
        el50 el50Var = this.f70696b;
        viewInflate.setBackgroundColor(g0g1.m43309n(el50Var.m39326b()));
        this.f70701g = viewInflate;
        this.f70702h = g0g1.m43298c(viewInflate, R.id.title1, el50Var.m39329e());
        this.f70703i = g0g1.m43298c(viewInflate, R.id.subtitle1, el50Var.m39327c());
        this.f70704t = g0g1.m43298c(viewInflate, R.id.title2, el50Var.m39330f());
        this.f70692X = g0g1.m43298c(viewInflate, R.id.subtitle2, el50Var.m39328d());
        AnimatorSet animatorSet = new AnimatorSet();
        TextView textView = this.f70702h;
        if (textView == null) {
            wj50.m88260d0("title1");
            throw null;
        }
        AnimatorSet animatorSetM32982w = cjf1.m32982w(textView, 250L);
        TextView textView2 = this.f70703i;
        if (textView2 == null) {
            wj50.m88260d0("subtitle1");
            throw null;
        }
        AnimatorSet animatorSetM32982w2 = cjf1.m32982w(textView2, 500L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        TextView textView3 = this.f70702h;
        if (textView3 == null) {
            wj50.m88260d0("title1");
            throw null;
        }
        AnimatorSet animatorSetM32984y = cjf1.m32984y(textView3);
        TextView textView4 = this.f70703i;
        if (textView4 == null) {
            wj50.m88260d0("subtitle1");
            throw null;
        }
        animatorSet2.playTogether(animatorSetM32984y, cjf1.m32984y(textView4));
        animatorSet2.setStartDelay(2050L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        TextView textView5 = this.f70704t;
        if (textView5 == null) {
            wj50.m88260d0("title2");
            throw null;
        }
        AnimatorSet.Builder builderPlay = animatorSet3.play(cjf1.m32982w(textView5, 0L));
        TextView textView6 = this.f70692X;
        if (textView6 == null) {
            wj50.m88260d0("subtitle2");
            throw null;
        }
        builderPlay.with(cjf1.m32982w(textView6, 0L));
        animatorSet3.setStartDelay(200L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        TextView textView7 = this.f70704t;
        if (textView7 == null) {
            wj50.m88260d0("title2");
            throw null;
        }
        AnimatorSet animatorSetM32984y2 = cjf1.m32984y(textView7);
        TextView textView8 = this.f70692X;
        if (textView8 == null) {
            wj50.m88260d0("subtitle2");
            throw null;
        }
        animatorSet4.playTogether(animatorSetM32984y2, cjf1.m32984y(textView8));
        animatorSet4.setStartDelay(2900L);
        animatorSet.playSequentially(animatorSetM32982w, animatorSetM32982w2, animatorSet2, animatorSet3, animatorSet4);
        this.f70693Y = animatorSet;
        return viewInflate;
    }

    @Override // p204p.db51
    /* JADX INFO: renamed from: f */
    public final String mo35527f() {
        return this.f70699e;
    }

    @Override // p204p.db51
    public final kyf1 getDuration() {
        return this.f70698d;
    }

    @Override // p204p.db51
    /* JADX INFO: renamed from: h */
    public final dj01 mo35529h() {
        return this.f70700f;
    }

    @Override // p204p.db51
    public final void start() {
        ibp ibpVar;
        AnimatorSet animatorSet = this.f70693Y;
        if (animatorSet != null) {
            animatorSet.start();
        }
        String strM39325a = this.f70696b.m39325a();
        if (strM39325a == null || (ibpVar = this.f70694Z) == null) {
            return;
        }
        ibpVar.m50194f(Uri.parse(strM39325a), false);
    }
}
