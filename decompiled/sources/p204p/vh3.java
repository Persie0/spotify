package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes11.dex */
public final class vh3 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ci3 f241396a;

    public vh3(ci3 ci3Var) {
        this.f241396a = ci3Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f241396a.f38198c);
    }
}
