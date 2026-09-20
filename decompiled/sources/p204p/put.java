package p204p;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class put implements t6l0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hxt f181524a;

    public put(hxt hxtVar) {
        this.f181524a = hxtVar;
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public final swd1 mo24684x(View view, swd1 swd1Var) {
        dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(519);
        hqk hqkVar = new hqk(-1, -1);
        hqkVar.setMarginStart(dx40VarMo51806g.f53850c);
        hqkVar.setMarginEnd(dx40VarMo51806g.f53848a);
        hqkVar.m48293b(new AppBarLayout.ScrollingViewBehavior());
        this.f181524a.f96307t.setLayoutParams(hqkVar);
        return swd1Var;
    }
}
