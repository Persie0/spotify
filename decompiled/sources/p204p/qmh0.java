package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class qmh0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rmh0 f190228a;

    public qmh0(rmh0 rmh0Var) {
        this.f190228a = rmh0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        com.spotify.mobius.functions.Consumer consumer = this.f190228a.f200547g;
        if (consumer != null) {
            consumer.accept(sdt0.f208085a);
        } else {
            wj50.m88260d0("eventConsumer");
            throw null;
        }
    }
}
