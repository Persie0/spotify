package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
abstract class zzvf {
    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i, int i2);

    public abstract void zze(Object obj, int i, long j);

    public abstract void zzf(Object obj, int i, Object obj2);

    public abstract void zzg(Object obj, int i, zzrr zzrrVar);

    public abstract void zzh(Object obj, int i, long j);

    public abstract void zzi(Object obj);

    public final boolean zzj(Object obj, zzuq zzuqVar) throws zztj {
        int iZzd = zzuqVar.zzd();
        int i = iZzd >>> 3;
        int i2 = iZzd & 7;
        if (i2 == 0) {
            zzh(obj, i, zzuqVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zze(obj, i, zzuqVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zzg(obj, i, zzuqVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zztj.zza();
            }
            zzd(obj, i, zzuqVar.zzf());
            return true;
        }
        Object objZzb = zzb();
        int i3 = i << 3;
        while (zzuqVar.zzc() != Integer.MAX_VALUE && zzj(objZzb, zzuqVar)) {
        }
        if ((4 | i3) != zzuqVar.zzd()) {
            throw zztj.zzb();
        }
        zzc(objZzb);
        zzf(obj, i, objZzb);
        return true;
    }
}
