package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class hdh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f90144a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vch0 f90145b;

    public hdh0(vch0 vch0Var) {
        this.f90145b = vch0Var;
        yt91 yt91VarM96903c = vch0Var.f240135c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("settings_item", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f90144a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f90145b.f240134b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f90144a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
