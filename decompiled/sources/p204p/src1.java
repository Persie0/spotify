package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes9.dex */
public final class src1 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yrc1 f213300a;

    public src1(yrc1 yrc1Var) {
        this.f213300a = yrc1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f213300a.f275456b);
    }
}
