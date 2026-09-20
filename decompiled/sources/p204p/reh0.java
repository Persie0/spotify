package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class reh0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f198369a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vch0 f198370b;

    public reh0(vch0 vch0Var, String str, Integer num) {
        this.f198370b = vch0Var;
        yt91 yt91VarM96903c = vch0Var.f240135c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("swatch_button", str, num, null, null));
        yt91VarM96903c.f276056j = false;
        this.f198369a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        st91 st91Var2 = this.f198370b.f240134b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(st91Var2.f213866a);
        zt91 zt91Var = this.f198369a;
        ofg1.m66846o(zt91Var, "location");
        arrayList.add(zt91Var);
        return new st91(arrayList);
    }
}
