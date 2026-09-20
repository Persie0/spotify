package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class jsg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f115493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ psg0 f115494b;

    public jsg0(psg0 psg0Var, String str) {
        this.f115494b = psg0Var;
        yt91 yt91VarM96903c = psg0Var.f180856b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("join_asking_sheet", str, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f115493a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f115494b.f180855a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f115493a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f115493a;
        nu91Var.f248108b = this.f115494b.f180855a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
