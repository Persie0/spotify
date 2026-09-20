package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes9.dex */
public final class qnq0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f190683a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ukq0 f190684b;

    public /* synthetic */ qnq0(ukq0 ukq0Var, int i) {
        this.f190683a = i;
        this.f190684b = ukq0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f190683a) {
            case 0:
                this.f190684b.m83339e("hubs");
                return;
            case 1:
                ukq0 ukq0Var = this.f190684b;
                synchronized (ukq0Var) {
                    ukq0Var.m83336b("offers_request");
                    ukq0.m83334g(ukq0Var, "response_decode_map");
                }
                return;
            case 2:
                this.f190684b.m83335a();
                return;
            case 3:
                ukq0 ukq0Var2 = this.f190684b;
                synchronized (ukq0Var2) {
                    ukq0Var2.m83337c("load_failed");
                }
                return;
            case 4:
                this.f190684b.m83339e("premium_marketing");
                return;
            case 5:
                ukq0 ukq0Var3 = this.f190684b;
                synchronized (ukq0Var3) {
                    ukq0Var3.m83336b("offers_request");
                    ukq0.m83334g(ukq0Var3, "response_decode_map");
                }
                return;
            case 6:
                this.f190684b.m83335a();
                return;
            default:
                ukq0 ukq0Var4 = this.f190684b;
                synchronized (ukq0Var4) {
                    ukq0Var4.m83337c("load_failed");
                }
                return;
        }
    }
}
