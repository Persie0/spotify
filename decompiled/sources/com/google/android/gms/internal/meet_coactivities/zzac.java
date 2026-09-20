package com.google.android.gms.internal.meet_coactivities;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzac extends zzsz implements zzug {
    private static final zzte zzb = new zzz();
    private static final zzac zze;
    private static volatile zzum zzf;
    private int zzg;
    private zztd zzh = zzsz.zzF();

    static {
        zzac zzacVar = new zzac();
        zze = zzacVar;
        zzsz.zzN(zzac.class, zzacVar);
    }

    private zzac() {
    }

    public final zzam zzb() {
        zzam zzamVarZzb = zzam.zzb(this.zzg);
        return zzamVarZzb == null ? zzam.UNRECOGNIZED : zzamVarZzb;
    }

    public final List zzc() {
        return new zztf(this.zzh, zzb);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zze, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002,", new Object[]{"zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzac();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzaa(zzeVar);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            return null;
        }
        zzum zzumVar = zzf;
        if (zzumVar != null) {
            return zzumVar;
        }
        synchronized (zzac.class) {
            try {
                zzsuVar = zzf;
                if (zzsuVar == null) {
                    zzsuVar = new zzsu(zze);
                    zzf = zzsuVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzsuVar;
    }
}
