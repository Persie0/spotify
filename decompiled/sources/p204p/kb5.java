package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class kb5 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f121087a;

    /* JADX INFO: renamed from: b */
    public final se0 f121088b;

    /* JADX INFO: renamed from: c */
    public final w0e1 f121089c;

    /* JADX INFO: renamed from: d */
    public final rf9 f121090d;

    /* JADX INFO: renamed from: e */
    public final wg61 f121091e = new wg61(new uu4(this, 18));

    public kb5(Scheduler scheduler, se0 se0Var, w0e1 w0e1Var, rf9 rf9Var) {
        this.f121087a = scheduler;
        this.f121088b = se0Var;
        this.f121089c = w0e1Var;
        this.f121090d = rf9Var;
    }

    /* JADX INFO: renamed from: a */
    public final za5 m55931a() {
        ActivityInfo activityInfo;
        for (ib5 ib5Var : g6f.m43728j1((Iterable) this.f121090d.f198547a.get())) {
            za5 za5Var = ib5Var.f100436a;
            Context context = this.f121088b.f208119a;
            ComponentName componentName = new ComponentName(context, "com.spotify.music.MainActivity");
            PackageManager packageManager = context.getPackageManager();
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            boolean zBooleanValue = false;
            if (componentEnabledSetting == 0) {
                try {
                    ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(context.getPackageName(), 1).activities;
                    if (activityInfoArr != null) {
                        int length = activityInfoArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                activityInfo = null;
                                break;
                            }
                            activityInfo = activityInfoArr[i];
                            if (wj50.m88271j(activityInfo.name, "com.spotify.music.MainActivity")) {
                                break;
                            }
                            i++;
                        }
                        Boolean boolValueOf = activityInfo != null ? Boolean.valueOf(activityInfo.enabled) : null;
                        if (boolValueOf != null) {
                            zBooleanValue = boolValueOf.booleanValue();
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } else if (componentEnabledSetting == 1) {
                zBooleanValue = true;
            }
            if (zBooleanValue) {
                return ib5Var.f100436a;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
