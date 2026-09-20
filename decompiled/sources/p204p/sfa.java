package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes8.dex */
public final class sfa implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ufa f208511a;

    public sfa(ufa ufaVar) {
        this.f208511a = ufaVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f208511a.f229730a);
    }
}
