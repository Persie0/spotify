package com.google.android.gms.internal.meet_coactivities;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqq extends zzsz implements zzug {
    private static final zzqq zzb;
    private static volatile zzum zze;
    private int zzf;
    private zzqk zzg;
    private int zzh;
    private zztz zzi = zztz.zza();

    static {
        zzqq zzqqVar = new zzqq();
        zzb = zzqqVar;
        zzsz.zzN(zzqq.class, zzqqVar);
    }

    private zzqq() {
    }

    public static zzql zzb() {
        return (zzql) zzb.zzA();
    }

    public static zzql zzc(zzqq zzqqVar) {
        zzst zzstVarZzA = zzb.zzA();
        zzstVarZzA.zzj(zzqqVar);
        return (zzql) zzstVarZzA;
    }

    public static zzqq zze() {
        return zzb;
    }

    public static /* synthetic */ Map zzf(zzqq zzqqVar) {
        if (!zzqqVar.zzi.zze()) {
            zzqqVar.zzi = zzqqVar.zzi.zzb();
        }
        return zzqqVar.zzi;
    }

    public static /* synthetic */ void zzh(zzqq zzqqVar, zzqk zzqkVar) {
        zzqkVar.getClass();
        zzqqVar.zzg = zzqkVar;
        zzqqVar.zzf |= 1;
    }

    public final zzqk zza() {
        zzqk zzqkVar = this.zzg;
        return zzqkVar == null ? zzqk.zze() : zzqkVar;
    }

    public final Map zzg() {
        return Collections.unmodifiableMap(this.zzi);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဉ\u0000\u0002\f\u00032", new Object[]{"zzf", "zzg", "zzh", "zzi", zzqn.zza});
        }
        if (i2 == 3) {
            return new zzqq();
        }
        zzpw zzpwVar = null;
        if (i2 == 4) {
            return new zzql(zzpwVar);
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
        synchronized (zzqq.class) {
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
