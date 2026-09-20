package com.spotify.collection.downloaded.service;

import android.content.Intent;
import com.spotify.offline_esperanto.proto.EsOffline$DownloadRequest;
import kotlin.Metadata;
import p204p.amw;
import p204p.fwk0;
import p204p.hsy;
import p204p.o1n;
import p204p.s571;
import p204p.sqw;
import p204p.t0b1;
import p204p.wj50;
import p204p.xyk0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/collection/downloaded/service/OffliningService;", "Lp/o1n;", "<init>", "()V", "p/vhf1", "src_main_java_com_spotify_collection_downloaded-downloaded"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class OffliningService extends o1n {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f3361b = 0;

    /* JADX INFO: renamed from: a */
    public xyk0 f3362a;

    public OffliningService() {
        super("OffliningService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        t0b1 t0b1Var = t0b1.f215827a1;
        String action = intent != null ? intent.getAction() : null;
        if (!"com.spotify.collection.downloaded.service.OffliningService.action.UPDATE".equals(action)) {
            throw new IllegalArgumentException(s571.m77251j("Unsupported action ", action, " in OffliningService.").toString());
        }
        String stringExtra = intent.getStringExtra("uri");
        if (stringExtra == null) {
            throw new IllegalArgumentException(("Unsupported uri in " + intent).toString());
        }
        if (intent.getBooleanExtra("state", false)) {
            xyk0 xyk0Var = this.f3362a;
            if (xyk0Var == null) {
                wj50.m88260d0("offlineInteractor");
                throw null;
            }
            sqw sqwVar = (sqw) xyk0Var;
            fwk0 fwk0Var = sqwVar.f213179a;
            amw amwVarM16125q = EsOffline$DownloadRequest.m16125q();
            amwVarM16125q.m26450r(stringExtra);
            sqwVar.f213180b.detached(fwk0Var.m42967a((EsOffline$DownloadRequest) amwVarM16125q.build()).map(t0b1Var));
            return;
        }
        xyk0 xyk0Var2 = this.f3362a;
        if (xyk0Var2 == null) {
            wj50.m88260d0("offlineInteractor");
            throw null;
        }
        sqw sqwVar2 = (sqw) xyk0Var2;
        fwk0 fwk0Var2 = sqwVar2.f213179a;
        amw amwVarM16125q2 = EsOffline$DownloadRequest.m16125q();
        amwVarM16125q2.m26450r(stringExtra);
        sqwVar2.f213180b.detached(fwk0Var2.callSingle("spotify.offline_esperanto.proto.Offline", "RemoveDownload", (EsOffline$DownloadRequest) amwVarM16125q2.build()).map(hsy.f94834S0).map(t0b1Var));
    }
}
