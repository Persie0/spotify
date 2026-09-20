package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class mra implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nra f146456a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d7y0 f146457b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gw41 f146458c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f146459d;

    public mra(nra nraVar, d7y0 d7y0Var, gw41 gw41Var, Object obj) {
        this.f146456a = nraVar;
        this.f146457b = d7y0Var;
        this.f146458c = gw41Var;
        this.f146459d = obj;
    }

    @Override // p204p.onp
    public final void onCreate(hc80 hc80Var) {
        Object objMo27875W;
        nra nraVar = this.f146456a;
        f9y0 f9y0Var = nraVar.f157480c;
        String str = nraVar.f157479b;
        if (f9y0Var.m41109b(str) != null) {
            f9y0Var.m41112e(str);
        }
        d7y0 d7y0Var = this.f146457b;
        gw41 gw41Var = this.f146458c;
        f9y0Var.m41110c(str, new lra(d7y0Var, gw41Var));
        Bundle bundleM41108a = f9y0Var.m41108a(str);
        if (bundleM41108a != null) {
            if (bundleM41108a.isEmpty()) {
                bundleM41108a = null;
            }
            if (bundleM41108a == null || (objMo27875W = d7y0Var.mo27875W(bundleM41108a, this.f146459d)) == null) {
                return;
            }
            gw41Var.mo31971e(objMo27875W);
        }
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        nra nraVar = this.f146456a;
        nraVar.f157480c.m41112e(nraVar.f157479b);
    }
}
