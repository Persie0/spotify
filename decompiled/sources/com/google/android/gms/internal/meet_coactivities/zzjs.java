package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
class zzjs implements zzjr {
    protected final String zzb;
    protected final long zzc;
    protected Object zzd;
    protected Object zze;
    protected final Object zza = new Object();
    private String zzf = "";

    public zzjs(String str, long j, Object obj, Object obj2) {
        this.zzb = str;
        this.zzc = j;
        this.zzd = obj;
        this.zze = obj2;
    }

    public void zze(Object obj) {
    }

    public int zzf(Object obj, Object obj2) {
        return (obj == null || !obj.equals(obj2)) ? 2 : 1;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzjr
    public final zzjt zzg() {
        zzjg zzjgVar;
        synchronized (this.zza) {
            zzjgVar = new zzjg(this.zzd, this.zze);
        }
        return zzjgVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzjr
    public final int zzh(Object obj, Object obj2, int i) {
        int iZzk;
        synchronized (this.zza) {
            this.zze = obj2;
            iZzk = zzk(obj, i);
        }
        return iZzk;
    }

    public final String zzi() {
        return this.zzf;
    }

    public final void zzj(String str) {
        synchronized (this.zza) {
            this.zzf = str;
        }
    }

    public final int zzk(Object obj, int i) {
        if (obj == null || (i == 1 && zzf(this.zzd, obj) == 1)) {
            return 1;
        }
        this.zzd = obj;
        zze(obj);
        return 2;
    }
}
