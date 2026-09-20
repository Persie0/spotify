package com.spotify.esperanto.esperantoimpl;

import com.spotify.esperanto.esperanto.CoroutineCancellable;
import kotlin.Metadata;
import p204p.sir0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u000e"}, m24212d2 = {"com/spotify/esperanto/esperantoimpl/NativeCoroutineTransport$callStream$1$callback$1", "Lcom/spotify/esperanto/esperantoimpl/StreamCallback;", "", "chunk", "Lp/w2a1;", "send", "([B)V", "Lcom/spotify/esperanto/esperanto/CoroutineCancellable;", "cancellable", "setCancellable", "(Lcom/spotify/esperanto/esperanto/CoroutineCancellable;)V", "cancel", "()V", "Lcom/spotify/esperanto/esperanto/CoroutineCancellable;", "src_main_java_com_spotify_esperanto_esperantoimpl-esperanto_kt-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeCoroutineTransport$callStream$1$callback$1 implements StreamCallback {
    final /* synthetic */ sir0 $$this$callbackFlow;
    private CoroutineCancellable cancellable;

    public NativeCoroutineTransport$callStream$1$callback$1(sir0 sir0Var) {
        this.$$this$callbackFlow = sir0Var;
    }

    @Override // com.spotify.esperanto.esperantoimpl.StreamCallback
    public void cancel() {
        CoroutineCancellable coroutineCancellable = this.cancellable;
        if (coroutineCancellable != null) {
            coroutineCancellable.cancel();
        }
        this.cancellable = null;
    }

    @Override // com.spotify.esperanto.esperantoimpl.StreamCallback
    public void send(byte[] chunk) {
        this.$$this$callbackFlow.mo30231j(chunk);
    }

    @Override // com.spotify.esperanto.esperantoimpl.StreamCallback
    public void setCancellable(CoroutineCancellable cancellable) {
        this.cancellable = cancellable;
    }
}
