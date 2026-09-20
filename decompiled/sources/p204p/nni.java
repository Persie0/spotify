package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes5.dex */
public final class nni implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oni f156427a;

    public nni(oni oniVar) {
        this.f156427a = oniVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f156427a.f167266b);
    }
}
