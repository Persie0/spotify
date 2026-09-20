package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzs {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.play.core.splitinstall.internal.zzu zzb = new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallInfoProvider");
    private final Context zzc;
    private final String zzd;

    public zzs(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
    }

    public static String zzb(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean zze(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final Set zzf(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        for (String str : zzh(packageInfo)) {
            if (!zze(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private final PackageInfo zzg() {
        try {
            return this.zzc.getPackageManager().getPackageInfo(this.zzd, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            zzb.zzb("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    private static final Set zzh(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                zzb.zza("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            zzb.zza("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            zzb.zza("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        zzq zzqVarZza = zzr.zza();
        if (zzqVarZza != null) {
            hashSet.addAll(zzqVarZza.zza());
        }
        return hashSet;
    }

    public final zzk zza(Bundle bundle) {
        if (bundle == null) {
            zzb.zze("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i = bundle.getInt("com.android.vending.splits");
        if (i == 0) {
            zzb.zze("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            zzk zzkVarZza = zzbg.zza(this.zzc.getResources().getXml(i), new zzi());
            if (zzkVarZza == null) {
                zzb.zze("Can't parse languages metadata.", new Object[0]);
            }
            return zzkVarZza;
        } catch (Resources.NotFoundException unused) {
            zzb.zze("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }

    public final Set zzc() {
        PackageInfo packageInfoZzg = zzg();
        return (packageInfoZzg == null || packageInfoZzg.applicationInfo == null) ? new HashSet() : zzf(packageInfoZzg);
    }

    public final Set zzd() {
        ApplicationInfo applicationInfo;
        PackageInfo packageInfoZzg = zzg();
        HashSet hashSet = null;
        if (packageInfoZzg != null && (applicationInfo = packageInfoZzg.applicationInfo) != null) {
            zzk zzkVarZza = zza(applicationInfo.metaData);
            if (zzkVarZza == null) {
                return null;
            }
            hashSet = new HashSet();
            Set setZzh = zzh(packageInfoZzg);
            setZzh.add("");
            Set setZzf = zzf(packageInfoZzg);
            setZzf.add("");
            for (Map.Entry entry : zzkVarZza.zza(setZzf).entrySet()) {
                if (setZzh.containsAll((Collection) entry.getValue())) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }

    public zzs(Context context) {
        this.zzc = context;
        this.zzd = context.getPackageName();
    }
}
