package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes5.dex */
public final class kkq0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nkq0 f123691a;

    public kkq0(nkq0 nkq0Var) {
        this.f123691a = nkq0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f123691a.f154930b);
    }
}
