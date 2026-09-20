package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzv {
    public static final zzv zza = zzc().zze();

    public static zzu zzc() {
        zza zzaVar = new zza();
        zzaVar.zzb(new HashMap());
        return zzaVar;
    }

    @SplitInstallErrorCode
    public abstract Integer zza();

    public abstract Map zzb();
}
