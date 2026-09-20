package com.spotify.apprater.appraterdialog;

import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p204p.bnm0;
import p204p.cbm0;
import p204p.dwf;
import p204p.ed5;
import p204p.edi0;
import p204p.f710;
import p204p.fke;
import p204p.fyf;
import p204p.ic41;
import p204p.wj50;
import p204p.xgg1;
import p204p.xoc1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/apprater/appraterdialog/AppRaterActivity;", "Lp/ic41;", "<init>", "()V", "src_main_java_com_spotify_apprater_appraterdialog-appraterdialog"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AppRaterActivity extends ic41 {

    /* JADX INFO: renamed from: e1 */
    public static final /* synthetic */ int f2991e1 = 0;

    /* JADX INFO: renamed from: d1 */
    public fke f2992d1;

    @Override // p204p.ic41, p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 mo2758g() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return new bnm0(f710.m40939g(xgg1.m90662N1("APPRATER", "apprater", 152, "apprater"), xoc1.f263913J2.m86091c(), 4));
    }

    @Override // p204p.ic41, p204p.cc80, p204p.m500, p204p.cwf, p204p.bwf, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fke fkeVar = this.f2992d1;
        if (fkeVar != null) {
            dwf.m37156a(this, new fyf(new ed5(this, new Intent("android.intent.action.VIEW", ((edi0) fkeVar).m38597c()), 2), true, 594474131));
        } else {
            wj50.m88260d0("clientInfo");
            throw null;
        }
    }
}
