package com.spotify.cosmos.routercallback;

import android.os.Handler;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.cosmos.parsers.ResponseParser;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0014¢\u0006\u0002\u0010\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m24212d2 = {"Lcom/spotify/cosmos/routercallback/DelegableParsingCallbackReceiver;", "T", "Lcom/spotify/cosmos/routercallback/ParsingCallbackReceiver;", "handler", "Landroid/os/Handler;", "parser", "Lcom/spotify/cosmos/parsers/ResponseParser;", "<init>", "(Landroid/os/Handler;Lcom/spotify/cosmos/parsers/ResponseParser;)V", "parseResponse", "response", "Lcom/spotify/cosmos/cosmos/Response;", "(Lcom/spotify/cosmos/cosmos/Response;)Ljava/lang/Object;", "src_main_java_com_spotify_cosmos_routercallback-routercallback"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class DelegableParsingCallbackReceiver<T> extends ParsingCallbackReceiver<T> {
    private final ResponseParser<T> parser;

    public DelegableParsingCallbackReceiver(Handler handler, ResponseParser<T> responseParser) {
        super(handler);
        this.parser = responseParser;
    }

    @Override // com.spotify.cosmos.routercallback.ParsingCallbackReceiver
    public T parseResponse(Response response) {
        return this.parser.parseResponse(response);
    }
}
