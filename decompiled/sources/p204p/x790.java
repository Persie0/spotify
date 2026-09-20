package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class x790 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f258859a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y790 f258860b;

    public /* synthetic */ x790(y790 y790Var, int i) {
        this.f258859a = i;
        this.f258860b = y790Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f258859a) {
            case 0:
                this.f258860b.m28330u(obj);
                break;
            default:
                this.f258860b.m28331v((Throwable) obj);
                break;
        }
    }
}
