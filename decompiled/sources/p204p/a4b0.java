package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class a4b0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c4b0 f12187a;

    public a4b0(c4b0 c4b0Var) {
        this.f12187a = c4b0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f12187a.f33913j);
    }
}
