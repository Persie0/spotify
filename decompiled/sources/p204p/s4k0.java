package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes8.dex */
public final class s4k0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ u4k0 f205610a;

    public s4k0(u4k0 u4k0Var) {
        this.f205610a = u4k0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f205610a.f226766f);
    }
}
