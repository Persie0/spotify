package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c6f1 {

    /* JADX INFO: renamed from: a */
    public static final int f34529a;

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = 33554432;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() != 1 || str.charAt(0) < 'S' || str.charAt(0) > 'Z') {
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
        }
        f34529a = i2;
    }

    /* JADX INFO: renamed from: a */
    public static PendingIntent m31564a(Context context, Intent intent, int i) {
        return PendingIntent.getBroadcast(context, 0, intent, i);
    }
}
