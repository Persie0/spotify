package p204p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: classes10.dex */
public final class v84 implements sys0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f238373a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SingleEmitter f238374b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w84 f238375c;

    public /* synthetic */ v84(SingleEmitter singleEmitter, w84 w84Var, int i) {
        this.f238373a = i;
        this.f238374b = singleEmitter;
        this.f238375c = w84Var;
    }

    @Override // p204p.sys0
    public final iys0 create(uys0 uys0Var) {
        switch (this.f238373a) {
            case 0:
                this.f238374b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-gen-alpha-account-creation:parental_consent_flow_enabled", false)));
                break;
            default:
                this.f238374b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-gen-alpha-account-creation:parental_controls_transition_entry_point_enabled", false)));
                break;
        }
        return this.f238375c;
    }
}
