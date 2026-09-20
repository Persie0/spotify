package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class fdv0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68577a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sr4 f68578b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f68579c;

    public /* synthetic */ fdv0(sr4 sr4Var, int i, int i2) {
        this.f68577a = i2;
        this.f68578b = sr4Var;
        this.f68579c = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f68577a) {
            case 0:
                this.f68578b.m79019k(ei6.m39081r(this.f68579c), null, (4 & 4) != 0);
                break;
            default:
                this.f68578b.m79016f(ei6.m39081r(this.f68579c));
                break;
        }
    }
}
