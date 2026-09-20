package p204p;

import android.app.ActivityManager;
import android.content.Context;
import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class xo4 {
    /* JADX INFO: renamed from: a */
    public static boolean m91527a(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Alert.DURATION_SHOW_INDEFINITELY);
        if (runningServices.isEmpty()) {
            return false;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
            if (wo4.f253365a[edb.m38547C(1)] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            if ("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService".equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }
}
