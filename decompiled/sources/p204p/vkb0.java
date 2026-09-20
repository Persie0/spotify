package p204p;

import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes8.dex */
public final class vkb0 implements vic1 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f242195a;

    /* JADX INFO: renamed from: b */
    public kkb0 f242196b;

    public vkb0(Scheduler scheduler) {
        this.f242195a = scheduler;
    }

    @Override // p204p.vic1
    /* JADX INFO: renamed from: b */
    public final mic1 mo24736b(Class cls) {
        ukb0 ukb0Var = new ukb0(this);
        kkb0 kkb0Var = this.f242196b;
        if (kkb0Var != null) {
            return MobiusLoopViewModel.m15619e(ukb0Var, kkb0Var, new cz90(this, 7));
        }
        wj50.m88260d0("initialModel");
        throw null;
    }
}
