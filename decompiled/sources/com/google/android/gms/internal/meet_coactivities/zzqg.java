package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqg extends zzsz implements zzug {
    private static final zzqg zzb;
    private static volatile zzum zze;
    private int zzf;
    private zzqe zzg;

    static {
        zzqg zzqgVar = new zzqg();
        zzb = zzqgVar;
        zzsz.zzN(zzqg.class, zzqgVar);
    }

    private zzqg() {
    }

    public static zzqf zzb() {
        return (zzqf) zzb.zzA();
    }

    public static zzqg zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzqg zzqgVar, zzqe zzqeVar) {
        zzqeVar.getClass();
        zzqgVar.zzg = zzqeVar;
        zzqgVar.zzf |= 1;
    }

    public final zzqe zza() {
        zzqe zzqeVar = this.zzg;
        return zzqeVar == null ? zzqe.zzc() : zzqeVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzqg();
        }
        zzpw zzpwVar = null;
        if (i2 == 4) {
            return new zzqf(zzpwVar);
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
        synchronized (zzqg.class) {
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
