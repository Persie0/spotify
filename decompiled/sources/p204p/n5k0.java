package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes8.dex */
public final class n5k0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o5k0 f150573a;

    public n5k0(o5k0 o5k0Var) {
        this.f150573a = o5k0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f150573a.f162023b);
    }
}
