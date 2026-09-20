package com.google.android.gms.internal.meet_coactivities;

import p204p.n4h1;
import p204p.uve;

/* JADX INFO: loaded from: classes.dex */
public final class zzki implements zzkm {
    private final zzkf zza = zzkd.zza;

    private zzki() {
    }

    public static zzki zzc() {
        return zzkg.zza;
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzkm
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final uve zza(zzqk zzqkVar) {
        n4h1 n4h1VarM84054a = uve.m84054a();
        n4h1VarM84054a.m63677c(zzqkVar.zzg());
        n4h1VarM84054a.m63678d(zzvu.zzb(zzqkVar.zzf()));
        int iZzo = zzqkVar.zzo() - 2;
        int i = 1;
        if (iZzo != 1) {
            i = 2;
            if (iZzo != 2) {
                i = 3;
                if (iZzo != 3) {
                    i = 4;
                    if (iZzo != 4) {
                        throw new AssertionError();
                    }
                }
            }
        }
        n4h1VarM84054a.m63680f(i);
        double dZza = zzqkVar.zza();
        if (dZza == 0.0d) {
            dZza = 1.0d;
        }
        n4h1VarM84054a.m63679e(dZza);
        n4h1VarM84054a.m63676b(this.zza.zza(zzqkVar.zzb()));
        return n4h1VarM84054a.m63675a();
    }

    public /* synthetic */ zzki(zzkh zzkhVar) {
    }
}
