package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class n3h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f150056a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r2h0 f150057b;

    public n3h0(r2h0 r2h0Var) {
        this.f150057b = r2h0Var;
        yt91 yt91VarM96903c = r2h0Var.f195145c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("name_and_details_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f150056a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f150057b.f195144b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f150056a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
