package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class tqf0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uqf0 f222808a;

    public tqf0(uqf0 uqf0Var) {
        this.f222808a = uqf0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f222808a.f233007d);
    }
}
