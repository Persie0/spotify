package p204p;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wwz0 implements n2l {

    /* JADX INFO: renamed from: a */
    public final Context f255860a;

    /* JADX INFO: renamed from: b */
    public final int f255861b = Process.myUid();

    public wwz0(Context context) {
        this.f255860a = context;
    }

    @Override // p204p.o2l
    /* JADX INFO: renamed from: a */
    public final srw0 mo53449a() {
        StringBuilder sb = new StringBuilder(2048);
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) this.f255860a.getApplicationContext().getSystemService("activity")).getRunningServices(10000);
        ArrayList<ActivityManager.RunningServiceInfo> arrayList = new ArrayList();
        for (Object obj : runningServices) {
            if (((ActivityManager.RunningServiceInfo) obj).uid == this.f255861b) {
                arrayList.add(obj);
            }
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : arrayList) {
            sb.append("Service: ");
            sb.append(runningServiceInfo.service.getClassName());
            sb.append(" Client count: ");
            sb.append(runningServiceInfo.clientCount);
            sb.append(" Crash count: ");
            sb.append(runningServiceInfo.crashCount);
            sb.append(" Foreground state: ");
            sb.append(runningServiceInfo.foreground);
            sb.append('\n');
        }
        return new srw0("State of Services", "Lists the current state of our Services", sb.toString());
    }
}
