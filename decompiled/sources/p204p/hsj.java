package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes3.dex */
public final class hsj implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jsj f94752a;

    public hsj(jsj jsjVar) {
        this.f94752a = jsjVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f94752a.f115505e);
    }
}
