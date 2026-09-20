package com.google.android.gms.internal.meet_coactivities;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaak {
    private List zza = Collections.EMPTY_LIST;
    private zzvz zzb = zzvz.zza;
    private zzaah zzc;

    public final zzaak zza(List list) {
        this.zza = list;
        return this;
    }

    public final zzaak zzb(zzvz zzvzVar) {
        this.zzb = zzvzVar;
        return this;
    }

    public final zzaak zzc(zzaah zzaahVar) {
        this.zzc = zzaahVar;
        return this;
    }

    public final zzaal zzd() {
        return new zzaal(this.zza, this.zzb, this.zzc);
    }
}
