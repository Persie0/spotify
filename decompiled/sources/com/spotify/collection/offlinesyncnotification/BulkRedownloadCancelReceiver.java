package com.spotify.collection.offlinesyncnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.protobuf.Empty;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p204p.af8;
import p204p.fby;
import p204p.fwk0;
import p204p.ok0;
import p204p.opo;
import p204p.umm;
import p204p.wj50;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/collection/offlinesyncnotification/BulkRedownloadCancelReceiver;", "Lp/umm;", "<init>", "()V", "src_main_java_com_spotify_collection_offlinesyncnotification-offlinesyncnotification"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class BulkRedownloadCancelReceiver extends umm {

    /* JADX INFO: renamed from: a */
    public fwk0 f3363a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        opo.m67561k(this, context);
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        fwk0 fwk0Var = this.f3363a;
        if (fwk0Var != null) {
            fwk0Var.callSingle("spotify.offline_esperanto.proto.Offline", "BulkRedownloadCancel", Empty.m1933n()).map(fby.f67925R0).timeout(5L, TimeUnit.SECONDS).doFinally(new ok0(13, context, pendingResultGoAsync)).subscribe(af8.f15082e, af8.f15083f);
        } else {
            wj50.m88260d0("offlineClient");
            throw null;
        }
    }
}
