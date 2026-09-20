package p204p;

import com.spotify.boombox.audiosink.NativeAudioSinkChain;
import com.spotify.boombox.audiosink.NativeAudioSinkChainFactory;
import com.spotify.esperanto.esperanto.Transport;

/* JADX INFO: loaded from: classes.dex */
public final class s67 implements NativeAudioSinkChainFactory {

    /* JADX INFO: renamed from: a */
    public Transport f206016a;

    /* JADX INFO: renamed from: b */
    public NativeAudioSinkChainFactory f206017b;

    @Override // com.spotify.boombox.audiosink.NativeAudioSinkChainFactory
    public final synchronized NativeAudioSinkChain create(boolean z, int i, int i2, boolean z2, float f, float f2) {
        NativeAudioSinkChainFactory nativeAudioSinkChainFactory;
        nativeAudioSinkChainFactory = this.f206017b;
        return nativeAudioSinkChainFactory != null ? nativeAudioSinkChainFactory.create(z, i, i2, z2, f, f2) : null;
    }
}
