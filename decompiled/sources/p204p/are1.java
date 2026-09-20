package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes11.dex */
public final class are1 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hre1 f19050a;

    public are1(hre1 hre1Var) {
        this.f19050a = hre1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f19050a.f94428c);
    }
}
