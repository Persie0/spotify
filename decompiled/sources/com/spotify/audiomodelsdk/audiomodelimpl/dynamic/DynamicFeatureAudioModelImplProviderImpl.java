package com.spotify.audiomodelsdk.audiomodelimpl.dynamic;

import kotlin.Metadata;
import p204p.rz6;
import p204p.sz6;
import p204p.wlm;
import p204p.yt6;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m24212d2 = {"Lcom/spotify/audiomodelsdk/audiomodelimpl/dynamic/DynamicFeatureAudioModelImplProviderImpl;", "", "<init>", "()V", "Lp/rz6;", "audioModelFactory", "()Lp/rz6;", "Lp/yt6;", "audioBufferFactory", "()Lp/yt6;", "Lp/sz6;", "audioModelComponent", "Lp/sz6;", "src_main_java_com_spotify_audiomodelsdk_audiomodelimpl_dynamic-dynamic"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class DynamicFeatureAudioModelImplProviderImpl {
    private final sz6 audioModelComponent = new wlm();

    public yt6 audioBufferFactory() {
        return (yt6) ((wlm) this.audioModelComponent).f252581b.get();
    }

    public rz6 audioModelFactory() {
        return (rz6) ((wlm) this.audioModelComponent).f252580a.get();
    }
}
