package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class vb2 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f239376a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xb2 f239377b;

    public /* synthetic */ vb2(xb2 xb2Var, int i) {
        this.f239376a = i;
        this.f239377b = xb2Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f239376a) {
            case 0:
                this.f239377b.f259818c.invoke();
                break;
            default:
                this.f239377b.f259817b.invoke();
                break;
        }
    }
}
