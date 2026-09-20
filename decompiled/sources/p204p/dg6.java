package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes5.dex */
public final class dg6 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eg6 f48742a;

    public dg6(eg6 eg6Var) {
        this.f48742a = eg6Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f48742a.f59228b);
    }
}
