package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes8.dex */
public final class t4k0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ u4k0 f217043a;

    public t4k0(u4k0 u4k0Var) {
        this.f217043a = u4k0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f217043a.f226766f);
    }
}
