package p204p;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzaf;

/* JADX INFO: loaded from: classes.dex */
public abstract class hbf1 {

    /* JADX INFO: renamed from: a */
    public static final Uri f89530a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a */
    public static Intent m47029a(Context context, dqg1 dqg1Var) throws zzaf {
        Bundle bundleCall;
        String str = dqg1Var.f51992a;
        Intent intent = null;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (dqg1Var.f51994c) {
            Bundle bundleM36606f = dq60.m36606f("serviceActionBundleKey", str);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f89530a);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundleM36606f);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                new StringBuilder(str.length() + 72);
                                throw new zzaf(new lzi(25, pendingIntent, null));
                            }
                        }
                    }
                    if (intent == null) {
                        "Dynamic lookup for intent failed for action: ".concat(str);
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (RemoteException e) {
                e = e;
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            } catch (IllegalArgumentException e2) {
                e = e2;
                "Dynamic intent resolution failed: ".concat(e.toString());
                bundleCall = null;
            }
        }
        return intent == null ? new Intent(str).setPackage(dqg1Var.f51993b) : intent;
    }
}
