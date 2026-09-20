package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class zzos implements Iterator {
    final /* synthetic */ zzot zza;
    private int zzb = 0;

    public zzos(zzot zzotVar) {
        this.zza = zzotVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        zzot zzotVar = this.zza;
        return i < zzotVar.zza() - zzotVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.zzb;
        zzot zzotVar = this.zza;
        if (i >= zzotVar.zza() - zzotVar.zzb()) {
            throw new NoSuchElementException();
        }
        zzot zzotVar2 = this.zza;
        Object obj = zzotVar2.zzb.zzb[zzotVar2.zzb() + i];
        this.zzb = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
