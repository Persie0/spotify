package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class m1v0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139097a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n1v0 f139098b;

    public /* synthetic */ m1v0(n1v0 n1v0Var, int i) {
        this.f139097a = i;
        this.f139098b = n1v0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f139097a) {
            case 0:
                this.f139098b.f149517c.m95241e();
                break;
            case 1:
                n1v0 n1v0Var = this.f139098b;
                z2z0 z2z0Var = n1v0Var.f149517c;
                z2z0Var.m95240d(2);
                z2z0Var.m95239c();
                n1v0.m63527a(n1v0Var, 1, null, "Failed to load recent searches. " + ((Throwable) obj).getMessage());
                break;
            default:
                z2z0 z2z0Var2 = this.f139098b.f149517c;
                z2z0Var2.m95240d(3);
                z2z0Var2.m95239c();
                break;
        }
    }
}
