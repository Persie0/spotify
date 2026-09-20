package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class l4u0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n4u0 f129767a;

    public l4u0(n4u0 n4u0Var) {
        this.f129767a = n4u0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f129767a.f150425d);
    }
}
