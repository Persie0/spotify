package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes2.dex */
public final class mex implements Producer {

    /* JADX INFO: renamed from: a */
    public static final mex f142879a = new mex();

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(xsr.f265651a);
    }
}
