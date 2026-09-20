package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class l341 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m341 f129206a;

    public l341(m341 m341Var) {
        this.f129206a = m341Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f129206a.f139530d);
    }
}
