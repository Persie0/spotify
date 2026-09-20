package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes4.dex */
public final class px1 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sx1 f182178a;

    public px1(sx1 sx1Var) {
        this.f182178a = sx1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f182178a.f214747c);
    }
}
