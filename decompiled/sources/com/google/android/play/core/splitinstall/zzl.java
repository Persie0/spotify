package com.google.android.play.core.splitinstall;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.splitinstall.internal.zzby;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p204p.hg0;
import p204p.w550;

/* JADX INFO: loaded from: classes.dex */
final class zzl implements SplitInstallManager {
    private final zzby zza;
    private final zzby zzb;
    private final zzby zzc;

    public zzl(zzby zzbyVar, zzby zzbyVar2, zzby zzbyVar3) {
        this.zza = zzbyVar;
        this.zzb = zzbyVar2;
        this.zzc = zzbyVar3;
    }

    private final SplitInstallManager zzc() {
        return this.zzc.zza() != null ? (SplitInstallManager) this.zzb.zza() : (SplitInstallManager) this.zza.zza();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task cancelInstall(int i) {
        return zzc().cancelInstall(i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task deferredInstall(List<String> list) {
        return zzc().deferredInstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task deferredLanguageInstall(List<Locale> list) {
        return zzc().deferredLanguageInstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task deferredLanguageUninstall(List<Locale> list) {
        return zzc().deferredLanguageUninstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task deferredUninstall(List<String> list) {
        return zzc().deferredUninstall(list);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledLanguages() {
        return zzc().getInstalledLanguages();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Set<String> getInstalledModules() {
        return zzc().getInstalledModules();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task getSessionState(int i) {
        return zzc().getSessionState(i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task getSessionStates() {
        return zzc().getSessionStates();
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        zzc().registerListener(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) {
        return zzc().startConfirmationDialogForResult(splitInstallSessionState, activity, i);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final Task startInstall(SplitInstallRequest splitInstallRequest) {
        return zzc().startInstall(splitInstallRequest);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        zzc().unregisterListener(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zza(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        zzc().zza(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final void zzb(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        zzc().zzb(splitInstallStateUpdatedListener);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, hg0 hg0Var) {
        return zzc().startConfirmationDialogForResult(splitInstallSessionState, hg0Var);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallManager
    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, w550 w550Var, int i) {
        return zzc().startConfirmationDialogForResult(splitInstallSessionState, w550Var, i);
    }
}
