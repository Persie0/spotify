package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes3.dex */
public final class gsj implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jsj f83978a;

    public gsj(jsj jsjVar) {
        this.f83978a = jsjVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f83978a.f115504d);
    }
}
