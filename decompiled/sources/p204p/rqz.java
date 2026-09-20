package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class rqz extends exh0 implements xpz {
    @Override // p204p.xpz
    /* JADX INFO: renamed from: V0 */
    public final void mo39631V0(spz spzVar) {
        View viewM67359k = omo0.m67359k(this);
        spzVar.mo67471b(this.f63770a.f63766L0 && omo0.m67359k(this).hasFocusable());
        View viewFindFocus = viewM67359k.findFocus();
        if (viewFindFocus != null) {
            spzVar.mo78925a(jpz.m53979a(viewFindFocus, viewM67359k));
        }
    }
}
