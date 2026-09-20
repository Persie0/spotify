package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzrc implements zzum {
    static {
        int i = zzsk.zzb;
        int i2 = zzun.zza;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.meet_coactivities.zzuf, com.google.android.gms.internal.meet_coactivities.zzug, java.lang.Object] */
    @Override // com.google.android.gms.internal.meet_coactivities.zzum
    public final /* synthetic */ Object zza(zzrx zzrxVar, zzsk zzskVar) throws zztj {
        ?? Zzb = zzb(zzrxVar, zzskVar);
        if (Zzb == 0 || Zzb.zzU()) {
            return Zzb;
        }
        throw new zzve(Zzb).zza();
    }
}
