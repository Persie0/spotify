package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class th91 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vh91 f220377a;

    public th91(vh91 vh91Var) {
        this.f220377a = vh91Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f220377a.f241449c);
    }
}
