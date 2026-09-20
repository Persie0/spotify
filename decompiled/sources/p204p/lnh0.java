package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes2.dex */
public final class lnh0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Scheduler f135167a;

    public lnh0(Scheduler scheduler) {
        this.f135167a = scheduler;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f135167a);
    }
}
