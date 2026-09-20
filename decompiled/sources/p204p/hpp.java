package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes11.dex */
public final class hpp implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jpp f93824a;

    public hpp(jpp jppVar) {
        this.f93824a = jppVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f93824a.f114702b);
    }
}
