package com.google.android.gms.internal.meet_coactivities;

import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
final class zzzu extends zzzr {
    private final zzzv zza;

    public /* synthetic */ zzzu(String str, boolean z, zzzv zzzvVar, zzzt zzztVar) {
        super(str, z, zzzvVar, null);
        c95.m31846l(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        c95.m31848n(zzzvVar, "marshaller");
        this.zza = zzzvVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzr
    public final Object zza(byte[] bArr) {
        throw null;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzr
    public final byte[] zzb(Object obj) {
        byte[] bArrZza = this.zza.zza(obj);
        c95.m31848n(bArrZza, "null marshaller.toAsciiString()");
        return bArrZza;
    }
}
