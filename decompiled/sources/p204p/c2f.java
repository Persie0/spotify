package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes5.dex */
public final class c2f implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Scheduler f33379a;

    public c2f(Scheduler scheduler) {
        this.f33379a = scheduler;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f33379a);
    }
}
