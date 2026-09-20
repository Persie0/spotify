package com.google.android.play.core.splitinstall.internal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzay implements zzan {
    public static void zzc(ClassLoader classLoader, Set set, zzax zzaxVar) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object objZzc = zzat.zzc(classLoader);
        zzbj zzbjVarZzb = zzbk.zzb(objZzc, "nativeLibraryDirectories", List.class);
        synchronized (com.google.android.play.core.splitinstall.zzn.class) {
            ArrayList arrayList = new ArrayList((Collection) zzbjVarZzb.zzc());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            zzbjVarZzb.zze(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrZza = zzaxVar.zza(objZzc, new ArrayList(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (com.google.android.play.core.splitinstall.zzn.class) {
                zzbk.zza(objZzc, "nativeLibraryPathElements", Object.class).zzb(Arrays.asList(objArrZza));
            }
            return;
        }
        zzbh zzbhVar = new zzbh("Error in makePathElements");
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList2.get(i));
            } catch (Exception unused) {
            }
        }
        throw zzbhVar;
    }

    public static boolean zzd(ClassLoader classLoader, File file, File file2, boolean z, String str) {
        return zzat.zze(classLoader, file, file2, z, new zzav(), "zip", new zzaq());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final void zza(ClassLoader classLoader, Set set) {
        zzc(classLoader, set, new zzaw());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public final boolean zzb(ClassLoader classLoader, File file, File file2, boolean z) {
        return zzd(classLoader, file, file2, z, "zip");
    }
}
