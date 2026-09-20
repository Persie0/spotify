package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class oc9 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vc9 f163874a;

    public oc9(vc9 vc9Var) {
        this.f163874a = vc9Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        ((Consumer) this.f163874a.f240082g.get()).accept((fn70) obj);
    }
}
