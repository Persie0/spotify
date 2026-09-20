package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class dl70 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ el70 f50135a;

    public dl70(el70 el70Var) {
        this.f50135a = el70Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f50135a.f60636d);
    }
}
