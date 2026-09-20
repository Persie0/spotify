package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class tc9 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vc9 f219044a;

    public tc9(vc9 vc9Var) {
        this.f219044a = vc9Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        ((Consumer) this.f219044a.f240079d.get()).accept((f761) obj);
    }
}
