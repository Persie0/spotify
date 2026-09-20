package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import p204p.ev61;

/* JADX INFO: loaded from: classes4.dex */
final class zzay extends zzbb {
    public zzay(zzbc zzbcVar, ev61 ev61Var) {
        super(zzbcVar, ev61Var);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzg(int i, Bundle bundle) {
        super.zzg(i, bundle);
        this.zza.m40099d(SplitInstallSessionState.zzd(bundle));
    }
}
