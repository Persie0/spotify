package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes5.dex */
public final class xf51 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yf51 f260841a;

    public xf51(yf51 yf51Var) {
        this.f260841a = yf51Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f260841a.f272145n);
    }
}
