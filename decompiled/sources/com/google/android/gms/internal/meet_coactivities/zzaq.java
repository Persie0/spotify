package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
public final class zzaq extends zzsz implements zzug {
    private static final zzaq zzb;
    private static volatile zzum zze;
    private int zzf;

    static {
        zzaq zzaqVar = new zzaq();
        zzb = zzaqVar;
        zzsz.zzN(zzaq.class, zzaqVar);
    }

    private zzaq() {
    }

    public static zzap zza() {
        return (zzap) zzb.zzA();
    }

    public static zzaq zzc() {
        return zzb;
    }

    public final int zzd() {
        int i = this.zzf;
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
            return zzsz.zzK(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zzf"});
        }
        if (i2 == 3) {
            return new zzaq();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzap(zzeVar);
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
        synchronized (zzaq.class) {
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
