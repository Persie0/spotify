package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class n9h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f151802a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z9h0 f151803b;

    public n9h0(z9h0 z9h0Var, int i, String str) {
        String str2;
        this.f151803b = z9h0Var;
        yt91 yt91VarM96903c = z9h0Var.f280781b.m96903c();
        if (i == 1) {
            str2 = "artwork";
        } else if (i == 2) {
            str2 = "entity";
        } else if (i == 3) {
            str2 = "images";
        } else {
            if (i != 4) {
                throw null;
            }
            str2 = "video";
        }
        yt91VarM96903c.f276055i.add(new bu91("artwork_view", str2, null, str, null));
        yt91VarM96903c.f276056j = true;
        this.f151802a = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m63923a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f151802a, this.f151803b.f280780a, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f151803b.f280780a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f151802a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f151802a;
        nu91Var.f248108b = this.f151803b.f280780a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: h */
    public final av91 m63924h() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f151802a, this.f151803b.f280780a, System.currentTimeMillis());
    }
}
