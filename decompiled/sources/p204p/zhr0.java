package p204p;

import android.app.ActivityManager;
import android.app.ApplicationStartInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zhr0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ActivityManager f283006a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhr0(ActivityManager activityManager) {
        super(0);
        this.f283006a = activityManager;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        List historicalProcessStartReasons;
        ApplicationStartInfo applicationStartInfoM46003i;
        Object c6x0Var;
        Integer num = null;
        ActivityManager activityManager = this.f283006a;
        if (activityManager == null || (historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1)) == null || (applicationStartInfoM46003i = gx31.m46003i(g6f.m43745s0(historicalProcessStartReasons))) == null) {
            return null;
        }
        int reason = applicationStartInfoM46003i.getReason();
        if (Build.VERSION.SDK_INT >= 36) {
            try {
                c6x0Var = Integer.valueOf(applicationStartInfoM46003i.getStartComponent());
            } catch (Throwable th) {
                c6x0Var = new c6x0(th);
            }
            num = (Integer) (c6x0Var instanceof c6x0 ? null : c6x0Var);
        }
        return new air0(reason, num);
    }
}
