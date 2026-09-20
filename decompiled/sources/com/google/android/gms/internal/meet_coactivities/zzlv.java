package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
final class zzlv extends zzlz {
    final /* synthetic */ zzlz zza;
    final /* synthetic */ zzlz zzb;

    public zzlv(zzlz zzlzVar, zzlz zzlzVar2) {
        this.zza = zzlzVar;
        this.zzb = zzlzVar2;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzlz
    public final void zzb() {
        try {
            this.zza.zzb();
        } finally {
            this.zzb.zzb();
        }
    }
}
