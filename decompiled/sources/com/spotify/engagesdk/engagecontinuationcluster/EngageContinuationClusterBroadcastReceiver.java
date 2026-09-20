package com.spotify.engagesdk.engagecontinuationcluster;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import p204p.b7v;
import p204p.dit0;
import p204p.dmm;
import p204p.wj50;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/engagesdk/engagecontinuationcluster/EngageContinuationClusterBroadcastReceiver;", "Lp/dmm;", "<init>", "()V", "src_main_java_com_spotify_engagesdk_engagecontinuationcluster-engagecontinuationcluster"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class EngageContinuationClusterBroadcastReceiver extends dmm {

    /* JADX INFO: renamed from: b */
    public dit0 f3846b;

    /* JADX INFO: renamed from: c */
    public b7v f3847c;

    @Override // p204p.dmm
    /* JADX INFO: renamed from: b */
    public final void mo2762b(Context context, Intent intent) {
        dit0 dit0Var = this.f3846b;
        if (dit0Var == null) {
            wj50.m88260d0("publishingScheduler");
            throw null;
        }
        dit0Var.mo28403a();
        b7v b7vVar = this.f3847c;
        if (b7vVar != null) {
            b7vVar.mo28403a();
        } else {
            wj50.m88260d0("onBroadcastSignInHandlerScheduler");
            throw null;
        }
    }
}
