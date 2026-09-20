package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class ph7 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rh7 f177500a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f177501b;

    public ph7(rh7 rh7Var, long j) {
        this.f177500a = rh7Var;
        this.f177501b = j;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        this.f177500a.f199162h = this.f177501b;
    }
}
