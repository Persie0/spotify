package p204p;

import com.android.installreferrer.api.InstallReferrerClient;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class f050 {

    /* JADX INFO: renamed from: a */
    public final InstallReferrerClient f64547a;

    /* JADX INFO: renamed from: b */
    public final d050 f64548b;

    public f050(InstallReferrerClient installReferrerClient, d050 d050Var) {
        this.f64547a = installReferrerClient;
        this.f64548b = d050Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m40438a() {
        InstallReferrerClient installReferrerClient = this.f64547a;
        if (installReferrerClient.isReady()) {
            Logger.m3969e("End InstallReferrerClient connection", new Object[0]);
            installReferrerClient.endConnection();
        }
    }
}
