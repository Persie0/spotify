package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class wku0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xku0 f252308a;

    public wku0(xku0 xku0Var) {
        this.f252308a = xku0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f252308a.f262942a);
    }
}
