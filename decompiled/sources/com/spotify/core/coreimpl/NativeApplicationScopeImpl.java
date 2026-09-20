package com.spotify.core.coreimpl;

import com.spotify.concurrency.async.NativeTimerManagerThread;
import com.spotify.connectivity.auth.NativeLoginController;
import com.spotify.core.core.ApplicationScope;
import com.spotify.core.core.NativeApplicationScope;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.esperanto.esperanto.Transport;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import com.spotify.fileaccess.fileio.NativeFileIO;
import com.spotify.prefs.prefsimpl.NativePrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\t\b\u0012¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096 ¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\n\u0010\u0004R$\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00118Ö\u0001X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00118Ö\u0001X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, m24212d2 = {"Lcom/spotify/core/coreimpl/NativeApplicationScopeImpl;", "Lcom/spotify/core/core/NativeApplicationScope;", "Lcom/spotify/core/core/ApplicationScope;", "<init>", "()V", "Lp/w2a1;", "destroy", "Lcom/spotify/esperanto/esperanto/Transport;", "serverTimeTransport", "()Lcom/spotify/esperanto/esperanto/Transport;", "prepareForShutdown", "", "value", "nThis", "J", "getNThis", "()J", "", "cacheId", "[B", "getCacheId", "()[B", "cacheSalt", "getCacheSalt", "Companion", "src_main_java_com_spotify_core_coreimpl-coreimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeApplicationScopeImpl implements NativeApplicationScope, ApplicationScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final byte[] cacheId;
    private final byte[] cacheSalt;
    private long nThis;

    @Metadata(m24211d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0087 J9\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0087 ¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/core/coreimpl/NativeApplicationScopeImpl$Companion;", "", "<init>", "()V", "create", "Lcom/spotify/core/coreimpl/NativeApplicationScopeImpl;", "timerManagerThread", "Lcom/spotify/concurrency/async/NativeTimerManagerThread;", "nativeRouter", "Lcom/spotify/cosmos/cosmosimpl/NativeRouter;", "prefs", "Lcom/spotify/prefs/prefsimpl/NativePrefs;", "applicationScopeConfiguration", "Lcom/spotify/core/coreimpl/ApplicationScopeConfiguration;", "loginController", "Lcom/spotify/connectivity/auth/NativeLoginController;", "eventSender", "Lcom/spotify/eventsender/api/EventSenderCoreBridge;", "fileIO", "Lcom/spotify/fileaccess/fileio/NativeFileIO;", "src_main_java_com_spotify_core_coreimpl-coreimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeApplicationScopeImpl create(NativeTimerManagerThread timerManagerThread, NativeRouter nativeRouter, NativePrefs prefs, ApplicationScopeConfiguration applicationScopeConfiguration, NativeLoginController loginController, EventSenderCoreBridge eventSender, NativeFileIO fileIO) {
            return NativeApplicationScopeImpl.create(timerManagerThread, nativeRouter, prefs, applicationScopeConfiguration, loginController, eventSender, fileIO);
        }

        private Companion() {
        }

        public final NativeApplicationScopeImpl create(NativeTimerManagerThread timerManagerThread, NativeRouter nativeRouter, NativePrefs prefs, ApplicationScopeConfiguration applicationScopeConfiguration, EventSenderCoreBridge eventSender, NativeFileIO fileIO) {
            return NativeApplicationScopeImpl.create(timerManagerThread, nativeRouter, prefs, applicationScopeConfiguration, eventSender, fileIO);
        }
    }

    private NativeApplicationScopeImpl() {
    }

    public static final native NativeApplicationScopeImpl create(NativeTimerManagerThread nativeTimerManagerThread, NativeRouter nativeRouter, NativePrefs nativePrefs, ApplicationScopeConfiguration applicationScopeConfiguration, NativeLoginController nativeLoginController, EventSenderCoreBridge eventSenderCoreBridge, NativeFileIO nativeFileIO);

    public static final native NativeApplicationScopeImpl create(NativeTimerManagerThread nativeTimerManagerThread, NativeRouter nativeRouter, NativePrefs nativePrefs, ApplicationScopeConfiguration applicationScopeConfiguration, EventSenderCoreBridge eventSenderCoreBridge, NativeFileIO nativeFileIO);

    @Override // com.spotify.core.core.NativeApplicationScope
    public native void destroy();

    @Override // com.spotify.core.core.NativeApplicationScope
    public native byte[] getCacheId();

    @Override // com.spotify.core.core.NativeApplicationScope
    public native byte[] getCacheSalt();

    @Override // com.spotify.core.core.NativeApplicationScope
    public long getNThis() {
        return this.nThis;
    }

    public final native void prepareForShutdown();

    public final native Transport serverTimeTransport();
}
