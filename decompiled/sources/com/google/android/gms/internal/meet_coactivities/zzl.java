package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzl extends zzsz implements zzug {
    private static final zzl zzb;
    private static volatile zzum zze;
    private int zzf;
    private int zzi;
    private zzaq zzk;
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";

    static {
        zzl zzlVar = new zzl();
        zzb = zzlVar;
        zzsz.zzN(zzl.class, zzlVar);
    }

    private zzl() {
    }

    public static zzk zza() {
        return (zzk) zzb.zzA();
    }

    public static zzl zzc() {
        return zzb;
    }

    public final zzal zzd() {
        zzal zzalVarZzb = zzal.zzb(this.zzi);
        return zzalVarZzb == null ? zzal.UNRECOGNIZED : zzalVarZzb;
    }

    public final zzaq zze() {
        zzaq zzaqVar = this.zzk;
        return zzaqVar == null ? zzaq.zzc() : zzaqVar;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final String zzg() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004Ȉ\u0006ဉ\u0000", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzl();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzk(zzeVar);
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
        synchronized (zzl.class) {
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
