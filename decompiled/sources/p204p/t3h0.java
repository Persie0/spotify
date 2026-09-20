package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class t3h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f216782a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w3h0 f216783b;

    public t3h0(w3h0 w3h0Var) {
        this.f216783b = w3h0Var;
        yt91 yt91VarM96903c = w3h0Var.f247592b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("download_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f216782a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f216783b.f247591a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f216782a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
