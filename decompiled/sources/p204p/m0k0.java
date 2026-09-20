package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes10.dex */
public final class m0k0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o0k0 f138694a;

    public m0k0(o0k0 o0k0Var) {
        this.f138694a = o0k0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f138694a.f160418b);
    }
}
