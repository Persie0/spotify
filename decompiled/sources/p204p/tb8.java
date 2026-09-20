package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class tb8 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f218795a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ozo f218796b;

    public /* synthetic */ tb8(ozo ozoVar, int i) {
        this.f218795a = i;
        this.f218796b = ozoVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f218795a) {
            case 0:
                this.f218796b.f172330d.onNext(Long.valueOf(((pb8) obj).f175733a));
                break;
            default:
                this.f218796b.f172327a.onNext(((qb8) obj).f187033a);
                break;
        }
    }
}
