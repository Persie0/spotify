package com.google.android.play.core.splitinstall;

/* JADX INFO: loaded from: classes4.dex */
final class zzw implements Runnable {
    final /* synthetic */ SplitInstallSessionState zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzx zzd;

    public zzw(zzx zzxVar, SplitInstallSessionState splitInstallSessionState, int i, int i2) {
        this.zzd = zzxVar;
        this.zza = splitInstallSessionState;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzx zzxVar = this.zzd;
        SplitInstallSessionState splitInstallSessionState = this.zza;
        zzxVar.zzk(new zza(splitInstallSessionState.sessionId(), this.zzb, this.zzc, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.zzb(), splitInstallSessionState.zza(), splitInstallSessionState.resolutionIntent(), splitInstallSessionState.zzc()));
    }
}
