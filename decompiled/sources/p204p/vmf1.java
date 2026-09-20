package p204p;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class vmf1 extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z);
        }
        Log.isLoggable("CloudMessengerCompat", 3);
        return qrf1.class;
    }
}
