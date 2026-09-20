package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class fvg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f73794a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ivg0 f73795b;

    public fvg0(ivg0 ivg0Var) {
        this.f73795b = ivg0Var;
        yt91 yt91VarM96903c = ivg0Var.f106218b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("share_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f73794a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f73795b.f106217a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f73794a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
