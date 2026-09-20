package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class uh91 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vh91 f230388a;

    public uh91(vh91 vh91Var) {
        this.f230388a = vh91Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f230388a.f241448b);
    }
}
