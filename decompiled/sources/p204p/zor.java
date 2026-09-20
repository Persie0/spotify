package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes11.dex */
public final class zor implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bpr f284863a;

    public zor(bpr bprVar) {
        this.f284863a = bprVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f284863a.f29569c);
    }
}
