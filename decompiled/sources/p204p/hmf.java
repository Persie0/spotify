package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class hmf implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jmf f92974a;

    public hmf(jmf jmfVar) {
        this.f92974a = jmfVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f92974a.f113841a);
    }
}
