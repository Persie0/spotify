package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes2.dex */
public final class e031 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i031 f54841a;

    public e031(i031 i031Var) {
        this.f54841a = i031Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f54841a.f97128f);
    }
}
