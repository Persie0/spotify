package com.spotify.remoteconfig.fetcherimpl.network;

import kotlin.Metadata;
import p204p.o2x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/remoteconfig/fetcherimpl/network/UcsRequestFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_remoteconfig_fetcherimpl-fetcherimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class UcsRequestFailedException extends Exception {

    /* JADX INFO: renamed from: a */
    public final o2x0 f6627a;

    public UcsRequestFailedException(o2x0 o2x0Var) {
        super("UCS request failed!");
        this.f6627a = o2x0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final o2x0 getF6627a() {
        return this.f6627a;
    }
}
