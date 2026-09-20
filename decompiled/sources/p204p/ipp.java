package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes11.dex */
public final class ipp implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jpp f104538a;

    public ipp(jpp jppVar) {
        this.f104538a = jppVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f104538a.f114702b);
    }
}
