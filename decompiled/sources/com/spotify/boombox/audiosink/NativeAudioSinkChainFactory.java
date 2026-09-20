package com.spotify.boombox.audiosink;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/boombox/audiosink/NativeAudioSinkChainFactory;", "", "create", "Lcom/spotify/boombox/audiosink/NativeAudioSinkChain;", "isTalk", "", "sampleRate", "", "channelCount", "hasLoudness", "loudness", "", "truePeak", "src_main_java_com_spotify_boombox_audiosink-audiosink"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface NativeAudioSinkChainFactory {
    NativeAudioSinkChain create(boolean isTalk, int sampleRate, int channelCount, boolean hasLoudness, float loudness, float truePeak);
}
