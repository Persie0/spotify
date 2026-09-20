package com.spotify.esperanto.esperantoimpl;

import com.spotify.esperanto.esperanto.CoroutineCancellable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0007\u0010\u0003R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082D¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\u0003¨\u0006\f"}, m24212d2 = {"Lcom/spotify/esperanto/esperantoimpl/NativeCoroutineCancellable;", "Lcom/spotify/esperanto/esperanto/CoroutineCancellable;", "<init>", "()V", "Lp/w2a1;", "internalCancel", "cancel", "destroy", "", "nThis", "J", "getNThis$annotations", "src_main_java_com_spotify_esperanto_esperantoimpl-esperanto_kt-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeCoroutineCancellable implements CoroutineCancellable {
    private final long nThis;

    private static /* synthetic */ void getNThis$annotations() {
    }

    private final native void internalCancel();

    @Override // com.spotify.esperanto.esperanto.CoroutineCancellable
    public void cancel() {
        internalCancel();
        destroy();
    }

    public final native void destroy();
}
