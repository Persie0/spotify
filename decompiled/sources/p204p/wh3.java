package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes11.dex */
public final class wh3 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ci3 f251237a;

    public wh3(ci3 ci3Var) {
        this.f251237a = ci3Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f251237a.f38198c);
    }
}
