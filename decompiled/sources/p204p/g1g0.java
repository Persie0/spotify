package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class g1g0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i1g0 f75615a;

    public g1g0(i1g0 i1g0Var) {
        this.f75615a = i1g0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f75615a.f97528b);
    }
}
