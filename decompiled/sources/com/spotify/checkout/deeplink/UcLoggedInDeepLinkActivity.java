package com.spotify.checkout.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import p204p.g6f;
import p204p.r55;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/checkout/deeplink/UcLoggedInDeepLinkActivity;", "Lp/r55;", "<init>", "()V", "src_main_java_com_spotify_checkout_deeplink-deeplink"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class UcLoggedInDeepLinkActivity extends r55 {
    @Override // p204p.m500, p204p.cwf, p204p.bwf, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intent intent2 = new Intent(intent);
        Uri uriBuild = null;
        intent2.setComponent(null);
        Uri data = intent.getData();
        if (data != null) {
            uriBuild = data.buildUpon().path(g6f.m43753y0(g6f.m43731l0(1, data.getPathSegments()), "/", null, null, null, 62)).build();
        }
        intent2.setData(uriBuild);
        intent2.addFlags(33554432);
        startActivity(intent2);
        finish();
    }
}
