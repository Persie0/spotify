package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class dog0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f51042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gag0 f51043b;

    public dog0(gag0 gag0Var) {
        this.f51043b = gag0Var;
        yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("companion_content_carousel", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f51042a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f51043b.f78049b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f51042a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
