package com.spotify.premiumdestination.upsell.activity.upsell;

import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;
import p204p.i6o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/premiumdestination/upsell/activity/upsell/TrialActivationService;", "Lp/i6o;", "src_main_java_com_spotify_premiumdestination_upsell-upsell"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class TrialActivationService extends i6o {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
