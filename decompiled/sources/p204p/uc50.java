package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes5.dex */
public final class uc50 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xc50 f228942a;

    public uc50(xc50 xc50Var) {
        this.f228942a = xc50Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f228942a.f260097e);
    }
}
