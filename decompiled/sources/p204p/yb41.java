package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes5.dex */
public final class yb41 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bc41 f271075a;

    public yb41(bc41 bc41Var) {
        this.f271075a = bc41Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f271075a.f25777c);
    }
}
