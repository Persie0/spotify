package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class i4h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f98529a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cag0 f98530b;

    public i4h0(cag0 cag0Var, String str) {
        this.f98530b = cag0Var;
        yt91 yt91VarM96903c = cag0Var.f35816b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("story_preview_button", null, null, str, null));
        yt91VarM96903c.f276056j = true;
        this.f98529a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = ((r2h0) this.f98530b.f35817c).f195144b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f98529a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f98529a;
        nu91Var.f248108b = ((r2h0) this.f98530b.f35817c).f195144b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
