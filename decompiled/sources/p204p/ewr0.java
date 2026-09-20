package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class ewr0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fwr0 f63594a;

    public ewr0(fwr0 fwr0Var) {
        this.f63594a = fwr0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f63594a.f74141c);
    }
}
