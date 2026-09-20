package p204p;

import io.ably.lib.rest.Auth;
import io.ably.lib.types.ErrorInfo;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class ag7 implements Auth.AuthUpdateResult {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Auth.RenewAuthResult f15302a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Auth.TokenDetails f15303b;

    public /* synthetic */ ag7(Auth.RenewAuthResult renewAuthResult, Auth.TokenDetails tokenDetails) {
        this.f15302a = renewAuthResult;
        this.f15303b = tokenDetails;
    }

    @Override // io.ably.lib.rest.Auth.AuthUpdateResult
    public final void onUpdate(boolean z, ErrorInfo errorInfo) {
        this.f15302a.onCompletion(z, this.f15303b, errorInfo);
    }
}
