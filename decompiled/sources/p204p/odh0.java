package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class odh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f164191a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pdh0 f164192b;

    public odh0(pdh0 pdh0Var) {
        this.f164192b = pdh0Var;
        yt91 yt91VarM96903c = pdh0Var.f176466a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("confirmation_dialog", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f164191a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f164192b.f176467b.f240134b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f164191a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
