package androidx.car.app.navigation;

import androidx.car.app.C0023j;
import androidx.car.app.C0024k;
import p204p.ikd0;
import p204p.lbc0;
import p204p.oc80;

/* JADX INFO: renamed from: androidx.car.app.navigation.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C0034b implements lbc0 {

    /* JADX INFO: renamed from: a */
    public final INavigationManager.Stub f463a;

    public C0034b(C0023j c0023j, C0024k c0024k, oc80 oc80Var) {
        this.f463a = new NavigationManager$1(this, oc80Var);
        oc80Var.mo31986a(new ikd0(this, oc80Var));
    }
}
