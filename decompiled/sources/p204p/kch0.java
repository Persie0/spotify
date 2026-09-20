package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class kch0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f121483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lch0 f121484b;

    public kch0(lch0 lch0Var, Integer num, String str) {
        this.f121484b = lch0Var;
        yt91 yt91VarM96903c = lch0Var.f131936a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("version_item", null, num, str, null));
        yt91VarM96903c.f276056j = true;
        this.f121483a = yt91VarM96903c.m94607a();
    }

    /* JADX INFO: renamed from: a */
    public final av91 m56051a(String str) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        return new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), this.f121483a, st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f121483a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f121483a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((ebg0) ((g4h0) this.f121484b.f131937b.f142157b.f197601c.f76422c).f76422c).f57927c;
        return (ou91) nu91Var.m87248a();
    }
}
