package com.spotify.listplatform.sortingimpl.moshi;

import com.spotify.common.uri.SpotifyUriParserException;
import com.squareup.moshi.JsonDataException;
import kotlin.Metadata;
import p204p.be00;
import p204p.hk60;
import p204p.jx71;
import p204p.rm60;
import p204p.s9k;
import p204p.xl60;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m24212d2 = {"Lcom/spotify/listplatform/sortingimpl/moshi/ContextUriJsonAdapter;", "Lp/hk60;", "Lp/s9k;", "Lp/xl60;", "reader", "fromJson", "(Lp/xl60;)Lp/s9k;", "Lp/rm60;", "writer", "contextUri", "Lp/w2a1;", "toJson", "(Lp/rm60;Lp/s9k;)V", "src_main_java_com_spotify_listplatform_sortingimpl-sortingimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ContextUriJsonAdapter extends hk60<s9k> {
    @Override // p204p.hk60
    @be00
    public s9k fromJson(xl60 reader) {
        Object objM91381J = reader.m91381J();
        String str = objM91381J instanceof String ? (String) objM91381J : null;
        if (str == null) {
            throw new JsonDataException("Uri value is null");
        }
        try {
            return new s9k(str);
        } catch (SpotifyUriParserException unused) {
            throw new JsonDataException("Uri is not a valid Spotify uri");
        }
    }

    @Override // p204p.hk60
    @jx71
    public void toJson(rm60 writer, s9k contextUri) {
        writer.mo56887N(String.valueOf(contextUri));
    }
}
