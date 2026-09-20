package com.spotify.tap.p163go.protocol;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/tap/go/protocol/GoProtocolParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "src_main_java_com_spotify_tap_go-go"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class GoProtocolParseException extends Exception {

    /* JADX INFO: renamed from: a */
    public final byte[] f6678a;

    /* JADX WARN: Illegal instructions before constructor call */
    public GoProtocolParseException(byte[] bArr, int i) {
        String str;
        if (i == 1) {
            str = "No registered parser for the included command type.";
        } else if (i == 2) {
            str = "Data length does not match the included command length.";
        } else if (i == 3) {
            str = "Last command string is not terminated with 0x0.";
        } else if (i == 4) {
            str = "This parser does not support the included command type.";
        } else {
            if (i != 5) {
                throw null;
            }
            str = "Play commands should include 3 data strings.";
        }
        super(str);
        this.f6678a = bArr;
    }
}
