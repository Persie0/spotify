package p204p;

import androidx.car.app.navigation.C0034b;

/* JADX INFO: loaded from: classes3.dex */
public final class ikd0 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103090a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oc80 f103091b;

    public /* synthetic */ ikd0(oc80 oc80Var, int i) {
        this.f103090a = i;
        this.f103091b = oc80Var;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        switch (this.f103090a) {
            case 0:
                this.f103091b.mo31988d(this);
                break;
            case 1:
                zg71.m96049a();
                this.f103091b.mo31988d(this);
                break;
            default:
                this.f103091b.mo31988d(this);
                break;
        }
    }

    public ikd0(C0034b c0034b, oc80 oc80Var) {
        this.f103090a = 1;
        this.f103091b = oc80Var;
    }
}
