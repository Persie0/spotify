package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes5.dex */
public final class bwc1 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dwc1 f31612a;

    public bwc1(dwc1 dwc1Var) {
        this.f31612a = dwc1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f31612a.f53667a);
    }
}
