package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes5.dex */
public final class icd implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kcd f100803a;

    public icd(kcd kcdVar) {
        this.f100803a = kcdVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f100803a.f121437g);
    }
}
