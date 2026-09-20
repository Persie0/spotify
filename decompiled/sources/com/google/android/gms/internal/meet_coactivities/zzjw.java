package com.google.android.gms.internal.meet_coactivities;

import p204p.qv1;
import p204p.rv1;
import p204p.ycm0;

/* JADX INFO: loaded from: classes4.dex */
public final class zzjw implements zzkm {
    public static final rv1 zzb(zzl zzlVar) {
        qv1 qv1Var;
        ycm0 ycm0Var = new ycm0();
        ycm0Var.m93373v(zzlVar.zzf());
        ycm0Var.m93375x(zzlVar.zzg());
        switch (zzlVar.zzd()) {
            case UNKNOWN:
            case CONNECTING:
            case ENDING:
            case ENDED:
            case NOT_CONNECTED:
            case ENDED_UNEXPECTEDLY:
            case ENDED_DUE_TO_RECORDING_STATUS_DESYNC:
            case UNRECOGNIZED:
                qv1Var = qv1.f192850a;
                break;
            case CONNECTED:
                qv1Var = qv1.f192851b;
                break;
            case CONNECTED_WITH_COACTIVITY:
            case CONNECTED_WITH_COACTIVITY_LOCAL_USER_LEFT:
                qv1Var = qv1.f192852c;
                break;
            default:
                throw new AssertionError();
        }
        ycm0Var.f271529d = qv1Var;
        ycm0Var.m93376y(zzkn.zzb(zzlVar.zze()));
        return ycm0Var.m93361j();
    }

    @Override // com.google.android.gms.internal.meet_coactivities.zzkm
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        throw null;
    }
}
