package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class bj91 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cj91 f27646a;

    public bj91(cj91 cj91Var) {
        this.f27646a = cj91Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f27646a.f38541d);
    }
}
