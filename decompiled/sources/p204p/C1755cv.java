package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: renamed from: p.cv */
/* JADX INFO: loaded from: classes4.dex */
public final class C1755cv implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1874fv f42258a;

    public C1755cv(C1874fv c1874fv) {
        this.f42258a = c1874fv;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f42258a.f73609d);
    }
}
