package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class deh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f48091a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eeh0 f48092b;

    public deh0(eeh0 eeh0Var) {
        this.f48092b = eeh0Var;
        yt91 yt91VarM96903c = eeh0Var.f58800b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("off_platform_destinations", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f48091a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f48092b.f58799a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f48091a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
