package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzu {
    public abstract zzu zza(@SplitInstallErrorCode int i);

    public abstract zzu zzb(Map map);

    public abstract zzv zzc();

    public abstract Map zzd();

    public final zzv zze() {
        zzb(Collections.unmodifiableMap(zzd()));
        return zzc();
    }
}
