package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class teh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f219701a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g4h0 f219702b;

    public teh0(g4h0 g4h0Var) {
        this.f219702b = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("suggestions_disabled_card", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f219701a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((ueh0) this.f219702b.f76422c).f229540a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f219701a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f219701a;
        nu91Var.f248108b = ((ueh0) this.f219702b.f76422c).f229540a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
