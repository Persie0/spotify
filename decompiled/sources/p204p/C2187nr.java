package p204p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: renamed from: p.nr */
/* JADX INFO: loaded from: classes18.dex */
public final class C2187nr implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f157359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1993iw f157360b;

    public /* synthetic */ C2187nr(C1993iw c1993iw, int i) {
        this.f157359a = i;
        this.f157360b = c1993iw;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public final Object mo98394apply(Object obj) {
        switch (this.f157359a) {
            case 0:
                return xul0.m92201d(this.f157360b.f106304a);
            default:
                C1993iw c1993iw = this.f157360b;
                return c1993iw.f106306c != null ? new hzq0(c1993iw) : C2244p5.f174033a;
        }
    }
}
