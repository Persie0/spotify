package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class ctr0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ftr0 f41967a;

    public ctr0(ftr0 ftr0Var) {
        this.f41967a = ftr0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f41967a.f73288h);
    }
}
