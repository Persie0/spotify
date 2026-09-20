package p204p;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ec5 extends Service {
    /* JADX INFO: renamed from: a */
    public static ServiceInfo m38474a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ec5.class), dc5.m35636a() | 128);
    }
}
