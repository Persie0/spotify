package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class k341 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m341 f118761a;

    public k341(m341 m341Var) {
        this.f118761a = m341Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f118761a.f139531e);
    }
}
