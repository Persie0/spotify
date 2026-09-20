package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes7.dex */
public final class wae implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zae f249459a;

    public wae(zae zaeVar) {
        this.f249459a = zaeVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f249459a.f281050b);
    }
}
