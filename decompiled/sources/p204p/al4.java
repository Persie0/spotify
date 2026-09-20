package p204p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: classes10.dex */
public final class al4 implements sys0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f16766a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SingleEmitter f16767b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bl4 f16768c;

    public /* synthetic */ al4(SingleEmitter singleEmitter, bl4 bl4Var, int i) {
        this.f16766a = i;
        this.f16767b = singleEmitter;
        this.f16768c = bl4Var;
    }

    @Override // p204p.sys0
    public final iys0 create(uys0 uys0Var) {
        switch (this.f16766a) {
            case 0:
                this.f16767b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-perf-tracking:jank_coordinator_enabled", false)));
                break;
            default:
                this.f16767b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-perf-tracking:observability_platform_enabled", false)));
                break;
        }
        return this.f16768c;
    }
}
