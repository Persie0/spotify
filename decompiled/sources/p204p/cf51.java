package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class cf51 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37273a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k6i f37274b;

    public /* synthetic */ cf51(k6i k6iVar, int i) {
        this.f37273a = i;
        this.f37274b = k6iVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f37273a) {
            case 0:
                this.f37274b.invoke(new ra51(((acx0) obj).f14472a));
                break;
            default:
                this.f37274b.invoke(new bb51(((ve51) obj).f240623d));
                break;
        }
    }
}
