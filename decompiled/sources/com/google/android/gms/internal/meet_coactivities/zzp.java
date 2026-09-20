package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public final class zzp extends zzsz implements zzug {
    private static final zzp zzb;
    private static volatile zzum zze;
    private int zzg;
    private int zzh;
    private long zzj;
    private boolean zzk;
    private zztd zzf = zzsz.zzF();
    private String zzi = "";

    static {
        zzp zzpVar = new zzp();
        zzb = zzpVar;
        zzsz.zzN(zzp.class, zzpVar);
    }

    private zzp() {
    }

    public static zzo zzc() {
        return (zzo) zzb.zzA();
    }

    public static /* synthetic */ void zzg(zzp zzpVar, String str) {
        str.getClass();
        zzpVar.zzi = str;
    }

    public final long zza() {
        return this.zzj;
    }

    public final zzj zzb() {
        zzj zzjVar;
        int i = this.zzh;
        if (i == 0) {
            zzjVar = zzj.HOST_APP_UNKNOWN;
        } else if (i == 1) {
            zzjVar = zzj.HOST_APP_HAM;
        } else if (i == 2) {
            zzjVar = zzj.HOST_APP_MIG;
        } else if (i != 3) {
            zzjVar = i != 4 ? null : zzj.HOST_APP_FAKE_TACHYON;
        } else {
            zzjVar = zzj.HOST_APP_DUET;
        }
        return zzjVar == null ? zzj.UNRECOGNIZED : zzjVar;
    }

    public final String zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzsz
    public final Object zzi(int i, Object obj, Object obj2) {
        zzum zzsuVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzsz.zzK(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001,\u0002\f\u0003\f\u0004Ȉ\u0005\u0003\u0006\u0007", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzp();
        }
        zze zzeVar = null;
        if (i2 == 4) {
            return new zzo(zzeVar);
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
        synchronized (zzp.class) {
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

    public final boolean zzk() {
        return this.zzk;
    }
}
