package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import p204p.w550;

/* JADX INFO: loaded from: classes4.dex */
final class zzz implements w550 {
    final /* synthetic */ Activity zza;

    public zzz(zzaa zzaaVar, Activity activity) {
        this.zza = activity;
    }

    @Override // p204p.w550
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.zza.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }
}
