package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class zj7 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f283378a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ka2 f283379b;

    public /* synthetic */ zj7(ka2 ka2Var, int i) {
        this.f283378a = i;
        this.f283379b = ka2Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f283378a) {
            case 0:
                hea0 hea0Var = (hea0) obj;
                ka2 ka2Var = this.f283379b;
                ka2Var.getClass();
                ka2Var.m55862d(hea0Var == hea0.f90394a, zdi0.f281727a);
                break;
            default:
                kew0 kew0Var = (kew0) obj;
                kew0 kew0Var2 = kew0.f121986a;
                ka2 ka2Var2 = this.f283379b;
                if (kew0Var == kew0Var2) {
                    boolean z = ((n6p) ((i4t0) ka2Var2.f120756c).get()).f150932a.m83284g();
                    ka2Var2.m55862d(z, aei0.f14887a);
                } else {
                    ka2Var2.getClass();
                }
                ka2Var2.m55862d(z, aei0.f14887a);
                break;
        }
    }
}
