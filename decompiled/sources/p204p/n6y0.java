package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class n6y0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ r6y0 f150982a;

    public n6y0(r6y0 r6y0Var) {
        this.f150982a = r6y0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f150982a.f196377b);
    }
}
