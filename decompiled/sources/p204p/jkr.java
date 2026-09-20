package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class jkr implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f113372a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ guf f113373b;

    public /* synthetic */ jkr(guf gufVar, int i) {
        this.f113372a = i;
        this.f113373b = gufVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f113372a) {
            case 0:
                this.f113373b.m38797k0((ag31) obj);
                break;
            default:
                this.f113373b.m38797k0(null);
                break;
        }
    }
}
