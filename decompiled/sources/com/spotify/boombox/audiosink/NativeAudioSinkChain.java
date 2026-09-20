package com.spotify.boombox.audiosink;

import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/boombox/audiosink/NativeAudioSinkChain;", "", "Ljava/nio/ByteBuffer;", "input", "", "inputOffset", "inputLength", "", "write", "(Ljava/nio/ByteBuffer;II)Z", "signalEndOfStream", "()Z", "output", "read", "(Ljava/nio/ByteBuffer;)I", "eof", "", "frame", "flush", "(J)Z", "Lp/w2a1;", "destroy", "()V", "src_main_java_com_spotify_boombox_audiosink-audiosink"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface NativeAudioSinkChain {
    void destroy();

    boolean eof();

    boolean flush(long frame);

    int read(ByteBuffer output);

    boolean signalEndOfStream();

    boolean write(ByteBuffer input, int inputOffset, int inputLength);
}
