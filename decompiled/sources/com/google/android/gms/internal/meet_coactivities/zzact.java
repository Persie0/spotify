package com.google.android.gms.internal.meet_coactivities;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class zzact {
    final InputStream zza = null;
    final byte[] zzb;
    final int zzc;
    final boolean zzd;

    public zzact(InputStream inputStream, byte[] bArr, int i, boolean z) {
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransactionData[");
        sb.append(this.zzc);
        sb.append("b array");
        sb.append(true != this.zzd ? "]" : "(last)]");
        return sb.toString();
    }
}
