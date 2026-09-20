package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public final class jfd1 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f111879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lfd1 f111880b;

    public /* synthetic */ jfd1(lfd1 lfd1Var, int i) {
        this.f111879a = i;
        this.f111880b = lfd1Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f111879a) {
            case 0:
                lfd1 lfd1Var = this.f111880b;
                lfd1Var.f132926e.onNext((m291) obj);
                lfd1Var.f132929h.onNext(Boolean.TRUE);
                break;
            default:
                this.f111880b.f132929h.onNext(Boolean.FALSE);
                break;
        }
    }
}
