package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class ncv0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ocv0 f152599a;

    public ncv0(ocv0 ocv0Var) {
        this.f152599a = ocv0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f152599a.f163996b);
    }
}
