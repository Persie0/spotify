package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class a1h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f11415a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b1h0 f11416b;

    public a1h0(b1h0 b1h0Var) {
        this.f11416b = b1h0Var;
        yt91 yt91VarM96903c = b1h0Var.f22350b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("metadata_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f11415a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f11416b.f22349a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f11415a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
