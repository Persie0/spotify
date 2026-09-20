package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class v9g0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f238944a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w9g0 f238945b;

    public v9g0(w9g0 w9g0Var) {
        this.f238945b = w9g0Var;
        yt91 yt91VarM96903c = w9g0Var.f249176b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("disclaimer_text", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f238944a = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m84966a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f238944a, this.f238945b.f249175a, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f238945b.f249175a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f238944a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f238944a;
        nu91Var.f248108b = this.f238945b.f249175a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
