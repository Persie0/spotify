package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes5.dex */
public final class jcd implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kcd f111070a;

    public jcd(kcd kcdVar) {
        this.f111070a = kcdVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f111070a.f121433c);
    }
}
