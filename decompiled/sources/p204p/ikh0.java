package p204p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class ikh0 implements xt91, rv91 {

    /* JADX INFO: renamed from: a */
    public final st91 f103122a;

    /* JADX INFO: renamed from: b */
    public final zt91 f103123b;

    public ikh0(String str, Integer num, String str2, String str3, st91 st91Var) {
        this.f103122a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-your-library-content-item";
        yt91VarM50626j.f276052f = "1.4.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276049c = num;
        yt91VarM50626j.f276051e = str2;
        yt91VarM50626j.f276050d = str3;
        this.f103123b = yt91VarM50626j.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m50949a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f103123b, this.f103122a, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        st91 st91Var2 = this.f103122a;
        if (st91Var2 != null) {
            arrayList.addAll(st91Var2.f213866a);
        }
        zt91 zt91Var = this.f103123b;
        return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f103123b;
        nu91Var.f248108b = this.f103122a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: g */
    public final av91 m50950g() {
        return new av91("", "", new dv91("long_hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f103123b, this.f103122a, System.currentTimeMillis());
    }
}
