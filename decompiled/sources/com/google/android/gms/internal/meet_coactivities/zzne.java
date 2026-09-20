package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzne {
    private static final zzna zza = new zznc();
    private static final zzmz zzb = new zznd();

    public static zzmw zza(Set set) {
        zzmw zzmwVar = new zzmw(zza, null);
        zzmwVar.zza(zzb);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzmwVar.zzf((zzlt) it.next());
        }
        return zzmwVar;
    }
}
