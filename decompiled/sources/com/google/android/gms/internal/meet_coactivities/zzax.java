package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
public final class zzax extends zzsz implements zzug {
    private static final zzax zzb;
    private static volatile zzum zze;
    private boolean zzf;
    private String zzg = "";
    private int zzh;
    private long zzi;

    static {
        zzax zzaxVar = new zzax();
        zzb = zzaxVar;
        zzsz.zzN(zzax.class, zzaxVar);
    }

    private zzax() {
    }

    public static zzax zzc() {
        return zzb;
    }

    public final long zza() {
        return this.zzi;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final int zze() {
        int i = this.zzh;
        int i2 = 2;
        if (i != 0) {
            if (i != 1) {
                i2 = i != 2 ? 0 : 4;
            } else {
                i2 = 3;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001\u0007\u0003Ȉ\u0004\f\u0007\u0003", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzax();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzaw(zzeVar);
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
        synchronized (zzax.class) {
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
