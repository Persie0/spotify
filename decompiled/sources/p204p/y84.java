package p204p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: classes10.dex */
public final class y84 implements sys0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f270189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SingleEmitter f270190b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z84 f270191c;

    public /* synthetic */ y84(SingleEmitter singleEmitter, z84 z84Var, int i) {
        this.f270189a = i;
        this.f270190b = singleEmitter;
        this.f270191c = z84Var;
    }

    @Override // p204p.sys0
    public final iys0 create(uys0 uys0Var) {
        switch (this.f270189a) {
            case 0:
                this.f270190b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-gen-alpha-blocking:is_allowlisting_management_enabled", false)));
                break;
            case 1:
                this.f270190b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-gen-alpha-blocking:is_managed_account_allowlisting_requests_page_enabled", false)));
                break;
            default:
                this.f270190b.onSuccess(Boolean.valueOf(uys0Var.mo47707c("android-gen-alpha-blocking:is_my_allowlisting_requests_page_enabled", false)));
                break;
        }
        return this.f270191c;
    }
}
