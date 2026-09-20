package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes7.dex */
public final class ql10 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sl10 f189696a;

    public ql10(sl10 sl10Var) {
        this.f189696a = sl10Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f189696a.f210243d);
    }
}
