package p204p;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class wf60 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f250752a = 0;

    static {
        gaz.m44194g("SystemJobScheduler");
    }

    /* JADX INFO: renamed from: a */
    public static final JobScheduler m87972a(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return Build.VERSION.SDK_INT >= 34 ? AbstractC1665af.m25780k(jobScheduler) : jobScheduler;
    }
}
