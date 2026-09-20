package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class pw61 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qw61 f181923a;

    public pw61(qw61 qw61Var) {
        this.f181923a = qw61Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f181923a.f193191b);
    }
}
