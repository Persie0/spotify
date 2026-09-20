package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzx extends com.google.android.play.core.splitinstall.internal.zzs {
    private static zzx zzc;
    private final Handler zzd;
    private final zzg zze;
    private final Set zzf;

    public zzx(Context context, zzg zzgVar) {
        super(new com.google.android.play.core.splitinstall.internal.zzu("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.zzd = new Handler(Looper.getMainLooper());
        this.zzf = new LinkedHashSet();
        this.zze = zzgVar;
    }

    public static synchronized zzx zzg(Context context) {
        try {
            if (zzc == null) {
                zzc = new zzx(context, zzo.INSTANCE);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzc;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzs
    public final void zza(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        SplitInstallSessionState splitInstallSessionStateZzd = SplitInstallSessionState.zzd(bundleExtra);
        this.zza.zza("ListenerRegistryBroadcastReceiver.onReceive: %s", splitInstallSessionStateZzd);
        zzh zzhVarZza = this.zze.zza();
        if (splitInstallSessionStateZzd.status() != 3 || zzhVarZza == null) {
            zzk(splitInstallSessionStateZzd);
        } else {
            zzhVarZza.zzd(splitInstallSessionStateZzd.zzc(), new zzv(this, splitInstallSessionStateZzd, intent, context));
        }
    }

    public final synchronized void zzi(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzf.add(splitInstallStateUpdatedListener);
    }

    public final synchronized void zzj(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzf.remove(splitInstallStateUpdatedListener);
    }

    public final synchronized void zzk(SplitInstallSessionState splitInstallSessionState) {
        try {
            Iterator it = new LinkedHashSet(this.zzf).iterator();
            while (it.hasNext()) {
                ((SplitInstallStateUpdatedListener) it.next()).onStateUpdate(splitInstallSessionState);
            }
            zze(splitInstallSessionState);
        } catch (Throwable th) {
            throw th;
        }
    }
}
