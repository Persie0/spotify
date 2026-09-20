package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class rjh0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final st91 f199836a;

    /* JADX INFO: renamed from: b */
    public final zt91 f199837b;

    public rjh0(st91 st91Var) {
        this.f199836a = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-wrapped-video-preview";
        yt91VarM50626j.f276052f = "1.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        this.f199837b = yt91VarM50626j.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f199836a.f213866a);
        zt91 zt91Var = this.f199837b;
        ofg1.m66846o(zt91Var, "location");
        arrayList.add(zt91Var);
        return new st91(arrayList);
    }
}
