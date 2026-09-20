package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzak extends zzsz implements zzug {
    private static final zzak zzb;
    private static volatile zzum zze;
    private boolean zzf;

    static {
        zzak zzakVar = new zzak();
        zzb = zzakVar;
        zzsz.zzN(zzak.class, zzakVar);
    }

    private zzak() {
    }

    public static zzak zzb() {
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
            return zzsz.zzK(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"zzf"});
        }
        if (i2 == 3) {
            return new zzak();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzaj(zzeVar);
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
        synchronized (zzak.class) {
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
