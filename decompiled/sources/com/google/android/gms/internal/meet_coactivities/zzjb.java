package com.google.android.gms.internal.meet_coactivities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import java.util.Optional;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class zzjb {
    private static final zzkz zza = zzkz.zzj("com/google/android/meet/addons/internal/sessiondetection/MeetingStatusUtils");

    public static void zza(Context context, Optional optional, BroadcastReceiver broadcastReceiver, Optional optional2, long j) {
        Intent intent = new Intent("ACTION_S11Y").setPackage((String) optional2.orElse(null));
        Handler handler = (Handler) optional.map(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzja
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Handler) obj;
            }
        }).orElse(null);
        Bundle bundle = new Bundle();
        zzat zzatVarZza = zzau.zza();
        zzatVarZza.zzb(context.getApplicationContext().getPackageName());
        zzatVarZza.zza(j);
        bundle.putByteArray("S11Y_SESSION_DETECTION_REQUEST", ((zzau) zzatVarZza.zzk()).zzx());
        context.sendOrderedBroadcast(intent, null, broadcastReceiver, handler, 0, null, bundle);
        ((zzkv) zza.zzc().zzh("com/google/android/meet/addons/internal/sessiondetection/MeetingStatusUtils", "sendSendOrderedBroadcast", 63, "MeetingStatusUtils.java")).zzp("S11y SDK sent request for meeting status with Meet package %s", optional2.orElse(""));
    }
}
