package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class vyx implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f246342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ azx f246343b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ roa f246344c;

    public /* synthetic */ vyx(azx azxVar, roa roaVar, int i) {
        this.f246342a = i;
        this.f246343b = azxVar;
        this.f246344c = roaVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f246342a) {
            case 0:
                azx.m27702c(this.f246343b, ((fxx) obj).f74479a, this.f246344c.f201210m);
                break;
            case 1:
                azx.m27701b(this.f246343b, this.f246344c);
                break;
            case 2:
                azx.m27702c(this.f246343b, ((fxx) obj).f74479a, this.f246344c.f201210m);
                break;
            default:
                azx.m27701b(this.f246343b, this.f246344c);
                break;
        }
    }
}
