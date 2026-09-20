package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class n0h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f149056a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s8g0 f149057b;

    public n0h0(s8g0 s8g0Var, Integer num) {
        this.f149057b = s8g0Var;
        yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("entity_item", null, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f149056a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((o0h0) this.f149057b.f206644c).f160391a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f149056a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
