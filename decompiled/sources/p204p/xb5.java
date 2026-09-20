package p204p;

import android.app.PendingIntent;
import android.os.Bundle;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;

/* JADX INFO: loaded from: classes2.dex */
public final class xb5 {

    /* JADX INFO: renamed from: a */
    public final btv0 f259840a;

    public xb5(btv0 btv0Var, btv0 btv0Var2, btv0 btv0Var3) {
        this.f259840a = btv0Var2;
    }

    /* JADX INFO: renamed from: a */
    public final PendingIntent m90305a(AppLifecycleServicePendingIntent appLifecycleServicePendingIntent, Bundle bundle) {
        appLifecycleServicePendingIntent.toString();
        gh00 gh00Var = (gh00) this.f259840a.get(appLifecycleServicePendingIntent);
        if (gh00Var != null) {
            return (PendingIntent) gh00Var.invoke(bundle);
        }
        throw new IllegalArgumentException("Non-existing pending intent for " + appLifecycleServicePendingIntent);
    }
}
