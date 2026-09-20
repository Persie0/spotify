package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class imf implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jmf f103698a;

    public imf(jmf jmfVar) {
        this.f103698a = jmfVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f103698a.f113841a);
    }
}
