package com.google.android.gms.internal.meet_coactivities;

import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import p204p.pf40;

/* JADX INFO: loaded from: classes4.dex */
final class zzall {
    private List zza;
    private int zzb;
    private int zzc;

    public zzall(List list) {
        this.zza = list == null ? Collections.EMPTY_LIST : list;
    }

    public final int zza() {
        List list = this.zza;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final zzvz zzb() {
        if (zzg()) {
            return ((zzxn) this.zza.get(this.zzb)).zza();
        }
        throw new IllegalStateException("Index is off the end of the address group list");
    }

    public final SocketAddress zzc() {
        if (zzg()) {
            return (SocketAddress) ((zzxn) this.zza.get(this.zzb)).zzb().get(this.zzc);
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final void zzd() {
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zze(pf40 pf40Var) {
        List list = pf40Var;
        if (pf40Var == null) {
            list = Collections.EMPTY_LIST;
        }
        this.zza = list;
        zzd();
    }

    public final boolean zzf() {
        if (!zzg()) {
            return false;
        }
        zzxn zzxnVar = (zzxn) this.zza.get(this.zzb);
        int i = this.zzc + 1;
        this.zzc = i;
        if (i < zzxnVar.zzb().size()) {
            return true;
        }
        int i2 = this.zzb + 1;
        this.zzb = i2;
        this.zzc = 0;
        return i2 < this.zza.size();
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
