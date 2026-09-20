package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzi extends zzsz implements zzug {
    private static final zzi zzb;
    private static volatile zzum zze;
    private String zzf = "";

    static {
        zzi zziVar = new zzi();
        zzb = zziVar;
        zzsz.zzN(zzi.class, zziVar);
    }

    private zzi() {
    }

    public static zzh zza() {
        return (zzh) zzb.zzA();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzf"});
        }
        if (i2 == 3) {
            return new zzi();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzh(zzeVar);
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
        synchronized (zzi.class) {
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
