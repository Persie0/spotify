package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes10.dex */
public final class eqs0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gqs0 f61945a;

    public eqs0(gqs0 gqs0Var) {
        this.f61945a = gqs0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f61945a.f83526a);
    }
}
