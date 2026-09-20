package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class j1a1 extends luk {

    /* JADX INFO: renamed from: c */
    public static final j1a1 f107711c = new j1a1();

    @Override // p204p.luk
    /* JADX INFO: renamed from: Q */
    public final luk mo40637Q(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: r */
    public final void mo30646r(juk jukVar, Runnable runnable) {
        zie1 zie1Var = (zie1) jukVar.mo26595B(zie1.f283146c);
        if (zie1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        zie1Var.f283147b = true;
    }

    @Override // p204p.luk
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
