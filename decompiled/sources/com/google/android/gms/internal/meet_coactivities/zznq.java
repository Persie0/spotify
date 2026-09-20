package com.google.android.gms.internal.meet_coactivities;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
final class zznq {
    private static final zzns zza = zzb(zzns.zzd);

    private static zzns zzb(String[] strArr) {
        zzny zznyVar;
        try {
            zznyVar = zznz.zza;
        } catch (NoClassDefFoundError unused) {
            zznyVar = null;
        }
        if (zznyVar != null) {
            return zznyVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzns) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
