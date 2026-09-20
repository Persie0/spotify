package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: renamed from: p.yn */
/* JADX INFO: loaded from: classes4.dex */
public final class C2619yn implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2656zn f274362a;

    public C2619yn(C2656zn c2656zn) {
        this.f274362a = c2656zn;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f274362a.f284380d);
    }
}
