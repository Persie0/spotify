package com.spotify.playbacknative;

import android.media.AudioTrack;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.spotify.playbacknative.AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$1 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m24212d2 = {"Landroid/media/AudioTrack;", "kotlin.jvm.PlatformType", "it", "Lp/w2a1;", "onRoutingChanged", "(Landroid/media/AudioTrack;)V", "<anonymous>"}, m24213k = 3, m24214mv = {2, 3, 0})
public final class C1160xc70338eb implements AudioTrack.OnRoutingChangedListener {
    final /* synthetic */ AudioTrackAdapter.OnRoutingChangedListener $listener;
    final /* synthetic */ AudioTrackAdapterImpl this$0;

    public C1160xc70338eb(AudioTrackAdapter.OnRoutingChangedListener onRoutingChangedListener, AudioTrackAdapterImpl audioTrackAdapterImpl) {
        this.$listener = onRoutingChangedListener;
        this.this$0 = audioTrackAdapterImpl;
    }

    @Override // android.media.AudioTrack.OnRoutingChangedListener
    public final void onRoutingChanged(AudioTrack audioTrack) {
        AudioTrackAdapter.OnRoutingChangedListener onRoutingChangedListener = this.$listener;
        AudioTrackAdapterImpl audioTrackAdapterImpl = this.this$0;
        onRoutingChangedListener.onRoutingChanged(audioTrackAdapterImpl.toAudioDeviceInfoFacade(audioTrackAdapterImpl.safeRoutedDevice(audioTrack)));
    }
}
