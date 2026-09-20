package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class sb7 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f207371a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tb7 f207372b;

    public sb7(tb7 tb7Var) {
        this.f207372b = tb7Var;
        yt91 yt91VarM96903c = tb7Var.f218770b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("secondary_action_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f207371a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f207372b.f218769a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f207371a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
