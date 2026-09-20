package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzux implements Iterator {
    final /* synthetic */ zzvb zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzux(zzvb zzvbVar, zzuw zzuwVar) {
        this.zza = zzvbVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzb.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb + 1 >= this.zza.zza.size()) {
            return !this.zza.zzb.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        return i < this.zza.zza.size() ? (Map.Entry) this.zza.zza.get(this.zzb) : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzn();
        if (this.zzb >= this.zza.zza.size()) {
            zza().remove();
            return;
        }
        zzvb zzvbVar = this.zza;
        int i = this.zzb;
        this.zzb = i - 1;
        zzvbVar.zzl(i);
    }
}
