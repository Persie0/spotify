package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class csg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f41544a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dsg0 f41545b;

    public csg0(dsg0 dsg0Var, String str, Integer num) {
        this.f41545b = dsg0Var;
        yt91 yt91VarM96903c = dsg0Var.f52567b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("intent_pill", str, num, null, null));
        yt91VarM96903c.f276056j = true;
        this.f41544a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f41545b.f52566a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f41544a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f41544a;
        nu91Var.f248108b = this.f41545b.f52566a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
