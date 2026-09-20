package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes3.dex */
public final class f9c implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i9c f67217a;

    public f9c(i9c i9cVar) {
        this.f67217a = i9cVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f67217a.f99984d);
    }
}
