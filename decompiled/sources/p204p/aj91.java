package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class aj91 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cj91 f16202a;

    public aj91(cj91 cj91Var) {
        this.f16202a = cj91Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f16202a.f38542e);
    }
}
