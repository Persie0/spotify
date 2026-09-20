package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.Metadata;
import p204p.p1v;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "okhttp"}, m24213k = 1, m24214mv = {2, 2, 0}, m24216xi = 48)
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: a */
    public final int f10944a;

    public StreamResetException(int i) {
        super("stream was reset: ".concat(p1v.m68861r(i)));
        this.f10944a = i;
    }
}
