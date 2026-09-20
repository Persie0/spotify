package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes2.dex */
public final class kj00 implements Producer {

    /* JADX INFO: renamed from: a */
    public static final kj00 f123191a = new kj00();

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        n5q n5qVar = xsr.f265651a;
        return new DispatcherWorker(pvb0.f181680a);
    }
}
