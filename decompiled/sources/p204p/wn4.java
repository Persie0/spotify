package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class wn4 implements iys0 {

    /* JADX INFO: renamed from: a */
    public final boolean f253061a;

    /* JADX INFO: renamed from: b */
    public final vn4 f253062b;

    /* JADX INFO: renamed from: c */
    public final bji f253063c;

    /* JADX INFO: renamed from: d */
    public final wg61 f253064d;

    public wn4(boolean z, vn4 vn4Var, bji bjiVar) {
        this.f253061a = z;
        this.f253062b = vn4Var;
        this.f253063c = bjiVar;
        this.f253064d = new wg61(new cn4(this, 14));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m88576a() {
        wn4 wn4Var = (wn4) this.f253064d.getValue();
        return wn4Var != null ? wn4Var.m88576a() : this.f253061a;
    }

    /* JADX INFO: renamed from: b */
    public final vn4 m88577b() {
        vn4 vn4VarM88577b;
        wn4 wn4Var = (wn4) this.f253064d.getValue();
        return (wn4Var == null || (vn4VarM88577b = wn4Var.m88577b()) == null) ? this.f253062b : vn4VarM88577b;
    }

    @Override // p204p.iys0
    public final List models() {
        k8a k8aVar = new k8a("premium_referrals_settings_item_enabled", "android-referrals-settings", m88576a());
        String str = m88577b().f242992a;
        vn4[] vn4VarArrValues = vn4.values();
        ArrayList arrayList = new ArrayList(vn4VarArrValues.length);
        for (vn4 vn4Var : vn4VarArrValues) {
            arrayList.add(vn4Var.f242992a);
        }
        return h6f.m46715L(k8aVar, new k8a("settings_sub_header_copy", "android-referrals-settings", str, arrayList));
    }

    public wn4(bji bjiVar) {
        this(false, vn4.REFER_FRIENDS_TO_PREMIUM, bjiVar);
    }
}
