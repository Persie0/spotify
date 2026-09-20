package com.google.android.gms.internal.meet_coactivities;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zznj implements Iterator {
    final /* synthetic */ zznl zza;
    private final zzlt zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zznj(zznl zznlVar, zzlt zzltVar, int i, zzni zzniVar) {
        this.zza = zznlVar;
        this.zzb = zzltVar;
        int i2 = i & 31;
        this.zzc = i2;
        this.zzd = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objZze = this.zzb.zze(this.zza.zzj(this.zzc));
        int i = this.zzd;
        if (i == 0) {
            this.zzc = -1;
            return objZze;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
        this.zzd >>>= iNumberOfTrailingZeros;
        this.zzc += iNumberOfTrailingZeros;
        return objZze;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
