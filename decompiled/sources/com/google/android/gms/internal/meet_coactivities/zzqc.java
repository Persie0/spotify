package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqc extends zzsz implements zzug {
    private static final zzqc zzb;
    private static volatile zzum zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzqc zzqcVar = new zzqc();
        zzb = zzqcVar;
        zzsz.zzN(zzqc.class, zzqcVar);
    }

    private zzqc() {
    }

    public static zzqb zza() {
        return (zzqb) zzb.zzA();
    }

    public static /* synthetic */ void zze(zzqc zzqcVar, String str) {
        str.getClass();
        zzqcVar.zzf = str;
    }

    public static /* synthetic */ void zzf(zzqc zzqcVar, String str) {
        str.getClass();
        zzqcVar.zzg = str;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
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
            return zzsz.zzK(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzqc();
        }
        zzpw zzpwVar = null;
        if (i2 == 4) {
            return new zzqb(zzpwVar);
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
        synchronized (zzqc.class) {
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
