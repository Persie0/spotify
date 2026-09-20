package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes4.dex */
public final class ar1 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ br1 f18893a;

    public ar1(br1 br1Var) {
        this.f18893a = br1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f18893a.f29931b);
    }
}
