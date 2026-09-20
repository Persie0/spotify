package com.spotify.storage.localstorage;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p204p.bnm0;
import p204p.cbm0;
import p204p.dwf;
import p204p.f710;
import p204p.fyf;
import p204p.ic41;
import p204p.iqr;
import p204p.xgg1;
import p204p.xoc1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/storage/localstorage/DiskAlmostFullActivity;", "Lp/ic41;", "<init>", "()V", "src_main_java_com_spotify_storage_localstorage-localstorage"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DiskAlmostFullActivity extends ic41 {
    @Override // p204p.ic41, p204p.anm0
    /* JADX INFO: renamed from: g */
    public final bnm0 mo2758g() {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        return new bnm0(f710.m40939g(xgg1.m90662N1("DIALOG_DISKALMOSTFULL", "dialog/diskalmostfull", 467, "dialog"), xoc1.f263896H1.m86091c(), 4));
    }

    @Override // p204p.ic41, p204p.cc80, p204p.m500, p204p.cwf, p204p.bwf, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dwf.m37156a(this, new fyf(new iqr(this, 2), true, 1558999806));
    }
}
