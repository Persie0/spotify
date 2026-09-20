package com.spotify.boombox.audiosinkimpl;

import com.spotify.boombox.audiosink.NativeAudioSinkChain;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, m24212d2 = {"Lcom/spotify/boombox/audiosinkimpl/NativeAudioSinkChainImpl;", "Lcom/spotify/boombox/audiosink/NativeAudioSinkChain;", "Lcom/spotify/boombox/audiosinkimpl/NativeAudioSinkChainHandleImpl;", "handle", "<init>", "(Lcom/spotify/boombox/audiosinkimpl/NativeAudioSinkChainHandleImpl;)V", "Ljava/nio/ByteBuffer;", "input", "", "inputOffset", "inputLength", "", "write", "(Ljava/nio/ByteBuffer;II)Z", "signalEndOfStream", "()Z", "output", "read", "(Ljava/nio/ByteBuffer;)I", "eof", "", "frame", "flush", "(J)Z", "Lp/w2a1;", "destroy", "()V", "Lcom/spotify/boombox/audiosinkimpl/NativeAudioSinkChainHandleImpl;", "inputBuffer", "Ljava/nio/ByteBuffer;", "outputBuffer", "src_main_java_com_spotify_boombox_audiosinkimpl-audiosinkimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeAudioSinkChainImpl implements NativeAudioSinkChain {
    private final NativeAudioSinkChainHandleImpl handle;
    private ByteBuffer inputBuffer;
    private ByteBuffer outputBuffer;

    public NativeAudioSinkChainImpl(NativeAudioSinkChainHandleImpl nativeAudioSinkChainHandleImpl) {
        this.handle = nativeAudioSinkChainHandleImpl;
    }

    @Override // com.spotify.boombox.audiosink.NativeAudioSinkChain
    public void destroy() {
        if (this.handle.getNThis() != 0) {
            this.handle.destroy();
        }
        this.inputBuffer = null;
        this.outputBuffer = null;
    }

    @Override // com.spotify.boombox.audiosink.NativeAudioSinkChain
    public boolean eof() {
        return this.handle.getNThis() != 0 && this.handle.eof();
    }

    @Override // com.spotify.boombox.audiosink.NativeAudioSinkChain
    public boolean flush(long frame) {
        return this.handle.getNThis() != 0 && this.handle.flush(frame);
    }

    @Override // com.spotify.boombox.audiosink.NativeAudioSinkChain
    public int read(ByteBuffer output) {
        if (this.handle.getNThis() == 0) {
            return 0;
        }
        if (output != this.outputBuffer) {
            if (!this.handle.setOutputBuffer(output, output.capacity())) {
                return 0;
            }
            this.outputBuffer = output;
        }
        return this.handle.read(output);
    }

    @Override // com.spotify.boombox.audiosink.NativeAudioSinkChain
    public boolean signalEndOfStream() {
        return this.handle.getNThis() != 0 && this.handle.signalEndOfStream();
    }

    @Override // com.spotify.boombox.audiosink.NativeAudioSinkChain
    public boolean write(ByteBuffer input, int inputOffset, int inputLength) {
        if (this.handle.getNThis() == 0) {
            return false;
        }
        if (input != this.inputBuffer) {
            if (!this.handle.setInputBuffer(input, input.capacity())) {
                return false;
            }
            this.inputBuffer = input;
        }
        return this.handle.write(input, inputOffset, inputLength);
    }
}
