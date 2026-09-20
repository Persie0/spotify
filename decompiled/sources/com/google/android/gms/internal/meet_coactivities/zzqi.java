package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqi extends zzsz implements zzug {
    private static final zzqi zzb;
    private static volatile zzum zze;
    private int zzf;
    private zzqw zzg;
    private zzqa zzh;

    static {
        zzqi zzqiVar = new zzqi();
        zzb = zzqiVar;
        zzsz.zzN(zzqi.class, zzqiVar);
    }

    private zzqi() {
    }

    public static zzqh zzb() {
        return (zzqh) zzb.zzA();
    }

    public static zzqi zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzf(zzqi zzqiVar, zzqw zzqwVar) {
        zzqwVar.getClass();
        zzqiVar.zzg = zzqwVar;
        zzqiVar.zzf |= 1;
    }

    public static /* synthetic */ void zzg(zzqi zzqiVar, zzqa zzqaVar) {
        zzqaVar.getClass();
        zzqiVar.zzh = zzqaVar;
        zzqiVar.zzf |= 2;
    }

    public final zzqa zza() {
        zzqa zzqaVar = this.zzh;
        return zzqaVar == null ? zzqa.zzd() : zzqaVar;
    }

    public final zzqw zze() {
        zzqw zzqwVar = this.zzg;
        return zzqwVar == null ? zzqw.zzd() : zzqwVar;
    }

    public final boolean zzh() {
        return (this.zzf & 2) != 0;
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
            return new zzqi();
        }
        zzpw zzpwVar = null;
        if (i2 == 4) {
            return new zzqh(zzpwVar);
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
        synchronized (zzqi.class) {
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

    public final boolean zzj() {
        return (this.zzf & 1) != 0;
    }
}
