package p204p;

import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;

/* JADX INFO: loaded from: classes9.dex */
public final class r1t implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s1t f194906a;

    public r1t(s1t s1tVar) {
        this.f194906a = s1tVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new DispatcherWorker(this.f194906a.f204794e);
    }
}
