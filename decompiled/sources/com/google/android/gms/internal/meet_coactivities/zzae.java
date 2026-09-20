package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzae extends zzsz implements zzug {
    private static final zzae zzb;
    private static volatile zzum zze;
    private int zzf;
    private zzl zzg;
    private zzao zzh;
    private int zzi;

    static {
        zzae zzaeVar = new zzae();
        zzb = zzaeVar;
        zzsz.zzN(zzae.class, zzaeVar);
    }

    private zzae() {
    }

    public static zzad zza() {
        return (zzad) zzb.zzA();
    }

    public static zzae zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzae zzaeVar, zzl zzlVar) {
        zzlVar.getClass();
        zzaeVar.zzg = zzlVar;
        zzaeVar.zzf |= 1;
    }

    public static /* synthetic */ void zze(zzae zzaeVar, zzao zzaoVar) {
        zzaeVar.zzh = zzaoVar;
        zzaeVar.zzf |= 2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzae();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzad(zzeVar);
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
        synchronized (zzae.class) {
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
