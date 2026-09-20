package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes11.dex */
public final class apr implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bpr f17999a;

    public apr(bpr bprVar) {
        this.f17999a = bprVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f17999a.f29569c);
    }
}
