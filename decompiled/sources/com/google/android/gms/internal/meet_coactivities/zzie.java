package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import java.util.Optional;
import p204p.c8e0;
import p204p.i3n0;
import p204p.iue;
import p204p.lv1;
import p204p.mv1;
import p204p.sv1;
import p204p.sve;
import p204p.tv1;
import p204p.u790;
import p204p.vxe;
import p204p.xv1;

/* JADX INFO: loaded from: classes.dex */
public interface zzie extends mv1 {
    @Override // p204p.mv1
    /* synthetic */ sv1 newSessionBuilder(xv1 xv1Var);

    /* synthetic */ void notifyAddonFailureEvent(Context context, lv1 lv1Var);

    @Override // p204p.mv1
    /* synthetic */ void registerMeetingStatusListener(Context context, c8e0 c8e0Var, Optional optional);

    @Override // p204p.mv1
    /* synthetic */ void unregisterMeetingStatusListener(Context context);

    void zzQ(Runnable runnable);

    void zzR();

    void zzS(vxe vxeVar);

    void zzT(zzrr zzrrVar);

    void zzU(zzrr zzrrVar, i3n0 i3n0Var);

    boolean zzW();

    @Deprecated
    u790 zza(iue iueVar, Optional optional);

    @Deprecated
    u790 zzb(sve sveVar, Optional optional);

    @Deprecated
    u790 zzc(Context context, xv1 xv1Var);

    @Deprecated
    u790 zzd();

    u790 zzm(Context context, xv1 xv1Var);

    u790 zzn(tv1 tv1Var);
}
