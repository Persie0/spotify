package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes10.dex */
public final class dkl0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fkl0 f49997a;

    public dkl0(fkl0 fkl0Var) {
        this.f49997a = fkl0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f49997a.f70564c);
    }
}
