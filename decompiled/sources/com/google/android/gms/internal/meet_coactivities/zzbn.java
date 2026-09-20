package com.google.android.gms.internal.meet_coactivities;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbn extends zzsz implements zzug {
    private static final zzte zzb = new zzbl();
    private static final zzbn zze;
    private static volatile zzum zzf;
    private int zzg;
    private int zzh;
    private zzpy zzi;
    private int zzj;
    private zzn zzk;
    private zztd zzl = zzsz.zzF();
    private zztg zzm = zzsz.zzG();
    private zzr zzn;

    static {
        zzbn zzbnVar = new zzbn();
        zze = zzbnVar;
        zzsz.zzN(zzbn.class, zzbnVar);
    }

    private zzbn() {
    }

    public static zzbn zze() {
        return zze;
    }

    public final zzn zza() {
        zzn zznVar = this.zzk;
        return zznVar == null ? zzn.zzc() : zznVar;
    }

    public final zzr zzb() {
        zzr zzrVar = this.zzn;
        return zzrVar == null ? zzr.zzc() : zzrVar;
    }

    public final zzal zzc() {
        zzal zzalVarZzb = zzal.zzb(this.zzj);
        return zzalVarZzb == null ? zzal.UNRECOGNIZED : zzalVarZzb;
    }

    public final zzpy zzf() {
        zzpy zzpyVar = this.zzi;
        return zzpyVar == null ? zzpy.zze() : zzpyVar;
    }

    public final List zzg() {
        return this.zzm;
    }

    public final List zzh() {
        return new zztf(this.zzl, zzb);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zze, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001\f\u0002ဉ\u0000\u0003\f\u0004ဉ\u0001\u0005,\u0006\u001b\u0007ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzac.class, "zzn"});
        }
        if (i2 == 3) {
            return new zzbn();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzbm(zzeVar);
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
        synchronized (zzbn.class) {
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

    public final boolean zzj() {
        return (this.zzg & 4) != 0;
    }
}
