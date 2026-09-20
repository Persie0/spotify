package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes10.dex */
public final class fqs0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gqs0 f72257a;

    public fqs0(gqs0 gqs0Var) {
        this.f72257a = gqs0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f72257a.f83527b);
    }
}
