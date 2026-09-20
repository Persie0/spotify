package com.spotify.boombox.audiosinkimpl;

import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\t\u0010\nJ(\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bH\u0086 ¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\u0013\u0010\nJ\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bH\u0086 ¢\u0006\u0004\b\u0016\u0010\u0010J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0086 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u0086 ¢\u0006\u0004\b\u001c\u0010\u0003R$\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, m24212d2 = {"Lcom/spotify/boombox/audiosinkimpl/NativeAudioSinkChainHandleImpl;", "", "<init>", "()V", "Ljava/nio/ByteBuffer;", "input", "", "inputCapacity", "", "setInputBuffer", "(Ljava/nio/ByteBuffer;I)Z", "inputOffset", "inputLength", "write", "(Ljava/nio/ByteBuffer;II)Z", "signalEndOfStream", "()Z", "output", "outputCapacity", "setOutputBuffer", "read", "(Ljava/nio/ByteBuffer;)I", "eof", "", "frame", "flush", "(J)Z", "Lp/w2a1;", "destroy", "value", "nThis", "J", "getNThis", "()J", "src_main_java_com_spotify_boombox_audiosinkimpl-audiosinkimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeAudioSinkChainHandleImpl {
    private long nThis;

    private NativeAudioSinkChainHandleImpl() {
    }

    public final native void destroy();

    public final native boolean eof();

    public final native boolean flush(long frame);

    public final long getNThis() {
        return this.nThis;
    }

    public final native int read(ByteBuffer output);

    public final native boolean setInputBuffer(ByteBuffer input, int inputCapacity);

    public final native boolean setOutputBuffer(ByteBuffer output, int outputCapacity);

    public final native boolean signalEndOfStream();

    public final native boolean write(ByteBuffer input, int inputOffset, int inputLength);
}
