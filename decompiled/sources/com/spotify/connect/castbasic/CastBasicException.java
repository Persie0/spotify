package com.spotify.connect.castbasic;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/connect/castbasic/CastBasicException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "src_main_java_com_spotify_connect_castbasic-castbasic"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CastBasicException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final int f3373a;

    /* JADX INFO: renamed from: b */
    public final Throwable f3374b;

    public CastBasicException(int i, Exception exc, String str) {
        super(str);
        this.f3373a = i;
        this.f3374b = exc;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message;
        Throwable th = this.f3374b;
        return (th == null || (message = th.getMessage()) == null) ? super.getMessage() : message;
    }
}
