package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class f1q implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ g1q f64945a;

    public f1q(g1q g1qVar) {
        this.f64945a = g1qVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f64945a.f75683f);
    }
}
