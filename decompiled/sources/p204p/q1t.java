package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class q1t implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s1t f184399a;

    public q1t(s1t s1tVar) {
        this.f184399a = s1tVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f184399a.f204793d);
    }
}
