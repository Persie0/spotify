package com.google.android.gms.internal.meet_coactivities;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import p204p.xf40;

/* JADX INFO: loaded from: classes4.dex */
final class zzcc implements zzdd {
    private final xf40 zza;

    public zzcc(Context context) {
        this.zza = xf40.m90456o(zzj.HOST_APP_FAKE_TACHYON, zzb("com.google.android.apps.faketachyon", context), zzj.HOST_APP_DUET, zzb("com.google.android.apps.tachyon", context), zzj.HOST_APP_HAM, zzb("com.google.android.apps.meetings", context), zzj.HOST_APP_MIG, zzb("com.google.android.gm", context));
    }

    private static zzc zzb(String str, Context context) {
        zzabq zzabqVarZzb = zzabs.zza.zzb();
        if (Build.VERSION.SDK_INT >= 34) {
            zzabqVarZzb.zza(true);
        }
        zzabt zzabtVarZzd = zzabt.zzd(zzabo.zzb(new ComponentName(str, "com.google.android.libraries.communications.conference.service.impl.synchronicityservice.SynchronicityEndpointService")), context);
        zzabtVarZzd.zzf(zzaca.zza());
        zzabtVarZzd.zze(zzcd.zza.toMinutes(), TimeUnit.MINUTES);
        zzabtVarZzd.zzg(zzabqVarZzb.zzc());
        zzabtVarZzd.zzc();
        return zzd.zza(zzabtVarZzd.zza());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzdd
    public final Optional zza(zzj zzjVar) {
        return Optional.ofNullable((zzc) this.zza.get(zzjVar));
    }
}
