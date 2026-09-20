package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class t9h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f218299a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v9h0 f218300b;

    public t9h0(v9h0 v9h0Var, int i, Integer num) {
        String str;
        this.f218300b = v9h0Var;
        yt91 yt91VarM96903c = v9h0Var.f238948a.m96903c();
        if (i == 1) {
            str = "entity";
        } else if (i == 2) {
            str = "image";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "video";
        }
        yt91VarM96903c.f276055i.add(new bu91("companion_content", str, num, null, null));
        yt91VarM96903c.f276056j = true;
        this.f218299a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f218300b.f238949b.f249179b.f280780a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f218299a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f218299a;
        nu91Var.f248108b = this.f218300b.f238949b.f249179b.f280780a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: h */
    public final av91 m80311h() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f218299a, this.f218300b.f238949b.f249179b.f280780a, System.currentTimeMillis());
    }
}
