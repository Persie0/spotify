package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class b4b0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c4b0 f23295a;

    public b4b0(c4b0 c4b0Var) {
        this.f23295a = c4b0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f23295a.f33913j);
    }
}
