package com.google.android.gms.internal.meet_coactivities;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p204p.c95;
import p204p.dq60;

/* JADX INFO: loaded from: classes4.dex */
public final class zzxn {
    public static final zzvx zza = zzvx.zza("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    private final List zzb;
    private final zzvz zzc;
    private final int zzd;

    public zzxn(List list, zzvz zzvzVar) {
        c95.m31844j(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.zzb = listUnmodifiableList;
        c95.m31848n(zzvzVar, "attrs");
        this.zzc = zzvzVar;
        this.zzd = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxn)) {
            return false;
        }
        zzxn zzxnVar = (zzxn) obj;
        if (this.zzb.size() != zzxnVar.zzb.size()) {
            return false;
        }
        for (int i = 0; i < this.zzb.size(); i++) {
            if (!((SocketAddress) this.zzb.get(i)).equals(zzxnVar.zzb.get(i))) {
                return false;
            }
        }
        return this.zzc.equals(zzxnVar.zzc);
    }

    public final int hashCode() {
        return this.zzd;
    }

    public final String toString() {
        return dq60.m36615o("[", String.valueOf(this.zzb), "/", String.valueOf(this.zzc), "]");
    }

    public final zzvz zza() {
        return this.zzc;
    }

    public final List zzb() {
        return this.zzb;
    }
}
