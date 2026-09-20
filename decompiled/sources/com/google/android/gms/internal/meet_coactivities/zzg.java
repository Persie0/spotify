package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzg extends zzsz implements zzug {
    private static final zzg zzb;
    private static volatile zzum zze;
    private int zzf;
    private boolean zzg;
    private zzsh zzh;
    private zzsh zzi;
    private boolean zzj;

    static {
        zzg zzgVar = new zzg();
        zzb = zzgVar;
        zzsz.zzN(zzg.class, zzgVar);
    }

    private zzg() {
    }

    public static zzg zzb() {
        return zzb;
    }

    public final zzsh zzc() {
        zzsh zzshVar = this.zzh;
        return zzshVar == null ? zzsh.zzg() : zzshVar;
    }

    public final zzsh zzd() {
        zzsh zzshVar = this.zzi;
        return zzshVar == null ? zzsh.zzg() : zzshVar;
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zzf & 1) != 0;
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
            return zzsz.zzK(zzb, "\u0000\u0004\u0000\u0001\u0002\n\u0004\u0000\u0000\u0000\u0002\u0007\u0004ဉ\u0000\tဉ\u0001\n\u0007", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzg();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzf(zzeVar);
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
        synchronized (zzg.class) {
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
