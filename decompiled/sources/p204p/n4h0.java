package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class n4h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f150340a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r2h0 f150341b;

    public n4h0(r2h0 r2h0Var) {
        this.f150341b = r2h0Var;
        yt91 yt91VarM96903c = r2h0Var.f195145c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("join_button", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f150340a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f150341b.f195144b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f150340a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f150340a;
        nu91Var.f248108b = this.f150341b.f195144b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
