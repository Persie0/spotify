package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class mhu0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nhu0 f143871a;

    public mhu0(nhu0 nhu0Var) {
        this.f143871a = nhu0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f143871a.f154083a);
    }
}
