package com.google.android.gms.internal.meet_coactivities;

import p204p.jue;
import p204p.kvg1;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjz implements zzkm {
    private zzjz() {
        throw null;
    }

    public static zzjz zzb() {
        return zzjx.zza;
    }

    public static final jue zzc(zzqe zzqeVar) {
        byte[] bArrZzn = zzqeVar.zzd().zzn();
        if (bArrZzn != null) {
            return new kvg1(bArrZzn);
        }
        throw new NullPointerException("Null state");
    }

    public static final zzqe zzd(jue jueVar) {
        zzqd zzqdVarZza = zzqe.zza();
        byte[] bArr = ((kvg1) jueVar).f126865a;
        zzrr zzrrVar = zzrr.zzb;
        zzqdVarZza.zza(zzrr.zzk(bArr, 0, bArr.length));
        return (zzqe) zzqdVarZza.zzk();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzkm
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        return zzc((zzqe) obj);
    }

    public /* synthetic */ zzjz(zzjy zzjyVar) {
    }
}
