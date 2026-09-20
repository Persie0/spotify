package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class sqf0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uqf0 f213092a;

    public sqf0(uqf0 uqf0Var) {
        this.f213092a = uqf0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f213092a.f233005b);
    }
}
