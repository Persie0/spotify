package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class qfg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f188200a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rfg0 f188201b;

    public qfg0(rfg0 rfg0Var, String str) {
        this.f188201b = rfg0Var;
        yt91 yt91VarM96903c = rfg0Var.f198647b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("comment_row", "unpinned", null, str, null));
        yt91VarM96903c.f276056j = false;
        this.f188200a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f188201b.f198646a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f188200a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
