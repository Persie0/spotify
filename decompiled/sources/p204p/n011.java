package p204p;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n011 {

    /* JADX INFO: renamed from: a */
    public final dj70 f148857a;

    /* JADX INFO: renamed from: b */
    public final k5m0 f148858b;

    public n011(dj70 dj70Var, k5m0 k5m0Var) {
        this.f148857a = dj70Var;
        this.f148858b = k5m0Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m63274b(n011 n011Var, lu01 lu01Var, Bundle bundle, l511 l511Var, d850 d850Var, List list, int i) {
        if ((i & 2) != 0) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = bundle;
        if ((i & 16) != 0) {
            list = lau.f131415a;
        }
        n011Var.m63275a(lu01Var, bundle2, l511Var, d850Var, list);
    }

    /* JADX INFO: renamed from: a */
    public final void m63275a(lu01 lu01Var, Bundle bundle, l511 l511Var, d850 d850Var, List list) {
        String str;
        String str2;
        na6.m63962j(d850Var != null, "Share sheet opened with a null interaction logging result. Please make sure to provide one.");
        eo01 eo01Var = new eo01(lu01Var, bundle, l511Var, list);
        String value = l511Var.getValue();
        ocm0 ocm0VarMo32928a = this.f148857a.mo32928a(aey0.MAIN);
        String str3 = "";
        if (ocm0VarMo32928a == null || (str = ocm0VarMo32928a.f163961c) == null) {
            str = "";
        }
        if (ocm0VarMo32928a != null && (str2 = ocm0VarMo32928a.f163960b) != null) {
            str3 = str2;
        }
        Bundle bundleM54325c = new ju01(str, str3, value, eo01Var).m54325c();
        he90 he90VarM47528g = hhg1.m47528g("spotify:share-sheet");
        he90VarM47528g.m47295y(d850Var);
        k5m0.m55539d(this.f148858b, he90VarM47528g.m47272b(), bundleM54325c, 4);
    }
}
