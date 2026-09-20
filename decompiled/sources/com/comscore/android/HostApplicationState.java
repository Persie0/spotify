package com.comscore.android;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class HostApplicationState {
    public static final int BACKGROUND = 1;
    public static final int FOREGROUND = 0;
    public static final int UNKNOWN = -1;

    public static int getState(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return -1;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100) {
                    for (String str : runningAppProcessInfo.pkgList) {
                        if (str.equals(context.getPackageName())) {
                            return 0;
                        }
                    }
                }
            }
            return 1;
        } catch (Exception unused) {
            return -1;
        }
    }
}
