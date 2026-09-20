package com.spotify.cosmos.parsers;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.cosmos.Response;
import java.io.IOException;
import kotlin.Metadata;
import p204p.na6;
import p204p.p0i0;
import p204p.vuc;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, m24212d2 = {"Lcom/spotify/cosmos/parsers/MoshiParser;", "T", "Lcom/spotify/cosmos/parsers/ResponseParser;", "Ljava/lang/Class;", "modelClass", "Lp/p0i0;", "moshi", "<init>", "(Ljava/lang/Class;Lp/p0i0;)V", "Lcom/spotify/cosmos/cosmos/Response;", "response", "parseResponse", "(Lcom/spotify/cosmos/cosmos/Response;)Ljava/lang/Object;", "Ljava/lang/Class;", "Lp/p0i0;", "src_main_java_com_spotify_cosmos_parsers-parsers"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class MoshiParser<T> implements ResponseParser<T> {
    private final Class<T> modelClass;
    private final p0i0 moshi;

    public MoshiParser(Class<T> cls, p0i0 p0i0Var) {
        this.modelClass = cls;
        this.moshi = p0i0Var;
    }

    @Override // com.spotify.cosmos.parsers.ResponseParser
    public T parseResponse(Response response) {
        System.nanoTime();
        try {
            try {
                byte[] body = response.getBody();
                T tFromJson = this.moshi.m68703c(this.modelClass).fromJson(body != null ? new String(body, vuc.f244913a) : new String());
                System.nanoTime();
                this.modelClass.getClass();
                return tFromJson;
            } catch (IOException e) {
                Logger.m3966b("Error parsing JSON String, response: %s", response.toString());
                throw new ParserException(e);
            } catch (ArrayStoreException e2) {
                Logger.m3966b("Error parsing JSON String, response: %s", response.toString());
                na6.m63959g("Caught an exception while parsing JSON string", e2);
                System.nanoTime();
                this.modelClass.getClass();
                return null;
            }
        } catch (Throwable th) {
            System.nanoTime();
            this.modelClass.getClass();
            throw th;
        }
    }
}
