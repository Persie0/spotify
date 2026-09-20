package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes4.dex */
public final class qx1 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sx1 f193452a;

    public qx1(sx1 sx1Var) {
        this.f193452a = sx1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f193452a.f214748d);
    }
}
