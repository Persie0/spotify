package com.google.android.gms.internal.meet_coactivities;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class zzakx extends zzahn {
    private static final ReferenceQueue zza = new ReferenceQueue();
    private static final ConcurrentMap zzb = new ConcurrentHashMap();
    private static final Logger zzc = Logger.getLogger(zzakx.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzakx(zzzj zzzjVar) {
        super(zzzjVar);
        ReferenceQueue referenceQueue = zza;
        ConcurrentMap concurrentMap = zzb;
        new zzakw(this, zzzjVar, referenceQueue, concurrentMap);
    }
}
