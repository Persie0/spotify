package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class z1h0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f278315a;

    public z1h0(xxg0 xxg0Var) {
        yt91 yt91VarM96903c = xxg0Var.f267003b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("pigeon_wifi_streaming", null, null, null, null));
        yt91VarM96903c.f276056j = true;
        this.f278315a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(lau.f131415a);
        zt91 zt91Var = this.f278315a;
        ofg1.m66846o(zt91Var, "location");
        arrayList.add(zt91Var);
        return new st91(arrayList);
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f278315a;
        nu91Var.f248108b = st91.f213865b;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        return (ou91) nu91Var.m87248a();
    }
}
