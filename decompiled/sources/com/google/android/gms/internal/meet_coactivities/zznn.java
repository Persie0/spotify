package com.google.android.gms.internal.meet_coactivities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zznn extends zznp {
    private final Map zza;

    public /* synthetic */ zznn(zzms zzmsVar, zzms zzmsVar2, zznm zznmVar) {
        super(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzd(linkedHashMap, zzmsVar);
        zzd(linkedHashMap, zzmsVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((zzlt) entry.getKey()).zzi()) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.zza = Collections.unmodifiableMap(linkedHashMap);
    }

    private static void zzd(Map map, zzms zzmsVar) {
        for (int i = 0; i < zzmsVar.zza(); i++) {
            zzlt zzltVarZzb = zzmsVar.zzb(i);
            Object obj = map.get(zzltVarZzb);
            if (zzltVarZzb.zzi()) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(zzltVarZzb, arrayList);
                }
                arrayList.add(zzltVarZzb.zze(zzmsVar.zzd(i)));
            } else {
                map.put(zzltVarZzb, zzltVarZzb.zze(zzmsVar.zzd(i)));
            }
        }
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zznp
    public final int zza() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zznp
    public final Set zzb() {
        return this.zza.keySet();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zznp
    public final void zzc(zznb zznbVar, Object obj) {
        for (Map.Entry entry : this.zza.entrySet()) {
            zzlt zzltVar = (zzlt) entry.getKey();
            Object value = entry.getValue();
            if (zzltVar.zzi()) {
                zznbVar.zzb(zzltVar, ((List) value).iterator(), obj);
            } else {
                zznbVar.zza(zzltVar, value, obj);
            }
        }
    }
}
