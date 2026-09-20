package com.google.android.gms.internal.meet_coactivities;

import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import p204p.c95;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaps {
    final String[] zza;
    final int zzb;

    public zzaps(zzxn zzxnVar) {
        c95.m31848n(zzxnVar, "eag");
        this.zza = new String[zzxnVar.zzb().size()];
        Iterator it = zzxnVar.zzb().iterator();
        int i = 0;
        while (it.hasNext()) {
            this.zza[i] = ((SocketAddress) it.next()).toString();
            i++;
        }
        Arrays.sort(this.zza);
        this.zzb = Arrays.hashCode(this.zza);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzaps)) {
            return false;
        }
        zzaps zzapsVar = (zzaps) obj;
        if (zzapsVar.zzb == this.zzb) {
            String[] strArr = zzapsVar.zza;
            String[] strArr2 = this.zza;
            if (strArr.length == strArr2.length) {
                return Arrays.equals(strArr, strArr2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb;
    }

    public final String toString() {
        return Arrays.toString(this.zza);
    }
}
