package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s4f1 {

    /* JADX INFO: renamed from: a */
    public static final int f205580a;

    static {
        f205580a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static PendingIntent m77197a(Context context, Intent intent, int i) {
        return PendingIntent.getActivity(context, 0, intent, i);
    }
}
