package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jmg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f113860a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xlg0 f113861b;

    public jmg0(xlg0 xlg0Var, int i, Integer num) {
        String str;
        this.f113861b = xlg0Var;
        yt91 yt91VarM96903c = xlg0Var.f263144b.m96903c();
        if (i == 1) {
            str = "ai_persona";
        } else if (i == 2) {
            str = "ai_persona_likely";
        } else if (i == 3) {
            str = "fresh_finds_forward";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "verified";
        }
        yt91VarM96903c.f276055i.add(new bu91("badge", str, num, null, null));
        yt91VarM96903c.f276056j = true;
        this.f113860a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f113860a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f113860a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = this.f113861b.f263145c;
        return (ou91) nu91Var.m87248a();
    }

    /* JADX INFO: renamed from: h */
    public final av91 m53778h() {
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), this.f113860a, st91.f213865b, System.currentTimeMillis());
    }
}
