package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes5.dex */
public final class hk6 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ik6 f92365a;

    public hk6(ik6 ik6Var) {
        this.f92365a = ik6Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f92365a.f103037b);
    }
}
