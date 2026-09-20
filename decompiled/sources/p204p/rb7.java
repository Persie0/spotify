package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class rb7 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f197516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tb7 f197517b;

    public rb7(tb7 tb7Var) {
        this.f197517b = tb7Var;
        yt91 yt91VarM96903c = tb7Var.f218770b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("primary_action_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f197516a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f197517b.f218769a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f197516a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
