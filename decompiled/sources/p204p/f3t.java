package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class f3t implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ g3t f65576a;

    public f3t(g3t g3tVar) {
        this.f65576a = g3tVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f65576a.f76280e);
    }
}
