package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public final class vsp implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f244475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wsp f244476b;

    public /* synthetic */ vsp(wsp wspVar, int i) {
        this.f244475a = i;
        this.f244476b = wspVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f244475a) {
            case 0:
                this.f244476b.m35106i();
                break;
            default:
                this.f244476b.m35105h((Throwable) obj);
                break;
        }
    }
}
