package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzao extends zzsz implements zzug {
    private static final zzao zzb;
    private static volatile zzum zze;
    private long zzf;
    private long zzg;

    static {
        zzao zzaoVar = new zzao();
        zzb = zzaoVar;
        zzsz.zzN(zzao.class, zzaoVar);
    }

    private zzao() {
    }

    public static zzao zzb() {
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
            return zzsz.zzK(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000e\u0002\u000e", new Object[]{"zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzao();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzan(zzeVar);
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
        synchronized (zzao.class) {
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
