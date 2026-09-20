package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzr extends zzsz implements zzug {
    private static final zzr zzb;
    private static volatile zzum zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        zzr zzrVar = new zzr();
        zzb = zzrVar;
        zzsz.zzN(zzr.class, zzrVar);
    }

    private zzr() {
    }

    public static zzq zza() {
        return (zzq) zzb.zzA();
    }

    public static zzr zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzr zzrVar, String str) {
        str.getClass();
        zzrVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzr zzrVar, String str) {
        str.getClass();
        zzrVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzr zzrVar, String str) {
        str.getClass();
        zzrVar.zzh = str;
    }

    public final String zzd() {
        return this.zzh;
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzr();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzq(zzeVar);
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
        synchronized (zzr.class) {
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
