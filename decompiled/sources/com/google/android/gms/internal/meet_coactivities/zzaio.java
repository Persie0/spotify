package com.google.android.gms.internal.meet_coactivities;

import java.net.SocketAddress;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzaio {
    private List zza;
    private int zzb;
    private int zzc;

    public zzaio(List list) {
        this.zza = list;
    }

    public final zzvz zza() {
        return ((zzxn) this.zza.get(this.zzb)).zza();
    }

    public final SocketAddress zzb() {
        return (SocketAddress) ((zzxn) this.zza.get(this.zzb)).zzb().get(this.zzc);
    }

    public final void zzc() {
        zzxn zzxnVar = (zzxn) this.zza.get(this.zzb);
        int i = this.zzc + 1;
        this.zzc = i;
        if (i >= zzxnVar.zzb().size()) {
            this.zzb++;
            this.zzc = 0;
        }
    }

    public final void zzd() {
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zze(List list) {
        this.zza = list;
        zzd();
    }

    public final boolean zzf() {
        return this.zzb == 0 && this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzb < this.zza.size();
    }

    public final boolean zzh(SocketAddress socketAddress) {
        for (int i = 0; i < this.zza.size(); i++) {
            int iIndexOf = ((zzxn) this.zza.get(i)).zzb().indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.zzb = i;
                this.zzc = iIndexOf;
                return true;
            }
        }
        return false;
    }
}
