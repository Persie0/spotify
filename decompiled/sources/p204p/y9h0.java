package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class y9h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f270600a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z9h0 f270601b;

    public y9h0(z9h0 z9h0Var) {
        this.f270601b = z9h0Var;
        yt91 yt91VarM96903c = z9h0Var.f280781b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("share_button", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f270600a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f270601b.f280780a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f270600a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f270600a;
        nu91Var.f248108b = this.f270601b.f280780a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: h */
    public final av91 m93153h() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f270600a, this.f270601b.f280780a, System.currentTimeMillis());
    }
}
