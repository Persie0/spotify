package com.spotify.externalintegration.http;

import java.util.Iterator;
import kotlin.Metadata;
import p204p.be00;
import p204p.jx71;
import p204p.wj50;
import p204p.wt30;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/externalintegration/http/HydrogenRenderingAdapter;", "", "", "json", "Lp/wt30;", "fromJson", "(Ljava/lang/String;)Lp/wt30;", "rendering", "toJson", "(Lp/wt30;)Ljava/lang/String;", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class HydrogenRenderingAdapter {
    @be00
    public final wt30 fromJson(String json) {
        Object next;
        Iterator<E> it = wt30.m88904a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!wj50.m88271j(((wt30) next).name(), json));
        wt30 wt30Var = (wt30) next;
        return wt30Var == null ? wt30.UNKNOWN : wt30Var;
    }

    @jx71
    public final String toJson(wt30 rendering) {
        return rendering.name();
    }
}
