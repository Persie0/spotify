package com.spotify.connectivity;

import com.spotify.authentication.accountssetup.NativeAccountsSetup;
import com.spotify.authentication.login5setup.NativeLogin5Setup;
import com.spotify.concurrency.async.NativeTimerManagerThread;
import com.spotify.connectivity.auth.NativeLoginController;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import kotlin.Metadata;
import p204p.twi0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0003R\u001c\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\u0003¨\u0006\f"}, m24212d2 = {"Lcom/spotify/connectivity/NativeLoginControllerFactory;", "", "<init>", "()V", "Lp/w2a1;", "destroy", "", "nThis", "J", "getNThis$annotations", "Companion", "p/twi0", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeLoginControllerFactory {
    public static final twi0 Companion = new twi0();
    private long nThis;

    private NativeLoginControllerFactory() {
    }

    public static final native NativeLoginController create(NativeApplicationScope nativeApplicationScope, NativeTimerManagerThread nativeTimerManagerThread, NativeRouter nativeRouter, NativeLogin5Setup nativeLogin5Setup, NativeAccountsSetup nativeAccountsSetup, Object obj);

    public static final native NativeLoginController create(NativeApplicationScope nativeApplicationScope, NativeTimerManagerThread nativeTimerManagerThread, NativeRouter nativeRouter, NativeLogin5Setup nativeLogin5Setup, Object obj);

    public static final native NativeLoginController create(NativeApplicationScope nativeApplicationScope, NativeTimerManagerThread nativeTimerManagerThread, NativeRouter nativeRouter, Object obj);

    private final native void destroy();

    private static /* synthetic */ void getNThis$annotations() {
    }
}
