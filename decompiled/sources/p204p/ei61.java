package p204p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ei61 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f59799a = 0;

    /* JADX INFO: renamed from: a */
    public static boolean m39083a(Context context) {
        Intent intent = new Intent(context, (Class<?>) ei61.class);
        intent.setPackage(context.getPackageName());
        return context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0;
    }
}
