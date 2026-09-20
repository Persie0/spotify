package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class rrc1 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xrc1 f202018a;

    public rrc1(xrc1 xrc1Var) {
        this.f202018a = xrc1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f202018a.f265325b);
    }
}
