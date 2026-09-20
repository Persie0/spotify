package p204p;

import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class qag0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f186874a;

    public qag0(String str, UUID uuid) {
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-allboarding-contentpicker";
        yt91VarM50626j.f276052f = "14.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = uuid.toString();
        yt91VarM50626j.f276051e = str;
        this.f186874a = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f186874a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }
}
