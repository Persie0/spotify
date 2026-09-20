package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class feh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f68772a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ieh0 f68773b;

    public feh0(ieh0 ieh0Var) {
        this.f68773b = ieh0Var;
        yt91 yt91VarM96903c = ieh0Var.f101413a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("create_group_button", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f68772a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f68773b.f101414b.f240134b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f68772a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f68772a;
        nu91Var.f248108b = this.f68773b.f101414b.f240134b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
