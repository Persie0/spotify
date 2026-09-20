package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class k0t implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m0t f118141a;

    public k0t(m0t m0tVar) {
        this.f118141a = m0tVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f118141a.f138733b);
    }
}
