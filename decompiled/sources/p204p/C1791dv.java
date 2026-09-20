package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: renamed from: p.dv */
/* JADX INFO: loaded from: classes4.dex */
public final class C1791dv implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1874fv f53328a;

    public C1791dv(C1874fv c1874fv) {
        this.f53328a = c1874fv;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f53328a.f73610e);
    }
}
