package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes2.dex */
public final class fj31 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gj31 f70070a;

    public fj31(gj31 gj31Var) {
        this.f70070a = gj31Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f70070a.f80358m);
    }
}
