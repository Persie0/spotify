package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class zg51 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ com.spotify.mobius.functions.Consumer f282505a;

    public zg51(com.spotify.mobius.functions.Consumer consumer) {
        this.f282505a = consumer;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        this.f282505a.accept((kh51) obj);
    }
}
