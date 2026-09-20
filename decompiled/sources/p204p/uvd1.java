package p204p;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class uvd1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ awd1 f234425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ swd1 f234426b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ swd1 f234427c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f234428d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f234429e;

    public uvd1(awd1 awd1Var, swd1 swd1Var, swd1 swd1Var2, int i, View view) {
        this.f234425a = awd1Var;
        this.f234426b = swd1Var;
        this.f234427c = swd1Var2;
        this.f234428d = i;
        this.f234429e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        hwd1 dwd1Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        awd1 awd1Var = this.f234425a;
        awd1Var.m27306f(animatedFraction);
        swd1 swd1Var = this.f234426b;
        pwd1 pwd1Var = swd1Var.f214650a;
        float fMo94690c = awd1Var.f20489a.mo94690c();
        PathInterpolator pathInterpolator = wvd1.f255475e;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            dwd1Var = new gwd1(swd1Var);
        } else if (i >= 31) {
            dwd1Var = new fwd1(swd1Var);
        } else if (i >= 30) {
            dwd1Var = new ewd1(swd1Var);
        } else {
            dwd1Var = i >= 29 ? new dwd1(swd1Var) : new bwd1(swd1Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((this.f234428d & i2) == 0) {
                dwd1Var.mo40142c(i2, pwd1Var.mo51806g(i2));
            } else {
                dx40 dx40VarMo51806g = pwd1Var.mo51806g(i2);
                dx40 dx40VarMo51806g2 = this.f234427c.f214650a.mo51806g(i2);
                float f = 1.0f - fMo94690c;
                dwd1Var.mo40142c(i2, swd1.m79535e(dx40VarMo51806g, (int) (((double) ((dx40VarMo51806g.f53848a - dx40VarMo51806g2.f53848a) * f)) + 0.5d), (int) (((double) ((dx40VarMo51806g.f53849b - dx40VarMo51806g2.f53849b) * f)) + 0.5d), (int) (((double) ((dx40VarMo51806g.f53850c - dx40VarMo51806g2.f53850c) * f)) + 0.5d), (int) (((double) ((dx40VarMo51806g.f53851d - dx40VarMo51806g2.f53851d) * f)) + 0.5d)));
            }
        }
        wvd1.m89085h(this.f234429e, dwd1Var.mo30680b(), Collections.singletonList(awd1Var));
    }
}
