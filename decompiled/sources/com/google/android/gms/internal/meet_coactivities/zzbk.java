package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbk extends zzsz implements zzug {
    private static final zzbk zzb;
    private static volatile zzum zze;
    private int zzf;
    private zzpy zzg;
    private zzao zzh;
    private zzn zzi;
    private zzaq zzj;
    private zzr zzk;

    static {
        zzbk zzbkVar = new zzbk();
        zzb = zzbkVar;
        zzsz.zzN(zzbk.class, zzbkVar);
    }

    private zzbk() {
    }

    public static zzbj zza() {
        return (zzbj) zzb.zzA();
    }

    public static zzbk zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzbk zzbkVar, zzpy zzpyVar) {
        zzpyVar.getClass();
        zzbkVar.zzg = zzpyVar;
        zzbkVar.zzf |= 1;
    }

    public static /* synthetic */ void zze(zzbk zzbkVar, zzao zzaoVar) {
        zzbkVar.zzh = zzaoVar;
        zzbkVar.zzf |= 2;
    }

    public static /* synthetic */ void zzf(zzbk zzbkVar, zzn zznVar) {
        zznVar.getClass();
        zzbkVar.zzi = zznVar;
        zzbkVar.zzf |= 4;
    }

    public static /* synthetic */ void zzg(zzbk zzbkVar, zzaq zzaqVar) {
        zzaqVar.getClass();
        zzbkVar.zzj = zzaqVar;
        zzbkVar.zzf |= 8;
    }

    public static /* synthetic */ void zzh(zzbk zzbkVar, zzr zzrVar) {
        zzrVar.getClass();
        zzbkVar.zzk = zzrVar;
        zzbkVar.zzf |= 16;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzbk();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzbj(zzeVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzum zzumVar = zze;
        if (zzumVar != null) {
            return zzumVar;
        }
        synchronized (zzbk.class) {
            try {
                zzsuVar = zze;
                if (zzsuVar == null) {
                    zzsuVar = new zzsu(zzb);
                    zze = zzsuVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzsuVar;
    }
}
