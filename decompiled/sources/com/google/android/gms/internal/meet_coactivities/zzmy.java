package com.google.android.gms.internal.meet_coactivities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzmy extends zznb {
    private final Map zza;
    private final Map zzb;
    private final zzmz zzc;

    public /* synthetic */ zzmy(zzmw zzmwVar, zzmx zzmxVar) {
        HashMap map = new HashMap();
        this.zza = map;
        HashMap map2 = new HashMap();
        this.zzb = map2;
        map.putAll(zzmwVar.zzc);
        map2.putAll(zzmwVar.zzd);
        this.zzc = zzmwVar.zzf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.meet_coactivities.zznb
    public final void zza(zzlt zzltVar, Object obj, Object obj2) {
        zzna zznaVar = (zzna) this.zza.get(zzltVar);
        if (zznaVar != null) {
            zznaVar.zza(zzltVar, obj, obj2);
        } else {
            zzltVar.zzg(obj, obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.meet_coactivities.zznb
    public final void zzb(zzlt zzltVar, Iterator it, Object obj) {
        zzmz zzmzVar = (zzmz) this.zzb.get(zzltVar);
        if (zzmzVar != null) {
            zzmzVar.zza(zzltVar, it, obj);
        } else if (this.zzc != null && !this.zza.containsKey(zzltVar)) {
            zzltVar.zzh(it, obj);
        } else {
            while (it.hasNext()) {
                zza(zzltVar, it.next(), obj);
            }
        }
    }
}
