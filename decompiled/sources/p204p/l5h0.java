package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class l5h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f129952a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g4h0 f129953b;

    public l5h0(g4h0 g4h0Var) {
        this.f129953b = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("notification_toggle", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f129952a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((o5h0) ((cag0) this.f129953b.f76422c).f35817c).f161971a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f129952a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f129952a;
        nu91Var.f248108b = ((o5h0) ((cag0) this.f129953b.f76422c).f35817c).f161971a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
