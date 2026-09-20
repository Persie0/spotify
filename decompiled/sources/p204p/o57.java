package p204p;

import android.os.Handler;
import com.spotify.playbacknative.AudioDeviceInfoFacade;
import com.spotify.playbacknative.AudioRouteListenerHandler;
import com.spotify.playbacknative.AudioTrackAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class o57 extends AudioRouteListenerHandler {

    /* JADX INFO: renamed from: a */
    public final Handler f161900a;

    /* JADX INFO: renamed from: b */
    public n57 f161901b = new m57(0);

    /* JADX INFO: renamed from: c */
    public l57 f161902c;

    public o57(Handler handler) {
        this.f161900a = handler;
    }

    @Override // com.spotify.playbacknative.AudioRouteListenerHandler
    public final void attach(AudioTrackAdapter audioTrackAdapter) {
        l57 l57Var = this.f161902c;
        if (l57Var == null) {
            na6.m63957e("Audio track created without AudioRouteChangeDispatcher having started. Events will be lost.");
            return;
        }
        audioTrackAdapter.addOnRoutingChangedListener(l57Var, this.f161900a);
        AudioDeviceInfoFacade routedDevice = audioTrackAdapter.getRoutedDevice();
        if (routedDevice != null) {
            this.f161901b.mo55422a(routedDevice.getDeviceId(), routedDevice.getProductName(), routedDevice.getAudioDeviceInfoType(), routedDevice.getAddress());
        }
    }

    @Override // com.spotify.playbacknative.AudioRouteListenerHandler
    public final void detach(AudioTrackAdapter audioTrackAdapter) {
        l57 l57Var = this.f161902c;
        if (l57Var != null) {
            audioTrackAdapter.removeOnRoutingChangedListener(l57Var);
        }
    }
}
