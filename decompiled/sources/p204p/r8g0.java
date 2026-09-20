package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class r8g0 implements pv91, qv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f196791a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s8g0 f196792b;

    public r8g0(s8g0 s8g0Var, String str, Integer num, String str2) {
        this.f196792b = s8g0Var;
        yt91 yt91VarM96903c = s8g0Var.f206643b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("carousel_item", str, num, str2, null));
        yt91VarM96903c.f276056j = false;
        this.f196791a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((t8g0) this.f196792b.f206644c).f218080a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f196791a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.qv91
    /* JADX INFO: renamed from: e */
    public final kt91 mo29028e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f196791a;
        nu91Var.f248108b = ((t8g0) this.f196792b.f206644c).f218080a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return new kt91((ou91) nu91Var.m87248a());
    }
}
