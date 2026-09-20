package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes7.dex */
public final class xae implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zae f259667a;

    public xae(zae zaeVar) {
        this.f259667a = zaeVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f259667a.f281051c);
    }
}
