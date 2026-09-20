package com.comscore.android.util;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class Permissions {

    /* JADX INFO: renamed from: a */
    private static String[] f1573a;

    public static Boolean check(Context context, String str) {
        Boolean bool = Boolean.FALSE;
        if (f1573a == null) {
            try {
                f1573a = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            } catch (Exception unused) {
            }
        }
        if (f1573a == null) {
            return bool;
        }
        int i = 0;
        while (true) {
            String[] strArr = f1573a;
            if (i >= strArr.length) {
                return bool;
            }
            if (strArr[i].equals(str)) {
                return Boolean.TRUE;
            }
            i++;
        }
    }
}
