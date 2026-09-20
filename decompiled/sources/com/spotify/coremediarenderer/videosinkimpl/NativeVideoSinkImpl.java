package com.spotify.coremediarenderer.videosinkimpl;

import android.view.Surface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m24212d2 = {"Lcom/spotify/coremediarenderer/videosinkimpl/NativeVideoSinkImpl;", "", "<init>", "()V", "Lp/w2a1;", "destroy", "", "value", "nThis", "J", "getNThis", "()J", "src_main_java_com_spotify_coremediarenderer_videosinkimpl-videosinkimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeVideoSinkImpl {
    private long nThis;

    private NativeVideoSinkImpl() {
    }

    public static final native NativeVideoSinkImpl create(Surface surface);

    public static final native void nativeSetPlaybackRegistrationListener(PlaybackRegistrationListener playbackRegistrationListener);

    public static final native void nativeSetRenderTarget(String str, String str2, String str3, String str4, String str5, Surface surface);

    public final native void destroy();

    public final long getNThis() {
        return this.nThis;
    }
}
