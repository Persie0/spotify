package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes8.dex */
public final class tkb0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vkb0 f221116a;

    public tkb0(vkb0 vkb0Var) {
        this.f221116a = vkb0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f221116a.f242195a);
    }
}
