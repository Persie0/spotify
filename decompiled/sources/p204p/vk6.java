package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class vk6 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f242151a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xk6 f242152b;

    public /* synthetic */ vk6(xk6 xk6Var, int i) {
        this.f242151a = i;
        this.f242152b = xk6Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f242151a) {
            case 0:
                sr4 sr4Var = this.f242152b.f262289b;
                if (sr4Var != null) {
                    sr4Var.m79019k(ei6.m39081r(2), "assisted-curation", false);
                }
                break;
            default:
                sr4 sr4Var2 = this.f242152b.f262289b;
                if (sr4Var2 != null) {
                    xk6.m91264b(sr4Var2, ei6.m39081r(2));
                }
                break;
        }
    }
}
