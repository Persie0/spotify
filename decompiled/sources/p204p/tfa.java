package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes8.dex */
public final class tfa implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ufa f219887a;

    public tfa(ufa ufaVar) {
        this.f219887a = ufaVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f219887a.f229730a);
    }
}
