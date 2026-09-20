package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzat implements zzan {
    public static Object zzc(ClassLoader classLoader) {
        return zzbk.zzb(classLoader, "pathList", Object.class).zzc();
    }

    public static void zzd(ClassLoader classLoader, Set set) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            "Adding native library parent directory: ".concat(String.valueOf(file.getParentFile().getAbsolutePath()));
            hashSet.add(file.getParentFile());
        }
        zzbi zzbiVarZza = zzbk.zza(zzc(classLoader), "nativeLibraryDirectories", File.class);
        hashSet.removeAll(Arrays.asList((File[]) zzbiVarZza.zzc()));
        synchronized (com.google.android.play.core.splitinstall.zzn.class) {
            hashSet.size();
            zzbiVarZza.zzb(hashSet);
        }
    }

    public static boolean zze(ClassLoader classLoader, File file, File file2, boolean z, zzas zzasVar, String str, zzar zzarVar) {
        ArrayList arrayList = new ArrayList();
        Object objZzc = zzc(classLoader);
        zzbi zzbiVarZza = zzbk.zza(objZzc, "dexElements", Object.class);
        List listAsList = Arrays.asList((Object[]) zzbiVarZza.zzc());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) zzbk.zzb(it.next(), str, File.class).zzc());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z && !zzarVar.zza(objZzc, file2, file)) {
            "Should be optimized ".concat(String.valueOf(file2.getPath()));
            return false;
        }
        zzbiVarZza.zza(Arrays.asList(zzasVar.zza(objZzc, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList.get(i));
            } catch (Exception unused) {
            }
        }
        zzbk.zza(objZzc, "dexElementsSuppressedExceptions", IOException.class).zza(arrayList);
        throw zzbhVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) {
        zzd(classLoader, set);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z) {
        return zze(classLoader, file, file2, z, new zzap(), "zip", new zzaq());
    }
}
