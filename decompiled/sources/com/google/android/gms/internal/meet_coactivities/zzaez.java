package com.google.android.gms.internal.meet_coactivities;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public interface zzaez extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    zzafa zza(SocketAddress socketAddress, zzaey zzaeyVar, zzwh zzwhVar);

    ScheduledExecutorService zzb();
}
