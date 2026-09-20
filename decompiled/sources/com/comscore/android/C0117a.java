package com.comscore.android;

import android.content.Context;

/* JADX INFO: renamed from: com.comscore.android.a */
/* JADX INFO: loaded from: classes.dex */
class C0117a {

    /* JADX INFO: renamed from: a */
    private static String[] f1533a;

    /* JADX INFO: renamed from: a */
    public static Boolean m1211a(Context context, String str) {
        Boolean bool = Boolean.FALSE;
        if (f1533a == null) {
            try {
                f1533a = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            } catch (Exception unused) {
            }
        }
        if (f1533a == null) {
            return bool;
        }
        int i = 0;
        while (true) {
            String[] strArr = f1533a;
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
