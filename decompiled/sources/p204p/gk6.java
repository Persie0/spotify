package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes5.dex */
public final class gk6 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ik6 f80739a;

    public gk6(ik6 ik6Var) {
        this.f80739a = ik6Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f80739a.f103036a);
    }
}
