package p204p;

import android.app.KeyguardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d070 {
    /* JADX INFO: renamed from: a */
    public static KeyguardManager m34527a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m34528b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
