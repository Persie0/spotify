package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public class zztp {
    protected volatile zzuf zza;
    private volatile zzrr zzb;

    static {
        int i = zzsk.zzb;
        int i2 = zzun.zza;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zztp)) {
            return false;
        }
        zztp zztpVar = (zztp) obj;
        zzuf zzufVar = this.zza;
        zzuf zzufVar2 = zztpVar.zza;
        if (zzufVar == null && zzufVar2 == null) {
            return zzb().equals(zztpVar.zzb());
        }
        if (zzufVar != null && zzufVar2 != null) {
            return zzufVar.equals(zzufVar2);
        }
        if (zzufVar != null) {
            zztpVar.zzd(zzufVar.zzT());
            return zzufVar.equals(zztpVar.zza);
        }
        zzd(zzufVar2.zzT());
        return this.zza.equals(zzufVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzrq) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzz();
        }
        return 0;
    }

    public final zzrr zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzrr.zzb;
                } else {
                    this.zzb = this.zza.zzw();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzuf zzc(zzuf zzufVar) {
        zzuf zzufVar2 = this.zza;
        this.zzb = null;
        this.zza = zzufVar;
        return zzufVar2;
    }

    public final void zzd(zzuf zzufVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzufVar;
                this.zzb = zzrr.zzb;
            } catch (zztj unused) {
                this.zza = zzufVar;
                this.zzb = zzrr.zzb;
            }
        }
    }
}
