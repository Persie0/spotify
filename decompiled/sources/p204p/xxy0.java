package p204p;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes10.dex */
public final class xxy0 implements vic1 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f267155a;

    /* JADX INFO: renamed from: b */
    public final oxy0 f267156b;

    /* JADX INFO: renamed from: c */
    public final og6 f267157c;

    /* JADX INFO: renamed from: d */
    public final vyr0 f267158d;

    /* JADX INFO: renamed from: e */
    public final try0 f267159e;

    /* JADX INFO: renamed from: f */
    public final yxy0 f267160f;

    public xxy0(Scheduler scheduler, oxy0 oxy0Var, og6 og6Var, vyr0 vyr0Var, try0 try0Var, yxy0 yxy0Var) {
        this.f267155a = scheduler;
        this.f267156b = oxy0Var;
        this.f267157c = og6Var;
        this.f267158d = vyr0Var;
        this.f267159e = try0Var;
        this.f267160f = yxy0Var;
    }

    @Override // p204p.vic1
    /* JADX INFO: renamed from: b */
    public final mic1 mo24736b(Class cls) {
        return new txy0(new wxy0(this), this.f267157c, this.f267160f, this.f267158d);
    }
}
