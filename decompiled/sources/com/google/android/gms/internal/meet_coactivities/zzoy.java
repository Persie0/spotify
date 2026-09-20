package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzoy extends zzoz {
    private final zzox zza;

    private zzoy(zzmj zzmjVar, int i, zzox zzoxVar) {
        super(zzmjVar, i);
        this.zza = zzoxVar;
        StringBuilder sb = new StringBuilder("%");
        zzmjVar.zzh(sb);
        sb.append(true != zzmjVar.zzk() ? 't' : 'T');
        sb.append(zzoxVar.zza());
    }

    public static zzoz zza(zzox zzoxVar, zzmj zzmjVar, int i) {
        return new zzoy(zzmjVar, i, zzoxVar);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzoz
    public final void zzb(zzpa zzpaVar, Object obj) {
        zzpaVar.zze(obj, this.zza, zzd());
    }
}
