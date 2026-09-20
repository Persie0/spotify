package com.google.android.gms.internal.meet_coactivities;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
final class zzrj extends zzrk {
    final /* synthetic */ zzrr zza;
    private int zzb = 0;
    private final int zzc;

    public zzrj(zzrr zzrrVar) {
        this.zza = zzrrVar;
        this.zzc = zzrrVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzrm
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
