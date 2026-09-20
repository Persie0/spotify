package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class png0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f179380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qng0 f179381b;

    public png0(qng0 qng0Var) {
        this.f179381b = qng0Var;
        yt91 yt91VarM96903c = qng0Var.f190581b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("action_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f179380a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f179381b.f190580a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f179380a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
