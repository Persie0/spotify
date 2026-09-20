package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ifg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f101761a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s8g0 f101762b;

    public ifg0(Integer num, String str, s8g0 s8g0Var) {
        this.f101762b = s8g0Var;
        yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("button", str, num, null, null));
        yt91VarM96903c.f276056j = true;
        this.f101761a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((gag0) this.f101762b.f206644c).f78049b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f101761a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f101761a;
        nu91Var.f248108b = ((gag0) this.f101762b.f206644c).f78049b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
