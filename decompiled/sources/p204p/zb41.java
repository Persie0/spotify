package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes5.dex */
public final class zb41 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bc41 f281243a;

    public zb41(bc41 bc41Var) {
        this.f281243a = bc41Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f281243a.f25778d);
    }
}
