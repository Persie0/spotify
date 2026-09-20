package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class ec01 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58168a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gc01 f58169b;

    public /* synthetic */ ec01(gc01 gc01Var, int i) {
        this.f58168a = i;
        this.f58169b = gc01Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f58168a) {
            case 0:
                this.f58169b.m35107j();
                break;
            default:
                this.f58169b.m35105h((Throwable) obj);
                break;
        }
    }
}
