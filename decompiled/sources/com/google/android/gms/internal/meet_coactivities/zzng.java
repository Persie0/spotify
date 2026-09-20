package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzng implements Iterator {
    final /* synthetic */ zznh zza;
    private int zzb = 0;

    public zzng(zznh zznhVar) {
        this.zza = zznhVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zza.zzd;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zznl zznlVar = this.zza.zza;
        int[] iArr = zznlVar.zzc;
        int i = this.zzb;
        this.zzb = i + 1;
        return zznlVar.zzi(iArr[i] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
