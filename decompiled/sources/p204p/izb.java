package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.WorkRunner;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes.dex */
public final class izb implements Function, Producer {

    /* JADX INFO: renamed from: a */
    public final i4t0 f107186a;

    public /* synthetic */ izb(i4t0 i4t0Var) {
        this.f107186a = i4t0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        return k0e1.m54988g(((avo) ((InterfaceC2258pj) this.f107186a.get())).f20230g, dau.f47107a);
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return (WorkRunner) this.f107186a.get();
    }
}
