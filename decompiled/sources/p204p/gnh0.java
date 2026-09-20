package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class gnh0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ inh0 f82715a;

    public gnh0(inh0 inh0Var) {
        this.f82715a = inh0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f82715a.f104002b);
    }
}
