package com.spotify.outcome.outcomeapi.exceptions;

import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/outcome/outcomeapi/exceptions/HttpError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_outcome_outcomeapi-outcomeapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class HttpError extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f6407a;

    /* JADX INFO: renamed from: b */
    public final String f6408b;

    public HttpError(int i, String str) {
        super(str);
        this.f6407a = i;
        this.f6408b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpError)) {
            return false;
        }
        HttpError httpError = (HttpError) obj;
        return this.f6407a == httpError.f6407a && wj50.m88271j(this.f6408b, httpError.f6408b);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f6408b;
    }

    public final int hashCode() {
        return this.f6408b.hashCode() + (Integer.hashCode(this.f6407a) * 31);
    }
}
