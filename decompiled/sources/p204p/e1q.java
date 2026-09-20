package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class e1q implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ g1q f55234a;

    public e1q(g1q g1qVar) {
        this.f55234a = g1qVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f55234a.f75684g);
    }
}
