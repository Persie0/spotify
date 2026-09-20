package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class u9h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f228200a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v9h0 f228201b;

    public u9h0(v9h0 v9h0Var) {
        this.f228201b = v9h0Var;
        yt91 yt91VarM96903c = v9h0Var.f238948a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("sync_transcript", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f228200a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f228201b.f238949b.f249179b.f280780a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f228200a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }
}
