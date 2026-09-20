package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: renamed from: p.xn */
/* JADX INFO: loaded from: classes4.dex */
public final class C2581xn implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2656zn f263473a;

    public C2581xn(C2656zn c2656zn) {
        this.f263473a = c2656zn;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f263473a.f284379c);
    }
}
