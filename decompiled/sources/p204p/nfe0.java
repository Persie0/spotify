package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class nfe0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153337a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ofe0 f153338b;

    public /* synthetic */ nfe0(ofe0 ofe0Var, int i) {
        this.f153337a = i;
        this.f153338b = ofe0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f153337a) {
            case 0:
                ofe0 ofe0Var = this.f153338b;
                ofe0Var.f164747g = (mfe0) obj;
                ofe0Var.m35106i();
                break;
            default:
                this.f153338b.m35105h((Throwable) obj);
                break;
        }
    }
}
