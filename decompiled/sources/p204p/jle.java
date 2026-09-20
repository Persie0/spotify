package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes2.dex */
public final class jle implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Scheduler f113598a;

    public jle(Scheduler scheduler) {
        this.f113598a = scheduler;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f113598a);
    }
}
