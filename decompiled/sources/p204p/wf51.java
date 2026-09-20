package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes5.dex */
public final class wf51 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yf51 f250745a;

    public wf51(yf51 yf51Var) {
        this.f250745a = yf51Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f250745a.f272145n);
    }
}
