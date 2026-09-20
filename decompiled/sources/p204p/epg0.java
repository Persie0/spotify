package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class epg0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final st91 f61646a;

    /* JADX INFO: renamed from: b */
    public final zt91 f61647b;

    public epg0(st91 st91Var) {
        this.f61646a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-gen-alpha-child-led-signup-close-dialog";
        yt91VarM50626j.f276052f = "0.1.0";
        yt91VarM50626j.f276053g = "20.0.5";
        this.f61647b = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f61646a.f213866a);
        zt91 zt91Var = this.f61647b;
        ofg1.m66846o(zt91Var, "location");
        arrayList.add(zt91Var);
        return new st91(arrayList);
    }
}
