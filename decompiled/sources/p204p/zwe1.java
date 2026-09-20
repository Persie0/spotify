package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes11.dex */
public final class zwe1 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bxe1 f286974a;

    public zwe1(bxe1 bxe1Var) {
        this.f286974a = bxe1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f286974a.f31854n);
    }
}
