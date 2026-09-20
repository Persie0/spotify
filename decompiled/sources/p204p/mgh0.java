package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class mgh0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f143505a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eag0 f143506b;

    public mgh0(eag0 eag0Var, String str) {
        this.f143506b = eag0Var;
        yt91 yt91VarM96903c = eag0Var.f57667c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("collaborator_avatar", null, null, str, null));
        yt91VarM96903c.f276056j = true;
        this.f143505a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f143506b.f57666b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f143505a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f143505a;
        eag0 eag0Var = this.f143506b;
        nu91Var.f248108b = eag0Var.f57666b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = eag0Var.f57668d;
        return (ou91) nu91Var.m87248a();
    }
}
