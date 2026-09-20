package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes3.dex */
public final class gcz implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hcz f78674a;

    public gcz(hcz hczVar) {
        this.f78674a = hczVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f78674a.f89933b);
    }
}
