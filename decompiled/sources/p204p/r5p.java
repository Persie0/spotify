package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes.dex */
public final class r5p implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s5p f196084a;

    public r5p(s5p s5pVar) {
        this.f196084a = s5pVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner((Scheduler) this.f196084a.f205877g.get());
    }
}
