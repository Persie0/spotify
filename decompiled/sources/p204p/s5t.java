package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class s5t implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t5t f205905a;

    public s5t(t5t t5tVar) {
        this.f205905a = t5tVar;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f205905a.f217357c);
    }
}
