package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes5.dex */
public final class ic51 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jc51 f100741a;

    public ic51(jc51 jc51Var) {
        this.f100741a = jc51Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f100741a.f110996f);
    }
}
