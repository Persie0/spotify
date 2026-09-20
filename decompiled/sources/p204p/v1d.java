package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes5.dex */
public final class v1d implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x1d f236323a;

    public v1d(x1d x1dVar) {
        this.f236323a = x1dVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f236323a.f257164c);
    }
}
