package p204p;

import io.reactivex.rxjava3.functions.Cancellable;

/* JADX INFO: loaded from: classes2.dex */
public final class wvx0 implements Cancellable {

    /* JADX INFO: renamed from: a */
    public final AbstractC2522w6 f255635a;

    public wvx0(AbstractC2522w6 abstractC2522w6) {
        this.f255635a = abstractC2522w6;
    }

    @Override // io.reactivex.rxjava3.functions.Cancellable
    public final void cancel() {
        this.f255635a.mo26601e(null);
    }
}
