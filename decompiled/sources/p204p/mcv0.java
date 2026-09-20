package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes10.dex */
public final class mcv0 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ocv0 f142255a;

    public mcv0(ocv0 ocv0Var) {
        this.f142255a = ocv0Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f142255a.f163996b);
    }
}
