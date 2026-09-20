package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzy implements Runnable {
    final /* synthetic */ SplitInstallRequest zza;
    final /* synthetic */ zzaa zzb;

    public zzy(zzaa zzaaVar, SplitInstallRequest splitInstallRequest) {
        this.zzb = zzaaVar;
        this.zza = splitInstallRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzx zzxVar = this.zzb.zzb;
        List<String> moduleNames = this.zza.getModuleNames();
        List listZze = zzaa.zze(this.zza.getLanguages());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!moduleNames.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(moduleNames));
        }
        if (!listZze.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(listZze));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        zzxVar.zzk(SplitInstallSessionState.zzd(bundle));
    }
}
