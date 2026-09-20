package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class dwr0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fwr0 f53737a;

    public dwr0(fwr0 fwr0Var) {
        this.f53737a = fwr0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f53737a.f74140b);
    }
}
