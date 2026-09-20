package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes7.dex */
public final class ple implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Scheduler f178701a;

    public ple(Scheduler scheduler) {
        this.f178701a = scheduler;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f178701a);
    }
}
