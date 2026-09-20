package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class xk10 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ com.spotify.mobius.functions.Consumer f262261a;

    public xk10(com.spotify.mobius.functions.Consumer consumer) {
        this.f262261a = consumer;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        this.f262261a.accept((uk10) obj);
    }
}
