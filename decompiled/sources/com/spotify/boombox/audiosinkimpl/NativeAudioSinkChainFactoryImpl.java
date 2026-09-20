package com.spotify.boombox.audiosinkimpl;

import com.spotify.boombox.audiosink.NativeAudioSinkChain;
import com.spotify.boombox.audiosink.NativeAudioSinkChainFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u0011\u0010\u0003JA\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0003R$\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m24212d2 = {"Lcom/spotify/boombox/audiosinkimpl/NativeAudioSinkChainFactoryImpl;", "Lcom/spotify/boombox/audiosink/NativeAudioSinkChainFactory;", "<init>", "()V", "", "isTalk", "", "sampleRate", "channelCount", "hasLoudness", "", "loudness", "truePeak", "Lcom/spotify/boombox/audiosinkimpl/NativeAudioSinkChainHandleImpl;", "createNative", "(ZIIZFF)Lcom/spotify/boombox/audiosinkimpl/NativeAudioSinkChainHandleImpl;", "Lp/w2a1;", "destroy", "Lcom/spotify/boombox/audiosink/NativeAudioSinkChain;", "create", "(ZIIZFF)Lcom/spotify/boombox/audiosink/NativeAudioSinkChain;", "close", "", "value", "nThis", "J", "getNThis", "()J", "src_main_java_com_spotify_boombox_audiosinkimpl-audiosinkimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeAudioSinkChainFactoryImpl implements NativeAudioSinkChainFactory {
    private long nThis;

    private NativeAudioSinkChainFactoryImpl() {
    }

    private final native NativeAudioSinkChainHandleImpl createNative(boolean isTalk, int sampleRate, int channelCount, boolean hasLoudness, float loudness, float truePeak);

    private final native void destroy();

    public final synchronized void close() {
        if (this.nThis != 0) {
            destroy();
        }
    }

    @Override // com.spotify.boombox.audiosink.NativeAudioSinkChainFactory
    public synchronized NativeAudioSinkChain create(boolean isTalk, int sampleRate, int channelCount, boolean hasLoudness, float loudness, float truePeak) throws Throwable {
        NativeAudioSinkChainHandleImpl nativeAudioSinkChainHandleImplCreateNative;
        try {
            try {
                NativeAudioSinkChainImpl nativeAudioSinkChainImpl = null;
                if (this.nThis != 0 && (nativeAudioSinkChainHandleImplCreateNative = createNative(isTalk, sampleRate, channelCount, hasLoudness, loudness, truePeak)) != null) {
                    nativeAudioSinkChainImpl = new NativeAudioSinkChainImpl(nativeAudioSinkChainHandleImplCreateNative);
                }
                return nativeAudioSinkChainImpl;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final long getNThis() {
        return this.nThis;
    }
}
