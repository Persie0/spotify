package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class lhu0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nhu0 f133648a;

    public lhu0(nhu0 nhu0Var) {
        this.f133648a = nhu0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f133648a.f154083a);
    }
}
