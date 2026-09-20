package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class thh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f220426a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uhh0 f220427b;

    public thh0(uhh0 uhh0Var) {
        this.f220427b = uhh0Var;
        yt91 yt91VarM96903c = uhh0Var.f230450b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("processing_failed", null, null, "", null));
        yt91VarM96903c.f276056j = true;
        this.f220426a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f220427b.f230449a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f220426a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f220426a;
        nu91Var.f248108b = this.f220427b.f230449a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
