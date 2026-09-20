package com.google.android.play.core.splitinstall.testing;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzq implements com.google.android.play.core.splitinstall.zzf {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ List zze;
    final /* synthetic */ FakeSplitInstallManager zzf;

    public zzq(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, long j, boolean z, List list3) {
        this.zzf = fakeSplitInstallManager;
        this.zza = list;
        this.zzb = list2;
        this.zzc = j;
        this.zzd = z;
        this.zze = list3;
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zza() {
        this.zzf.zzr(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzb(int i) {
        this.zzf.zzs(6, i, null, null, null, null, null);
    }

    @Override // com.google.android.play.core.splitinstall.zzf
    public final void zzc() {
        if (this.zzd) {
            return;
        }
        this.zzf.zzp(this.zze, this.zza, this.zzb, this.zzc, true);
    }
}
