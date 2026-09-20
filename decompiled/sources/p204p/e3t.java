package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class e3t implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ g3t f55881a;

    public e3t(g3t g3tVar) {
        this.f55881a = g3tVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f55881a.f76279d);
    }
}
