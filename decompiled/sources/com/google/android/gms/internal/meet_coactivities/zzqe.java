package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqe extends zzsz implements zzug {
    private static final zzqe zzb;
    private static volatile zzum zze;
    private zzrr zzf = zzrr.zzb;

    static {
        zzqe zzqeVar = new zzqe();
        zzb = zzqeVar;
        zzsz.zzN(zzqe.class, zzqeVar);
    }

    private zzqe() {
    }

    public static zzqd zza() {
        return (zzqd) zzb.zzA();
    }

    public static zzqe zzc() {
        return zzb;
    }

    public final zzrr zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"zzf"});
        }
        if (i2 == 3) {
            return new zzqe();
        }
        zzpw zzpwVar = null;
        if (i2 == 4) {
            return new zzqd(zzpwVar);
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
        synchronized (zzqe.class) {
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
