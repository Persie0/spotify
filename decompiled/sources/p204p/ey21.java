package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class ey21 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hy21 f63929a;

    public ey21(hy21 hy21Var) {
        this.f63929a = hy21Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f63929a.f96441e);
    }
}
