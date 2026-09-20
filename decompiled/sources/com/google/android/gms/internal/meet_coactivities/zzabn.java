package com.google.android.gms.internal.meet_coactivities;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class zzabn extends zzxe {
    private static final Logger zzb = Logger.getLogger(zzabn.class.getName());
    static final ThreadLocal zza = new ThreadLocal();

    @Override // com.google.android.gms.internal.meet_coactivities.zzxe
    public final zzxf zza() {
        zzxf zzxfVar = (zzxf) zza.get();
        return zzxfVar == null ? zzxf.zzb : zzxfVar;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzxe
    public final zzxf zzb(zzxf zzxfVar) {
        zzxf zzxfVarZza = zza();
        zza.set(zzxfVar);
        return zzxfVarZza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzxe
    public final void zzc(zzxf zzxfVar, zzxf zzxfVar2) {
        if (zza() != zzxfVar) {
            zzb.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (zzxfVar2 != zzxf.zzb) {
            zza.set(zzxfVar2);
        } else {
            zza.set(null);
        }
    }
}
