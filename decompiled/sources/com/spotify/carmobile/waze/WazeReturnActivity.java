package com.spotify.carmobile.waze;

import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p204p.bnm0;
import p204p.cbm0;
import p204p.f710;
import p204p.ic41;
import p204p.sv8;
import p204p.wj50;
import p204p.xgg1;
import p204p.xoc1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/carmobile/waze/WazeReturnActivity;", "Lp/ic41;", "<init>", "()V", "src_main_java_com_spotify_carmobile_waze-waze"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class WazeReturnActivity extends ic41 {

    /* JADX INFO: renamed from: d1 */
    public sv8 f3277d1;

    @Override // p204p.ic41, p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 mo2758g() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return new bnm0(f710.m40939g(xgg1.m90662N1("CARS_WAZE", "cars/waze", 278, "cars"), xoc1.f263887G0.m86091c(), 4));
    }

    @Override // p204p.cc80, p204p.m500, android.app.Activity
    public final void onResume() {
        super.onResume();
        sv8 sv8Var = this.f3277d1;
        if (sv8Var == null) {
            wj50.m88260d0("bannerSessionNavigationDelegate");
            throw null;
        }
        sv8Var.m79428a(xoc1.f263887G0.f243453a);
        if (isTaskRoot()) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(xoc1.f263839A0.f243453a));
            intent.setFlags(268435456);
            startActivity(intent);
        }
        finish();
    }
}
