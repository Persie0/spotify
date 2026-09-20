package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class gc9 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vc9 f78514a;

    public gc9(vc9 vc9Var) {
        this.f78514a = vc9Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        ((Consumer) this.f78514a.f240080e.get()).accept((pd9) obj);
    }
}
