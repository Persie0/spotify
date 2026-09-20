package com.google.android.gms.internal.meet_coactivities;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzqa extends zzsz implements zzug {
    private static final zzqa zzb;
    private static volatile zzum zze;
    private int zzf;
    private zztg zzg = zzsz.zzG();

    static {
        zzqa zzqaVar = new zzqa();
        zzb = zzqaVar;
        zzsz.zzN(zzqa.class, zzqaVar);
    }

    private zzqa() {
    }

    public static zzpz zzb() {
        return (zzpz) zzb.zzA();
    }

    public static zzqa zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzqa zzqaVar, zzqc zzqcVar) {
        zzqcVar.getClass();
        zztg zztgVar = zzqaVar.zzg;
        if (!zztgVar.zzc()) {
            zzqaVar.zzg = zzsz.zzH(zztgVar);
        }
        zzqaVar.zzg.add(zzqcVar);
    }

    public final int zza() {
        return this.zzf;
    }

    public final List zze() {
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
            return zzsz.zzK(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"zzf", "zzg", zzqc.class});
        }
        if (i2 == 3) {
            return new zzqa();
        }
        zzpw zzpwVar = null;
        if (i2 == 4) {
            return new zzpz(zzpwVar);
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
        synchronized (zzqa.class) {
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
