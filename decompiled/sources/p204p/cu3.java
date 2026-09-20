package p204p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: classes2.dex */
public final class cu3 implements sys0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42025a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SingleEmitter f42026b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iys0 f42027c;

    public /* synthetic */ cu3(SingleEmitter singleEmitter, iys0 iys0Var, int i) {
        this.f42025a = i;
        this.f42026b = singleEmitter;
        this.f42027c = iys0Var;
    }

    @Override // p204p.sys0
    public final iys0 create(uys0 uys0Var) {
        switch (this.f42025a) {
            case 0:
                this.f42026b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-address:show_address_settings_item", false)));
                return (du3) this.f42027c;
            case 1:
                this.f42026b.onSuccess((cy3) uys0Var.mo47705a("android-cal-rollout-service:enable_cal", cy3.DISABLED));
                return (fy3) this.f42027c;
            case 2:
                this.f42026b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-media-session:media3_enabled", false)));
                return (eh4) this.f42027c;
            case 3:
                this.f42026b.onSuccess(Integer.valueOf(uys0Var.mo47706b(0, 10000, 10, "android-perf-tracking:ads_fetch_oops_sampling_bps")));
                return (bl4) this.f42027c;
            default:
                this.f42026b.onSuccess(Integer.valueOf(uys0Var.mo47706b(1, 1000, 100, "apps-music-libs-eventsender:max_batch_size")));
                return (gi5) this.f42027c;
        }
    }
}
