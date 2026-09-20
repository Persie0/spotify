package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class eys implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fys f64158a;

    public eys(fys fysVar) {
        this.f64158a = fysVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f64158a.f74837e);
    }
}
