package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class js10 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f115358a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kbm f115359b;

    public /* synthetic */ js10(kbm kbmVar, int i) {
        this.f115358a = i;
        this.f115359b = kbmVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f115358a) {
            case 0:
                this.f115359b.m55950a(((iit) obj).f102628a);
                break;
            default:
                this.f115359b.m55950a(((git) obj).f80256a);
                break;
        }
    }
}
