package com.google.android.gms.internal.meet_coactivities;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpb extends zzoz {
    private static final Map zza;
    private final zzmi zzb;

    static {
        EnumMap enumMap = new EnumMap(zzmi.class);
        for (zzmi zzmiVar : zzmi.values()) {
            zzpb[] zzpbVarArr = new zzpb[10];
            for (int i = 0; i < 10; i++) {
                zzpbVarArr[i] = new zzpb(i, zzmiVar, zzmj.zzf());
            }
            enumMap.put(zzmiVar, zzpbVarArr);
        }
        zza = Collections.unmodifiableMap(enumMap);
    }

    private zzpb(int i, zzmi zzmiVar, zzmj zzmjVar) {
        super(zzmjVar, i);
        zzpj.zza(zzmiVar, "format char");
        this.zzb = zzmiVar;
        if (zzmjVar.zzj()) {
            zzmiVar.zze();
            return;
        }
        int iZza = zzmiVar.zza();
        iZza = zzmjVar.zzk() ? iZza & 65503 : iZza;
        StringBuilder sb = new StringBuilder("%");
        zzmjVar.zzh(sb);
        sb.append((char) iZza);
    }

    public static zzpb zza(int i, zzmi zzmiVar, zzmj zzmjVar) {
        return (i >= 10 || !zzmjVar.zzj()) ? new zzpb(i, zzmiVar, zzmjVar) : ((zzpb[]) zza.get(zzmiVar))[i];
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzoz
    public final void zzb(zzpa zzpaVar, Object obj) {
        zzpaVar.zzd(obj, this.zzb, zzd());
    }
}
