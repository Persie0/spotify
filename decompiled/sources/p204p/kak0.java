package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes8.dex */
public final class kak0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lak0 f120929a;

    public kak0(lak0 lak0Var) {
        this.f120929a = lak0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f120929a.f131367l);
    }
}
