package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes10.dex */
public final class ho5 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ io5 f93459a;

    public ho5(io5 io5Var) {
        this.f93459a = io5Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f93459a.f104128b);
    }
}
