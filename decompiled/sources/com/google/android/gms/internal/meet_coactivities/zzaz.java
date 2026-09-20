package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends zzsz implements zzug {
    private static final zzaz zzb;
    private static volatile zzum zze;
    private int zzf;

    static {
        zzaz zzazVar = new zzaz();
        zzb = zzazVar;
        zzsz.zzN(zzaz.class, zzazVar);
    }

    private zzaz() {
    }

    public static zzaz zzb() {
        return zzb;
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
            return new zzaz();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzay(zzeVar);
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
        synchronized (zzaz.class) {
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
