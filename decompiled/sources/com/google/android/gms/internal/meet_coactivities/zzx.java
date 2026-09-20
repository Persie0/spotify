package com.google.android.gms.internal.meet_coactivities;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzx extends zzsz implements zzug {
    private static final zzte zzb = new zzv();
    private static final zzx zze;
    private static volatile zzum zzf;
    private int zzg;
    private zzl zzh;
    private zzao zzi;
    private int zzj;
    private zzg zzk;
    private zztd zzl = zzsz.zzF();
    private zztg zzm = zzsz.zzG();
    private zztg zzn = zzsz.zzG();

    static {
        zzx zzxVar = new zzx();
        zze = zzxVar;
        zzsz.zzN(zzx.class, zzxVar);
    }

    private zzx() {
    }

    public static zzx zzd() {
        return zze;
    }

    public final zzg zza() {
        zzg zzgVar = this.zzk;
        return zzgVar == null ? zzg.zzb() : zzgVar;
    }

    public final zzl zzb() {
        zzl zzlVar = this.zzh;
        return zzlVar == null ? zzl.zzc() : zzlVar;
    }

    public final zzao zze() {
        zzao zzaoVar = this.zzi;
        return zzaoVar == null ? zzao.zzb() : zzaoVar;
    }

    public final List zzf() {
        return this.zzm;
    }

    public final List zzg() {
        return this.zzn;
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
            return zzsz.zzK(zze, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004ဉ\u0002\u0005,\u0006\u001b\u0007\u001b", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzac.class, "zzn", zzpy.class});
        }
        if (i2 == 3) {
            return new zzx();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzw(zzeVar);
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
        synchronized (zzx.class) {
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
        return (this.zzg & 1) != 0;
    }

    public final int zzk() {
        int i;
        switch (this.zzj) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
