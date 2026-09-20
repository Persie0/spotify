package com.google.android.gms.internal.meet_coactivities;

import java.net.SocketAddress;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
final class zzakr extends zzaan {
    final /* synthetic */ zzaks zza;

    public zzakr(zzaks zzaksVar) {
        this.zza = zzaksVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public final String zza() {
        return this.zza.zzb;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzaan
    public final void zzd(zzaaj zzaajVar) {
        SocketAddress socketAddress = this.zza.zza;
        zzaak zzaakVarZzc = zzaal.zzc();
        zzvz zzvzVar = zzvz.zza;
        zzaakVarZzc.zza(Collections.singletonList(new zzxn(Collections.singletonList(socketAddress), zzvzVar)));
        zzaakVarZzc.zzb(zzvzVar);
        zzaajVar.zzb(zzaakVarZzc.zzd());
    }
}
