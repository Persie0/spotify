package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class u3h0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f226382a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w3h0 f226383b;

    public u3h0(w3h0 w3h0Var) {
        this.f226383b = w3h0Var;
        yt91 yt91VarM96903c = w3h0Var.f247592b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("play_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f226382a = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m82276a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f226382a, this.f226383b.f247591a, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f226383b.f247591a;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f226382a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    /* JADX INFO: renamed from: e */
    public final av91 m82277e(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("show_paywall", 1, Collections.singletonMap("paywalled_item", string)), this.f226382a, this.f226383b.f247591a, System.currentTimeMillis());
    }
}
