package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class r5t implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t5t f196119a;

    public r5t(t5t t5tVar) {
        this.f196119a = t5tVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f196119a.f217356b);
    }
}
