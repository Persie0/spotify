package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes5.dex */
public final class s8q implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ u8q f206706a;

    public s8q(u8q u8qVar) {
        this.f206706a = u8qVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f206706a.f227998a);
    }
}
