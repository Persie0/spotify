package p204p;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class nwz0 {

    /* JADX INFO: renamed from: a */
    public final String f159310a;

    public nwz0(String str) {
        this.f159310a = str;
    }

    /* JADX INFO: renamed from: a */
    public static Intent m65808a(Context context, String str) {
        return new Intent(str).setClassName(context, "com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver");
    }

    /* JADX INFO: renamed from: b */
    public final Intent m65809b(Context context, String str) {
        return new Intent(str).setClassName(context, this.f159310a);
    }
}
