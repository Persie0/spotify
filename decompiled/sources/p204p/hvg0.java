package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class hvg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f95712a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ivg0 f95713b;

    public hvg0(ivg0 ivg0Var, String str, String str2) {
        this.f95713b = ivg0Var;
        yt91 yt91VarM96903c = ivg0Var.f106218b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("translation_button", str, null, null, str2));
        yt91VarM96903c.f276056j = true;
        this.f95712a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f95713b.f106217a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f95712a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f95712a;
        nu91Var.f248108b = this.f95713b.f106217a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
