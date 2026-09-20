package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes5.dex */
public final class lkq0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nkq0 f134434a;

    public lkq0(nkq0 nkq0Var) {
        this.f134434a = nkq0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f134434a.f154931c);
    }
}
