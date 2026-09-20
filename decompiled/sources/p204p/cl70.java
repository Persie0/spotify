package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class cl70 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ el70 f39202a;

    public cl70(el70 el70Var) {
        this.f39202a = el70Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f39202a.f60635c);
    }
}
