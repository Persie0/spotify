package p204p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: classes5.dex */
public final class xh6 implements Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zh6 f261451a;

    public xh6(zh6 zh6Var) {
        this.f261451a = zh6Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.f261451a.f282815a);
    }
}
