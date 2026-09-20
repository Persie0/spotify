package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes3.dex */
public final class rl3 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ul3 f200212a;

    public rl3(ul3 ul3Var) {
        this.f200212a = ul3Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f200212a.f231420d);
    }
}
