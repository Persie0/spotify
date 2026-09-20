package com.google.android.gms.internal.meet_coactivities;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzlz {
    public static final zzlz zzc = new zzlu();
    public static final zzlz zzd = new zzlu();

    public static zzlz zzc(zzlz zzlzVar, zzlz zzlzVar2) {
        zzlz zzlzVar3;
        zzlz zzlzVar4;
        if (zzlzVar == null) {
            return zzlzVar2;
        }
        if (zzlzVar2 == null || zzlzVar == (zzlzVar3 = zzc) || zzlzVar2 == (zzlzVar4 = zzd)) {
            return zzlzVar;
        }
        return (zzlzVar2 == zzlzVar3 || zzlzVar == zzlzVar4) ? zzlzVar2 : new zzlv(zzlzVar, zzlzVar2);
    }

    public abstract void zzb();
}
