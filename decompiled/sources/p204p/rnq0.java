package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes9.dex */
public final class rnq0 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f200974a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ukq0 f200975b;

    public /* synthetic */ rnq0(ukq0 ukq0Var, int i) {
        this.f200974a = i;
        this.f200975b = ukq0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f200974a) {
            case 0:
                ukq0 ukq0Var = this.f200975b;
                synchronized (ukq0Var) {
                    ukq0Var.m83337c("cancelled");
                }
                return;
            default:
                ukq0 ukq0Var2 = this.f200975b;
                synchronized (ukq0Var2) {
                    ukq0Var2.m83337c("cancelled");
                }
                return;
        }
    }
}
