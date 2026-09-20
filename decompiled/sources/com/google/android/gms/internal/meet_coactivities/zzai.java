package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzai extends zzsz implements zzug {
    private static final zzai zzb;
    private static volatile zzum zze;
    private int zzf;
    private Object zzh;
    private zzi zzi;
    private int zzg = 0;
    private String zzj = "";

    static {
        zzai zzaiVar = new zzai();
        zzb = zzaiVar;
        zzsz.zzN(zzai.class, zzaiVar);
    }

    private zzai() {
    }

    public static zzah zza() {
        return (zzah) zzb.zzA();
    }

    public static zzai zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzai zzaiVar, zzi zziVar) {
        zziVar.getClass();
        zzaiVar.zzi = zziVar;
        zzaiVar.zzf |= 1;
    }

    public static /* synthetic */ void zze(zzai zzaiVar, String str) {
        str.getClass();
        zzaiVar.zzj = str;
    }

    public static /* synthetic */ void zzf(zzai zzaiVar, int i) {
        zzaiVar.zzh = Integer.valueOf(i - 2);
        zzaiVar.zzg = 1;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000\u0004ဉ\u0000\u0005Ȉ", new Object[]{"zzh", "zzg", "zzf", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzai();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzah(zzeVar);
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
        synchronized (zzai.class) {
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
