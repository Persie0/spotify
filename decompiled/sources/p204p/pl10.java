package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes7.dex */
public final class pl10 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sl10 f178608a;

    public pl10(sl10 sl10Var) {
        this.f178608a = sl10Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f178608a.f210243d);
    }
}
