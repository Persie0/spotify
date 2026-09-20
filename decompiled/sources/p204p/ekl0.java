package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes10.dex */
public final class ekl0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fkl0 f60472a;

    public ekl0(fkl0 fkl0Var) {
        this.f60472a = fkl0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f60472a.f70565d);
    }
}
