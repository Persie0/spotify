package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class ddw0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ edw0 f47881a;

    public ddw0(edw0 edw0Var) {
        this.f47881a = edw0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f47881a.f58618c);
    }
}
