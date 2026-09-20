package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class udg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f229244a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s8g0 f229245b;

    public udg0(int i, Integer num, String str, s8g0 s8g0Var) {
        this.f229245b = s8g0Var;
        yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("entity_row", null, num, str, f9g0.m41061e(i)));
        yt91VarM96903c.f276056j = false;
        this.f229244a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((vdg0) this.f229245b.f206644c).f240407a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f229244a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
