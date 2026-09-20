package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class elh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f60714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g4h0 f60715b;

    public elh0(g4h0 g4h0Var, String str) {
        this.f60715b = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("share_ineligible_bottom_sheet", null, null, null, str));
        yt91VarM96903c.f276056j = true;
        this.f60714a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((vch0) this.f60715b.f76422c).f240134b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f60714a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f60714a;
        nu91Var.f248108b = ((vch0) this.f60715b.f76422c).f240134b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
