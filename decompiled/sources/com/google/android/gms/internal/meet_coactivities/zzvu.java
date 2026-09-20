package com.google.android.gms.internal.meet_coactivities;

import com.google.common.annotations.PreferKotlinApi;
import p196j$.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
public final class zzvu {
    @PreferKotlinApi(imports = {"com.google.protobuf.util.kotlin.toProtoDuration"}, replacement = "duration.toProtoDuration()")
    public static zzsh zza(Duration duration) {
        return zzvt.zza(duration.getSeconds(), duration.getNano());
    }

    @PreferKotlinApi(imports = {"com.google.protobuf.util.kotlin.toJavaDuration"}, replacement = "duration.toJavaDuration()")
    public static Duration zzb(zzsh zzshVar) {
        zzsh zzshVarZza = zzvt.zza(zzshVar.zzd(), zzshVar.zzc());
        return Duration.ofSeconds(zzshVarZza.zzd(), zzshVarZza.zzc());
    }
}
