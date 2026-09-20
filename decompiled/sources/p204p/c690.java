package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes7.dex */
public final class c690 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ luk f34435a;

    public c690(luk lukVar) {
        this.f34435a = lukVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f34435a);
    }
}
