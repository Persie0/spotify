package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: loaded from: classes.dex */
public final class zzbz implements zzcb, zzby {
    private static final Object zza = new Object();
    private volatile zzcb zzb;
    private volatile Object zzc = zza;

    private zzbz(zzcb zzcbVar) {
        this.zzb = zzcbVar;
    }

    public static zzby zzb(zzcb zzcbVar) {
        return zzcbVar instanceof zzby ? (zzby) zzcbVar : new zzbz(zzcbVar);
    }

    public static zzcb zzc(zzcb zzcbVar) {
        zzcbVar.getClass();
        return zzcbVar instanceof zzbz ? zzcbVar : new zzbz(zzcbVar);
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzcb, com.google.android.play.core.splitinstall.internal.zzby
    public final Object zza() {
        Object objZza;
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.zzc;
                if (objZza == obj2) {
                    objZza = this.zzb.zza();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = objZza;
                    this.zzb = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}
