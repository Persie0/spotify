package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: classes11.dex */
public final class wor implements zb80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ObservableEmitter f253561a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f253562b;

    public wor(ObservableEmitter observableEmitter, long j) {
        this.f253561a = observableEmitter;
        this.f253562b = j;
    }

    @Override // p204p.zb80
    /* JADX INFO: renamed from: y */
    public final void mo26206y(hc80 hc80Var, ta80 ta80Var) {
        int i = vor.f243523a[ta80Var.ordinal()];
        ObservableEmitter observableEmitter = this.f253561a;
        if (i == 1) {
            observableEmitter.onNext(new pqm0(Boolean.TRUE, Long.valueOf(this.f253562b)));
        } else {
            if (i != 2) {
                return;
            }
            observableEmitter.onNext(new pqm0(Boolean.FALSE, 0L));
        }
    }
}
