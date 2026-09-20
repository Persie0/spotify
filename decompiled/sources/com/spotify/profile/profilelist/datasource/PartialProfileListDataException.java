package com.spotify.profile.profilelist.datasource;

import kotlin.Metadata;
import p204p.qxr0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/profile/profilelist/datasource/PartialProfileListDataException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "src_main_java_com_spotify_profile_profilelist-profilelist"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class PartialProfileListDataException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final qxr0 f6565a;

    public PartialProfileListDataException(qxr0 qxr0Var, Throwable th) {
        super(th);
        this.f6565a = qxr0Var;
    }
}
