package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class trc1 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xrc1 f223043a;

    public trc1(xrc1 xrc1Var) {
        this.f223043a = xrc1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f223043a.f265326c);
    }
}
