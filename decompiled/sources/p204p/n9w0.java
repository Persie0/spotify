package p204p;

import android.os.Build;
import android.p001os.OutcomeReceiver;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class n9w0 implements OutcomeReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gbb f151877a;

    public n9w0(gbb gbbVar) {
        this.f151877a = gbbVar;
    }

    public final void onError(Throwable th) {
        th.toString();
        if (!Log.isLoggable("startRemoteActivity", 3)) {
            Build.TYPE.equals("user");
        }
        this.f151877a.m44212c(th);
    }

    public final void onResult(Object obj) {
        if (!Log.isLoggable("startRemoteActivity", 3)) {
            Build.TYPE.equals("user");
        }
        this.f151877a.m44211b(null);
    }
}
