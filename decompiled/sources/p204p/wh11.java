package p204p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.ComposeView;

/* JADX INFO: loaded from: classes2.dex */
public final class wh11 implements owt {

    /* JADX INFO: renamed from: a */
    public final gh00 f251226a;

    /* JADX INFO: renamed from: b */
    public final zv41 f251227b;

    /* JADX INFO: renamed from: c */
    public final e940 f251228c;

    /* JADX INFO: renamed from: d */
    public final mp11 f251229d;

    /* JADX INFO: renamed from: e */
    public final yum0 f251230e = sam.m77645B(null);

    /* JADX INFO: renamed from: f */
    public final View f251231f;

    public wh11(gh00 gh00Var, th11 th11Var, zv41 zv41Var, boolean z, Context context, e940 e940Var) {
        View viewM62427b;
        this.f251226a = gh00Var;
        this.f251227b = zv41Var;
        this.f251228c = e940Var;
        if (z) {
            this.f251229d = null;
            ComposeView composeView = new ComposeView(context, null, 0, 6, null);
            composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            composeView.setContent(rkk.m75763o(new g511(this, 6), true, -212331668));
            viewM62427b = composeView;
        } else {
            mp11 mp11Var = new mp11(context, e940Var, th11Var);
            this.f251229d = mp11Var;
            mp11Var.m62428c(new o611(this, 3));
            viewM62427b = mp11Var.m62427b();
        }
        this.f251231f = viewM62427b;
    }

    @Override // p204p.owt
    /* JADX INFO: renamed from: a */
    public final void mo26764a(Object obj, ext extVar) {
        rh11 rh11Var = (rh11) obj;
        mp11 mp11Var = this.f251229d;
        if (mp11Var != null) {
            mp11Var.m62429d(rh11Var);
        } else {
            this.f251230e.setValue(rh11Var);
        }
    }

    @Override // p204p.owt
    public final View getView() {
        return this.f251231f;
    }
}
