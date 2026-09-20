package com.spotify.playbacknative;

import androidx.annotation.Keep;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u0000 \u00042\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m24212d2 = {"Lcom/spotify/playbacknative/AudioRenderer;", "", "<init>", "()V", "Companion", "NoopAudioRouteListenerHandler", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class AudioRenderer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicInteger audioSessionId = new AtomicInteger(0);
    private static CopyOnWriteArrayList<AudioDriverListener> audioDriverListeners = new CopyOnWriteArrayList<>();
    private static AudioRouteListenerHandler routeListenerHandler = new NoopAudioRouteListenerHandler();

    @Metadata(m24211d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001a\u0010\u001bR.\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b$\u0010\u0003\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010%\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b*\u0010\u0003\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u0016¨\u0006+"}, m24212d2 = {"Lcom/spotify/playbacknative/AudioRenderer$Companion;", "", "<init>", "()V", "", "sessionId", "()I", "Lp/w2a1;", "clearListeners", "Lcom/spotify/playbacknative/AudioDriverListener;", "listener", "addListener", "(Lcom/spotify/playbacknative/AudioDriverListener;)V", "removeListener", "Lcom/spotify/playbacknative/AudioTrackAdapter;", "audioTrackAdapter", "dispatchOnAudioTrackCreated", "(Lcom/spotify/playbacknative/AudioTrackAdapter;)V", "dispatchOnAudioTrackDestroyed", "Lcom/spotify/playbacknative/AudioRouteListenerHandler;", "listenerHandler", "setAudioRouteListenerHandler", "(Lcom/spotify/playbacknative/AudioRouteListenerHandler;)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "audioSessionId", "Ljava/util/concurrent/atomic/AtomicInteger;", "getAudioSessionId", "()Ljava/util/concurrent/atomic/AtomicInteger;", "getAudioSessionId$annotations", "Ljava/util/concurrent/CopyOnWriteArrayList;", "audioDriverListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getAudioDriverListeners", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "setAudioDriverListeners", "(Ljava/util/concurrent/CopyOnWriteArrayList;)V", "getAudioDriverListeners$annotations", "routeListenerHandler", "Lcom/spotify/playbacknative/AudioRouteListenerHandler;", "getRouteListenerHandler", "()Lcom/spotify/playbacknative/AudioRouteListenerHandler;", "setRouteListenerHandler", "getRouteListenerHandler$annotations", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getAudioDriverListeners$annotations() {
        }

        public static /* synthetic */ void getAudioSessionId$annotations() {
        }

        public static /* synthetic */ void getRouteListenerHandler$annotations() {
        }

        public final void addListener(AudioDriverListener listener) {
            getAudioDriverListeners().add(listener);
        }

        public final void clearListeners() {
            getAudioDriverListeners().clear();
        }

        public final void dispatchOnAudioTrackCreated(AudioTrackAdapter audioTrackAdapter) {
            Iterator<AudioDriverListener> it = getAudioDriverListeners().iterator();
            while (it.hasNext()) {
                it.next().onAudioTrackCreated(audioTrackAdapter);
            }
        }

        public final void dispatchOnAudioTrackDestroyed(AudioTrackAdapter audioTrackAdapter) {
            Iterator<AudioDriverListener> it = getAudioDriverListeners().iterator();
            while (it.hasNext()) {
                it.next().onAudioTrackDestroyed(audioTrackAdapter);
            }
        }

        public final CopyOnWriteArrayList<AudioDriverListener> getAudioDriverListeners() {
            return AudioRenderer.audioDriverListeners;
        }

        public final AtomicInteger getAudioSessionId() {
            return AudioRenderer.audioSessionId;
        }

        public final AudioRouteListenerHandler getRouteListenerHandler() {
            return AudioRenderer.routeListenerHandler;
        }

        public final void removeListener(AudioDriverListener listener) {
            getAudioDriverListeners().remove(listener);
        }

        public final int sessionId() {
            return getAudioSessionId().getAndIncrement();
        }

        public final void setAudioDriverListeners(CopyOnWriteArrayList<AudioDriverListener> copyOnWriteArrayList) {
            AudioRenderer.audioDriverListeners = copyOnWriteArrayList;
        }

        public final void setAudioRouteListenerHandler(AudioRouteListenerHandler listenerHandler) {
            if (listenerHandler == null) {
                setRouteListenerHandler(new NoopAudioRouteListenerHandler());
            } else {
                setRouteListenerHandler(listenerHandler);
            }
        }

        public final void setRouteListenerHandler(AudioRouteListenerHandler audioRouteListenerHandler) {
            AudioRenderer.routeListenerHandler = audioRouteListenerHandler;
        }

        private Companion() {
        }
    }

    @Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m24212d2 = {"Lcom/spotify/playbacknative/AudioRenderer$NoopAudioRouteListenerHandler;", "Lcom/spotify/playbacknative/AudioRouteListenerHandler;", "<init>", "()V", "Lcom/spotify/playbacknative/AudioTrackAdapter;", "track", "Lp/w2a1;", "attach", "(Lcom/spotify/playbacknative/AudioTrackAdapter;)V", "detach", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class NoopAudioRouteListenerHandler extends AudioRouteListenerHandler {
        @Override // com.spotify.playbacknative.AudioRouteListenerHandler
        public void attach(AudioTrackAdapter track) {
        }

        @Override // com.spotify.playbacknative.AudioRouteListenerHandler
        public void detach(AudioTrackAdapter track) {
        }
    }

    public static final void addListener(AudioDriverListener audioDriverListener) {
        INSTANCE.addListener(audioDriverListener);
    }

    public static final void clearListeners() {
        INSTANCE.clearListeners();
    }

    public static final void dispatchOnAudioTrackCreated(AudioTrackAdapter audioTrackAdapter) {
        INSTANCE.dispatchOnAudioTrackCreated(audioTrackAdapter);
    }

    public static final void dispatchOnAudioTrackDestroyed(AudioTrackAdapter audioTrackAdapter) {
        INSTANCE.dispatchOnAudioTrackDestroyed(audioTrackAdapter);
    }

    public static final CopyOnWriteArrayList<AudioDriverListener> getAudioDriverListeners() {
        return INSTANCE.getAudioDriverListeners();
    }

    public static final AtomicInteger getAudioSessionId() {
        return INSTANCE.getAudioSessionId();
    }

    public static final AudioRouteListenerHandler getRouteListenerHandler() {
        return INSTANCE.getRouteListenerHandler();
    }

    public static final void removeListener(AudioDriverListener audioDriverListener) {
        INSTANCE.removeListener(audioDriverListener);
    }

    public static final int sessionId() {
        return INSTANCE.sessionId();
    }

    public static final void setAudioDriverListeners(CopyOnWriteArrayList<AudioDriverListener> copyOnWriteArrayList) {
        INSTANCE.setAudioDriverListeners(copyOnWriteArrayList);
    }

    public static final void setAudioRouteListenerHandler(AudioRouteListenerHandler audioRouteListenerHandler) {
        INSTANCE.setAudioRouteListenerHandler(audioRouteListenerHandler);
    }

    public static final void setRouteListenerHandler(AudioRouteListenerHandler audioRouteListenerHandler) {
        INSTANCE.setRouteListenerHandler(audioRouteListenerHandler);
    }
}
