package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class t7h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f217770a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v7h0 f217771b;

    public t7h0(v7h0 v7h0Var) {
        this.f217771b = v7h0Var;
        yt91 yt91VarM96903c = v7h0Var.f238185b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("add_button", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f217770a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f217771b.f238184a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f217770a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f217770a;
        nu91Var.f248108b = this.f217771b.f238184a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
