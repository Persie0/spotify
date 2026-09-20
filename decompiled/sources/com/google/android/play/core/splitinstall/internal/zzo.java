package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: loaded from: classes4.dex */
final class zzo extends zzp {
    private final int zza;
    private final long zzb;

    public zzo(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzp) {
            zzp zzpVar = (zzp) obj;
            if (this.zza == zzpVar.zza() && this.zzb == zzpVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza ^ 1000003;
        long j = this.zzb;
        return (i * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.zza + ", eventTimestamp=" + this.zzb + "}";
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzp
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzp
    public final long zzb() {
        return this.zzb;
    }
}
