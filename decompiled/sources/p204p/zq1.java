package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes4.dex */
public final class zq1 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ br1 f285278a;

    public zq1(br1 br1Var) {
        this.f285278a = br1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f285278a.f29931b);
    }
}
