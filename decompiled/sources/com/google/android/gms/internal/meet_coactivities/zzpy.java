package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzpy extends zzsz implements zzug {
    private static final zzpy zzb;
    private static volatile zzum zze;
    private Object zzg;
    private long zzh;
    private boolean zzl;
    private boolean zzm;
    private long zzo;
    private int zzf = 0;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzn = "";

    static {
        zzpy zzpyVar = new zzpy();
        zzb = zzpyVar;
        zzsz.zzN(zzpy.class, zzpyVar);
    }

    private zzpy() {
    }

    public static zzpx zzc() {
        return (zzpx) zzb.zzA();
    }

    public static zzpy zze() {
        return zzb;
    }

    public static /* synthetic */ void zzk(zzpy zzpyVar, zzqg zzqgVar) {
        zzqgVar.getClass();
        zzpyVar.zzg = zzqgVar;
        zzpyVar.zzf = 4;
    }

    public static /* synthetic */ void zzl(zzpy zzpyVar, zzqq zzqqVar) {
        zzqqVar.getClass();
        zzpyVar.zzg = zzqqVar;
        zzpyVar.zzf = 5;
    }

    public static /* synthetic */ void zzm(zzpy zzpyVar, zzqq zzqqVar) {
        zzqqVar.getClass();
        zzsz zzszVarZzl = zzqqVar;
        if (zzpyVar.zzf == 5 && zzpyVar.zzg != zzqq.zze()) {
            zzszVarZzl = zzqqVar;
            zzql zzqlVarZzc = zzqq.zzc((zzqq) zzpyVar.zzg);
            zzqlVarZzc.zzj(zzqqVar);
            zzszVarZzl = zzqlVarZzc.zzm();
        }
        zzszVarZzl = zzqqVar;
        zzpyVar.zzg = zzszVarZzl;
        zzpyVar.zzf = 5;
    }

    public static /* synthetic */ void zzo(zzpy zzpyVar, String str) {
        str.getClass();
        zzpyVar.zzn = str;
    }

    public final long zza() {
        return this.zzo;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzqg zzf() {
        return this.zzf == 4 ? (zzqg) this.zzg : zzqg.zzd();
    }

    public final zzqq zzg() {
        return this.zzf == 5 ? (zzqq) this.zzg : zzqq.zze();
    }

    public final String zzh() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u000b\u0001\u0000\u0001\f\u000b\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006\u0007\u0007\u0007\bȈ\tȈ\n\u0003\f<\u0000", new Object[]{"zzg", "zzf", "zzh", "zzi", "zzk", zzqg.class, zzqq.class, "zzl", "zzm", "zzn", "zzj", "zzo", zzqu.class});
        }
        if (i2 == 3) {
            return new zzpy();
        }
        zzpw zzpwVar = null;
        if (i2 == 4) {
            return new zzpx(zzpwVar);
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
        synchronized (zzpy.class) {
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

    public final boolean zzq() {
        return this.zzl;
    }

    public final boolean zzr() {
        return this.zzm;
    }

    public final boolean zzs() {
        return this.zzf == 4;
    }

    public final boolean zzt() {
        return this.zzf == 5;
    }

    public final int zzu() {
        int i = this.zzf;
        if (i == 0) {
            return 1;
        }
        if (i == 12) {
            return 13;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }
}
