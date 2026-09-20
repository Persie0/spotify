package com.google.android.gms.internal.meet_coactivities;

import p204p.c95;
import p204p.wuc;

/* JADX INFO: loaded from: classes4.dex */
final class zzzo extends zzzr {
    private final zzzp zza;

    public /* synthetic */ zzzo(String str, boolean z, zzzp zzzpVar, zzzn zzznVar) {
        super(str, false, zzzpVar, null);
        c95.m31846l(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        c95.m31848n(zzzpVar, "marshaller");
        this.zza = zzzpVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzr
    public final Object zza(byte[] bArr) {
        return this.zza.zza(new String(bArr, wuc.f255135a));
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzzr
    public final byte[] zzb(Object obj) {
        String strZzb = this.zza.zzb(obj);
        c95.m31848n(strZzb, "null marshaller.toAsciiString()");
        return strZzb.getBytes(wuc.f255135a);
    }
}
