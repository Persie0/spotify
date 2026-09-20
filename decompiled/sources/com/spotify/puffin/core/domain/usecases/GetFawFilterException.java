package com.spotify.puffin.core.domain.usecases;

import kotlin.Metadata;
import p204p.m951;
import p204p.wj50;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/puffin/core/domain/usecases/GetFawFilterException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_puffin_core-core"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class GetFawFilterException extends Exception {

    /* JADX INFO: renamed from: a */
    public final m951 f6585a;

    public GetFawFilterException(m951 m951Var) {
        super("Error getting raw filter. Filter: " + m951Var);
        this.f6585a = m951Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetFawFilterException) && wj50.m88271j(this.f6585a, ((GetFawFilterException) obj).f6585a);
    }

    public final int hashCode() {
        return this.f6585a.hashCode();
    }
}
