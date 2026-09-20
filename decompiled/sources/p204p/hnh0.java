package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class hnh0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ inh0 f93340a;

    public hnh0(inh0 inh0Var) {
        this.f93340a = inh0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f93340a.f104003c);
    }
}
