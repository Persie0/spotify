package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class eh8 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59515a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wzo f59516b;

    public /* synthetic */ eh8(wzo wzoVar, int i) {
        this.f59515a = i;
        this.f59516b = wzoVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f59515a) {
            case 0:
                this.f59516b.f256636d.onNext(((ug8) obj).f230014a);
                break;
            case 1:
                this.f59516b.f256638f.onNext(Long.valueOf(((vg8) obj).f241178a));
                break;
            default:
                this.f59516b.f256634b.onNext(((wg8) obj).f251004a);
                break;
        }
    }
}
