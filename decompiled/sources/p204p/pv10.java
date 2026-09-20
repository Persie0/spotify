package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class pv10 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f181569a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v0y f181570b;

    public /* synthetic */ pv10(v0y v0yVar, int i) {
        this.f181569a = i;
        this.f181570b = v0yVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f181569a) {
            case 0:
                v0y.m84416d(this.f181570b, ((nv10) obj).f158758a, false, 6);
                break;
            default:
                v0y.m84416d(this.f181570b, ((b270) obj).f22510a, false, 6);
                break;
        }
    }
}
