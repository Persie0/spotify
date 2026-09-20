package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes5.dex */
public final class vc50 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xc50 f240053a;

    public vc50(xc50 xc50Var) {
        this.f240053a = xc50Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f240053a.f260096d);
    }
}
