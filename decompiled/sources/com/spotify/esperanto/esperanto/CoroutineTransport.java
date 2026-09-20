package com.spotify.esperanto.esperanto;

import kotlin.Metadata;
import p204p.fbk;
import p204p.fiz;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/esperanto/esperanto/CoroutineTransport;", "", "", "service", "method", "", "payload", "Lp/fiz;", "callStream", "(Ljava/lang/String;Ljava/lang/String;[B)Lp/fiz;", "callSingle", "(Ljava/lang/String;Ljava/lang/String;[BLp/fbk;)Ljava/lang/Object;", "callSync", "(Ljava/lang/String;Ljava/lang/String;[B)[B", "src_main_java_com_spotify_esperanto_esperanto-esperanto_kt-api"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface CoroutineTransport {
    Object callSingle(String str, String str2, byte[] bArr, fbk<? super byte[]> fbkVar);

    fiz callStream(String service, String method, byte[] payload);

    byte[] callSync(String service, String method, byte[] payload);
}
