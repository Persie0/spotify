package p204p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes2.dex */
public final class xub0 implements onp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f266042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f266043b;

    public /* synthetic */ xub0(Object obj, int i) {
        this.f266042a = i;
        this.f266043b = obj;
    }

    @Override // p204p.onp
    public final void onDestroy(hc80 hc80Var) {
        switch (this.f266042a) {
            case 0:
                ((Disposable) this.f266043b).dispose();
                hc80Var.getLifecycle().mo31988d(this);
                break;
            default:
                ((vnn0) this.f266043b).f243182c.dispose();
                break;
        }
    }
}
