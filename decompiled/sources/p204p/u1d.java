package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes5.dex */
public final class u1d implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x1d f225756a;

    public u1d(x1d x1dVar) {
        this.f225756a = x1dVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f225756a.f257165d);
    }
}
