package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class b0s0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d0s0 f22093a;

    public b0s0(d0s0 d0s0Var) {
        this.f22093a = d0s0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f22093a.f44033a);
    }
}
