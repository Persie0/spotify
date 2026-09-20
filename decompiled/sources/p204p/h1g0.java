package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class h1g0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i1g0 f86624a;

    public h1g0(i1g0 i1g0Var) {
        this.f86624a = i1g0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f86624a.f97530d);
    }
}
