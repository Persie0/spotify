package com.spotify.cosmos.parsers;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\r"}, m24212d2 = {"Lcom/spotify/cosmos/parsers/ParserException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "detailMessage", "", "<init>", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/Throwable;)V", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "src_main_java_com_spotify_cosmos_parsers-parsers"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ParserException extends Exception {
    private static final long serialVersionUID = -6133574440765179179L;

    public ParserException(String str) {
        super(str);
    }

    public ParserException(Throwable th) {
        super(th);
    }

    public ParserException(String str, Throwable th) {
        super(str, th);
    }
}
