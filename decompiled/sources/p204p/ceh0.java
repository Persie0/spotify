package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ceh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f37129a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ deh0 f37130b;

    public ceh0(deh0 deh0Var, String str, Integer num, String str2) {
        this.f37130b = deh0Var;
        yt91 yt91VarM96903c = deh0Var.f48091a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("destination", str, num, null, str2));
        yt91VarM96903c.f276056j = true;
        this.f37129a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f37130b.f48092b.f58799a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f37129a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f37129a;
        nu91Var.f248108b = this.f37130b.f48092b.f58799a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
