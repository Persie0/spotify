package p204p;

import io.reactivex.rxjava3.functions.Cancellable;

/* JADX INFO: loaded from: classes4.dex */
public final class yvo implements Cancellable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f276705a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lxe f276706b;

    public /* synthetic */ yvo(lxe lxeVar, int i) {
        this.f276705a = i;
        this.f276706b = lxeVar;
    }

    @Override // io.reactivex.rxjava3.functions.Cancellable
    public final void cancel() {
        switch (this.f276705a) {
            case 0:
                this.f276706b.m60176b();
                break;
            default:
                this.f276706b.m60176b();
                break;
        }
    }
}
