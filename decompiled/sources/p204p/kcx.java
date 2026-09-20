package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes8.dex */
public final class kcx implements Producer {

    /* JADX INFO: renamed from: a */
    public static final kcx f121559a = new kcx();

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        n5q n5qVar = xsr.f265651a;
        return new DispatcherWorker(pvb0.f181680a);
    }
}
