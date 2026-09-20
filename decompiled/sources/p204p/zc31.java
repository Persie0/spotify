package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes2.dex */
public final class zc31 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bd31 f281449a;

    public zc31(bd31 bd31Var) {
        this.f281449a = bd31Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f281449a.f25997h);
    }
}
