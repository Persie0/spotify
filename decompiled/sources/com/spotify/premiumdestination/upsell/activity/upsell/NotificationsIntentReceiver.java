package com.spotify.premiumdestination.upsell.activity.upsell;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.spotify.base.java.logging.Logger;
import kotlin.Metadata;
import p204p.sk8;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/premiumdestination/upsell/activity/upsell/NotificationsIntentReceiver;", "Lp/sk8;", "<init>", "()V", "src_main_java_com_spotify_premiumdestination_upsell-upsell"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NotificationsIntentReceiver extends sk8 {
    @Override // p204p.sk8
    /* JADX INFO: renamed from: a */
    public final void mo13292a(Context context, Intent intent) {
        if ("com.spotify.premiumdestination.upsell.SHOW_MAIN".equals(intent.getAction())) {
            PackageManager packageManager = context.getPackageManager();
            context.startActivity(packageManager != null ? packageManager.getLaunchIntentForPackage(context.getPackageName()) : null);
        } else {
            String action = intent.getAction();
            if (action == null) {
                action = "";
            }
            Logger.m3966b("Unexpected action: %s", action);
        }
    }
}
