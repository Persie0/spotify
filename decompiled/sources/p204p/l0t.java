package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class l0t implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m0t f128503a;

    public l0t(m0t m0tVar) {
        this.f128503a = m0tVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f128503a.f138735d);
    }
}
