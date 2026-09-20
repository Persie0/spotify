package p204p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: classes10.dex */
public final class fi5 implements sys0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69781a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SingleEmitter f69782b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gi5 f69783c;

    public /* synthetic */ fi5(SingleEmitter singleEmitter, gi5 gi5Var, int i) {
        this.f69781a = i;
        this.f69782b = singleEmitter;
        this.f69783c = gi5Var;
    }

    @Override // p204p.sys0
    public final iys0 create(uys0 uys0Var) {
        switch (this.f69781a) {
            case 0:
                this.f69782b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("apps-music-libs-eventsender:background_worker_send", false)));
                break;
            case 1:
                this.f69782b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("apps-music-libs-eventsender:background_worker_send_on_stop", false)));
                break;
            case 2:
                this.f69782b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("apps-music-libs-eventsender:enable_rate_limiter", false)));
                break;
            case 3:
                this.f69782b.onSuccess(Integer.valueOf(uys0Var.mo47706b(0, 3600, 0, "apps-music-libs-eventsender:event_sending_interval_seconds")));
                break;
            case 4:
                this.f69782b.onSuccess(Integer.valueOf(uys0Var.mo47706b(0, 43200, 0, "apps-music-libs-eventsender:heartbeat_interval")));
                break;
            case 5:
                this.f69782b.onSuccess(Integer.valueOf(uys0Var.mo47706b(0, 3600, 30, "apps-music-libs-eventsender:heartbeat_retry_interval")));
                break;
            case 6:
                this.f69782b.onSuccess(Integer.valueOf(uys0Var.mo47706b(10000, 512000, 128000, "apps-music-libs-eventsender:max_batch_bytes")));
                break;
            case 7:
                this.f69782b.onSuccess(Integer.valueOf(uys0Var.mo47706b(0, 10000, 0, "apps-music-libs-eventsender:rate_limiting_rule_1_events_per_time_unit")));
                break;
            case 8:
                this.f69782b.onSuccess(Integer.valueOf(uys0Var.mo47706b(0, 3600, 0, "apps-music-libs-eventsender:rate_limiting_rule_1_time_unit_seconds")));
                break;
            case 9:
                this.f69782b.onSuccess(Integer.valueOf(uys0Var.mo47706b(0, 10000, 0, "apps-music-libs-eventsender:rate_limiting_rule_2_events_per_time_unit")));
                break;
            case 10:
                this.f69782b.onSuccess(Integer.valueOf(uys0Var.mo47706b(0, 3600, 0, "apps-music-libs-eventsender:rate_limiting_rule_2_time_unit_seconds")));
                break;
            case 11:
                this.f69782b.onSuccess(Integer.valueOf(uys0Var.mo47706b(0, 10000, 0, "apps-music-libs-eventsender:rate_limiting_rule_3_events_per_time_unit")));
                break;
            case 12:
                this.f69782b.onSuccess(Integer.valueOf(uys0Var.mo47706b(0, 3600, 0, "apps-music-libs-eventsender:rate_limiting_rule_3_time_unit_seconds")));
                break;
            case 13:
                this.f69782b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("apps-music-libs-eventsender:retry_db_operations", false)));
                break;
            case 14:
                this.f69782b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("apps-music-libs-eventsender:send_events_on_bcd_event", false)));
                break;
            default:
                this.f69782b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("apps-music-libs-eventsender:send_full_ess2", true)));
                break;
        }
        return this.f69783c;
    }
}
