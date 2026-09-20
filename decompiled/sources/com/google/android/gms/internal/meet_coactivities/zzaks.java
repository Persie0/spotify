package com.google.android.gms.internal.meet_coactivities;

import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
final class zzaks extends zzaao {
    final SocketAddress zza;
    final String zzb;
    final Collection zzc;

    public zzaks(SocketAddress socketAddress, String str) {
        this.zza = socketAddress;
        this.zzb = str;
        this.zzc = Collections.singleton(socketAddress.getClass());
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaai
    public final zzaan zza(URI uri, zzaag zzaagVar) {
        return new zzakr(this);
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaai
    public final String zzb() {
        return "directaddress";
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaao
    public final int zzc() {
        return 5;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaao
    public final Collection zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaao
    public final boolean zze() {
        return true;
    }
}
