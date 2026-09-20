package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes3.dex */
public final class fcz implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hcz f68275a;

    public fcz(hcz hczVar) {
        this.f68275a = hczVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f68275a.f89933b);
    }
}
