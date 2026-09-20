package com.spotify.authentication.login5setupimpl;

import com.spotify.authentication.login5.Login5Configuration;
import com.spotify.authentication.login5setup.NativeLogin5Setup;
import com.spotify.concurrency.async.NativeTimerManagerThread;
import com.spotify.connectivity.NativeApplicationScopeAPI;
import com.spotify.esperanto.esperanto.Transport;
import kotlin.Metadata;
import p204p.swi0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/authentication/login5setupimpl/NativeLogin5SetupImpl;", "Lcom/spotify/authentication/login5setup/NativeLogin5Setup;", "<init>", "()V", "Lp/w2a1;", "destroy", "Lcom/spotify/esperanto/esperanto/Transport;", "getNativeTransport", "()Lcom/spotify/esperanto/esperanto/Transport;", "", "value", "nThis", "J", "getNThis", "()J", "Companion", "p/swi0", "src_main_java_com_spotify_authentication_login5setupimpl-login5setupimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeLogin5SetupImpl implements NativeLogin5Setup {
    public static final swi0 Companion = new swi0();
    private long nThis;

    public static final native NativeLogin5SetupImpl create(Login5Configuration login5Configuration, NativeTimerManagerThread nativeTimerManagerThread, NativeApplicationScopeAPI nativeApplicationScopeAPI);

    @Override // com.spotify.authentication.login5setup.NativeLogin5Setup
    public native void destroy();

    @Override // com.spotify.authentication.login5setup.NativeLogin5Setup
    public long getNThis() {
        return this.nThis;
    }

    public final native Transport getNativeTransport();
}
