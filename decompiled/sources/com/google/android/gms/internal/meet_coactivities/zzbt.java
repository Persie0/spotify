package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzbt extends zzcb {
    private final zzca zzb;
    private final zzl zzc;
    private final zzc zzd;

    public /* synthetic */ zzbt(zzca zzcaVar, zzl zzlVar, zzc zzcVar, zzbr zzbrVar) {
        this.zzb = zzcaVar;
        this.zzc = zzlVar;
        this.zzd = zzcVar;
    }

    public final boolean equals(Object obj) {
        zzl zzlVar;
        zzc zzcVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcb) {
            zzcb zzcbVar = (zzcb) obj;
            if (this.zzb.equals(zzcbVar.zzc()) && ((zzlVar = this.zzc) != null ? zzlVar.equals(zzcbVar.zzb()) : zzcbVar.zzb() == null) && ((zzcVar = this.zzd) != null ? zzcVar.equals(zzcbVar.zza()) : zzcbVar.zza() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        zzl zzlVar = this.zzc;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzlVar == null ? 0 : zzlVar.hashCode())) * 1000003;
        zzc zzcVar = this.zzd;
        return iHashCode2 ^ (zzcVar != null ? zzcVar.hashCode() : 0);
    }

    public final String toString() {
        return "IpcSessionState{state=" + this.zzb + ", meetingInfo=" + this.zzc + ", asyncStub=" + this.zzd + "}";
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzcb
    public final zzc zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzcb
    public final zzl zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzcb
    public final zzca zzc() {
        return this.zzb;
    }
}
