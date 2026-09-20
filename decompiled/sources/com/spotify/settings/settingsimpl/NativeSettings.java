package com.spotify.settings.settingsimpl;

import com.spotify.concurrency.async.NativeTimerManagerThread;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.core.corefull.NativeFullAuthenticatedScope;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.prefs.prefsimpl.NativePrefs;
import com.spotify.settings.settings.SettingsDelegate;
import kotlin.Metadata;
import p204p.hxi0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\t\b\u0012¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096 ¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0010\u0010\u0003R\u001c\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0003¨\u0006\u0017"}, m24212d2 = {"Lcom/spotify/settings/settingsimpl/NativeSettings;", "", "<init>", "()V", "Lp/w2a1;", "destroy", "Lcom/spotify/settings/settings/SettingsDelegate;", "delegate", "setDelegate", "(Lcom/spotify/settings/settings/SettingsDelegate;)V", "Lcom/spotify/core/corefull/NativeFullAuthenticatedScope;", "fullAuthenticatedScope", "Lcom/spotify/connectivity/auth/NativeSession;", "session", "enterAuthenticatedScope", "(Lcom/spotify/core/corefull/NativeFullAuthenticatedScope;Lcom/spotify/connectivity/auth/NativeSession;)V", "exitAuthenticatedScope", "", "nThis", "J", "getNThis$annotations", "Companion", "p/hxi0", "src_main_java_com_spotify_settings_settingsimpl-settingsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeSettings {
    public static final hxi0 Companion = new hxi0();
    private long nThis;

    private NativeSettings() {
    }

    public static final native NativeSettings create(NativeTimerManagerThread nativeTimerManagerThread, NativeRouter nativeRouter, NativePrefs nativePrefs, NativeConnectivityManager nativeConnectivityManager, String str);

    private static /* synthetic */ void getNThis$annotations() {
    }

    public final native void destroy();

    public final native void enterAuthenticatedScope(NativeFullAuthenticatedScope fullAuthenticatedScope, NativeSession session);

    public final native void exitAuthenticatedScope();

    public native void setDelegate(SettingsDelegate delegate);
}
