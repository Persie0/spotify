package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class xch0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f260230a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vch0 f260231b;

    public xch0(vch0 vch0Var) {
        this.f260231b = vch0Var;
        yt91 yt91VarM96903c = vch0Var.f240135c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("settings_item", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f260230a = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m90395a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f260230a, this.f260231b.f240134b, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f260231b.f240134b;
        ArrayList arrayList = new ArrayList();
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f260230a;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f260230a;
        nu91Var.f248108b = this.f260231b.f240134b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
