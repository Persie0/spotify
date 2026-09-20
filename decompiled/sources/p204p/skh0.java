package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class skh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f210101a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g4h0 f210102b;

    public skh0(g4h0 g4h0Var) {
        this.f210102b = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("filter_chips", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f210101a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((tkh0) this.f210102b.f76422c).f221151a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f210101a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f210101a;
        tkh0 tkh0Var = (tkh0) this.f210102b.f76422c;
        nu91Var.f248108b = tkh0Var.f221151a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = tkh0Var.f221153c;
        return (ou91) nu91Var.m87248a();
    }
}
