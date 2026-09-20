package com.google.android.gms.internal.meet_coactivities;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxt {
    private SocketAddress zza;
    private InetSocketAddress zzb;
    private String zzc;
    private String zzd;

    private zzxt() {
        throw null;
    }

    public final zzxt zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzxt zzb(SocketAddress socketAddress) {
        c95.m31848n(socketAddress, "proxyAddress");
        this.zza = socketAddress;
        return this;
    }

    public final zzxt zzc(InetSocketAddress inetSocketAddress) {
        c95.m31848n(inetSocketAddress, "targetAddress");
        this.zzb = inetSocketAddress;
        return this;
    }

    public final zzxt zzd(String str) {
        this.zzc = str;
        return this;
    }

    public final zzxv zze() {
        return new zzxv(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    public /* synthetic */ zzxt(zzxs zzxsVar) {
    }
}
