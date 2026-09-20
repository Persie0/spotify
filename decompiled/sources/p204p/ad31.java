package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes2.dex */
public final class ad31 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bd31 f14511a;

    public ad31(bd31 bd31Var) {
        this.f14511a = bd31Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f14511a.f25997h);
    }
}
