package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ich0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f100817a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mch0 f100818b;

    public ich0(mch0 mch0Var, String str) {
        this.f100818b = mch0Var;
        yt91 yt91VarM96903c = mch0Var.f142156a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("instant_mix", null, 0, str, null));
        yt91VarM96903c.f276056j = true;
        this.f100817a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f100817a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f100817a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((ebg0) ((g4h0) this.f100818b.f142157b.f197601c.f76422c).f76422c).f57927c;
        return (ou91) nu91Var.m87248a();
    }
}
