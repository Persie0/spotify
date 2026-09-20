package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class fy21 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hy21 f74509a;

    public fy21(hy21 hy21Var) {
        this.f74509a = hy21Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f74509a.f96440d);
    }
}
