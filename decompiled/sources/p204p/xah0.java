package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class xah0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f259689a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sxg0 f259690b;

    public xah0(sxg0 sxg0Var, Integer num) {
        this.f259690b = sxg0Var;
        yt91 yt91VarM96903c = sxg0Var.f214889b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("device_row", null, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f259689a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = st91.f213865b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(lau.f131415a);
        zt91 zt91Var = this.f259689a;
        ofg1.m66846o(zt91Var, "location");
        arrayList.add(zt91Var);
        return new st91(arrayList);
    }
}
