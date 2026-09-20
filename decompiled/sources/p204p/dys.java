package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class dys implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fys f54436a;

    public dys(fys fysVar) {
        this.f54436a = fysVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f54436a.f74835c);
    }
}
