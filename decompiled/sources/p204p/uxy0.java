package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class uxy0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xxy0 f235067a;

    public uxy0(xxy0 xxy0Var) {
        this.f235067a = xxy0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f235067a.f267155a);
    }
}
