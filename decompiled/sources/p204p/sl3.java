package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes3.dex */
public final class sl3 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ul3 f210279a;

    public sl3(ul3 ul3Var) {
        this.f210279a = ul3Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f210279a.f231421e);
    }
}
