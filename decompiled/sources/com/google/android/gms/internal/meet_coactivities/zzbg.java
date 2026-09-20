package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbg extends zzsz implements zzug {
    private static final zzbg zzb;
    private static volatile zzum zze;
    private int zzf;
    private zzao zzg;
    private zzas zzh;

    static {
        zzbg zzbgVar = new zzbg();
        zzb = zzbgVar;
        zzsz.zzN(zzbg.class, zzbgVar);
    }

    private zzbg() {
    }

    public static zzbf zza() {
        return (zzbf) zzb.zzA();
    }

    public static zzbg zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzbg zzbgVar, zzas zzasVar) {
        zzasVar.getClass();
        zzbgVar.zzh = zzasVar;
        zzbgVar.zzf |= 2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbg();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzbf(zzeVar);
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
        synchronized (zzbg.class) {
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
