package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class kdh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f121679a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ldh0 f121680b;

    public kdh0(ldh0 ldh0Var) {
        this.f121680b = ldh0Var;
        yt91 yt91VarM96903c = ldh0Var.f132175a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("confirmation_dialog", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f121679a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f121680b.f132176b.f240134b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f121679a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
