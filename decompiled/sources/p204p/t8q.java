package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes5.dex */
public final class t8q implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ u8q f218123a;

    public t8q(u8q u8qVar) {
        this.f218123a = u8qVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f218123a.f227998a);
    }
}
