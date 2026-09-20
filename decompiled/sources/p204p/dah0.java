package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class dah0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f47047a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g4h0 f47048b;

    public dah0(g4h0 g4h0Var, String str, Integer num, String str2) {
        this.f47048b = g4h0Var;
        yt91 yt91VarM96903c = g4h0Var.f76421b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("item", str, num, str2, null));
        yt91VarM96903c.f276056j = true;
        this.f47047a = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m35482a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f47047a, st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f47047a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f47047a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((xug0) this.f47048b.f76422c).f266110c;
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: h */
    public final av91 m35483h(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("play", 1, Collections.singletonMap("item_to_be_played", string)), this.f47047a, st91.f213865b, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public final av91 m35484i() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f47047a, st91.f213865b, System.currentTimeMillis());
    }
}
