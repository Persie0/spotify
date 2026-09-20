package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqk extends zzsz implements zzug {
    private static final zzqk zzb;
    private static volatile zzum zze;
    private int zzf;
    private String zzg = "";
    private zzsh zzh;
    private zzsh zzi;
    private int zzj;
    private double zzk;
    private zzqi zzl;

    static {
        zzqk zzqkVar = new zzqk();
        zzb = zzqkVar;
        zzsz.zzN(zzqk.class, zzqkVar);
    }

    private zzqk() {
    }

    public static zzqj zzc() {
        return (zzqj) zzb.zzA();
    }

    public static zzqk zze() {
        return zzb;
    }

    public static /* synthetic */ void zzh(zzqk zzqkVar, String str) {
        str.getClass();
        zzqkVar.zzg = str;
    }

    public static /* synthetic */ void zzj(zzqk zzqkVar, zzsh zzshVar) {
        zzshVar.getClass();
        zzqkVar.zzh = zzshVar;
        zzqkVar.zzf |= 1;
    }

    public static /* synthetic */ void zzk(zzqk zzqkVar) {
        zzqkVar.zzh = null;
        zzqkVar.zzf &= -2;
    }

    public static /* synthetic */ void zzl(zzqk zzqkVar, zzsh zzshVar) {
        zzshVar.getClass();
        zzqkVar.zzi = zzshVar;
        zzqkVar.zzf |= 2;
    }

    public static /* synthetic */ void zzn(zzqk zzqkVar, zzqi zzqiVar) {
        zzqiVar.getClass();
        zzqkVar.zzl = zzqiVar;
        zzqkVar.zzf |= 4;
    }

    public final double zza() {
        return this.zzk;
    }

    public final zzqi zzb() {
        zzqi zzqiVar = this.zzl;
        return zzqiVar == null ? zzqi.zzd() : zzqiVar;
    }

    public final zzsh zzf() {
        zzsh zzshVar = this.zzh;
        return zzshVar == null ? zzsh.zzg() : zzshVar;
    }

    public final String zzg() {
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
            return zzsz.zzK(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\f\u0004\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzj", "zzk", "zzi", "zzl"});
        }
        if (i2 == 3) {
            return new zzqk();
        }
        zzpw zzpwVar = null;
        if (i2 == 4) {
            return new zzqj(zzpwVar);
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
        synchronized (zzqk.class) {
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

    public final int zzo() {
        int i = this.zzj;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i == 2) {
                i2 = 4;
            } else if (i != 3) {
                i2 = i != 4 ? 0 : 6;
            } else {
                i2 = 5;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
