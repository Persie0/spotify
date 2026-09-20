package com.spotify.core.corefullimpl;

import com.spotify.appstorage.userdirectory.NativeUserDirectoryManager;
import com.spotify.authentication.tokenexchangesetup.NativeTokenExchangeSetup;
import com.spotify.boombox.audiosink.NativeAudioSinkChainFactory;
import com.spotify.concurrency.async.NativeTimerManagerThread;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.NativeAuthenticatedScope;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessorFactory;
import com.spotify.core.corefull.FullAuthenticatedScope;
import com.spotify.core.corefull.NativeFullAuthenticatedScope;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.esperanto.esperanto.Transport;
import com.spotify.fileaccess.fileio.NativeFileIO;
import com.spotify.localfiles.localfilesimpl.NativeLocalFilesDelegate;
import com.spotify.native_crypto.NativeCryptoProvider;
import com.spotify.offline.NativeForegroundProvider;
import com.spotify.offline.NativeOfflinePluginRegistry;
import com.spotify.prefs.prefsimpl.NativePrefs;
import com.spotify.remoteconfig.NativeRemoteConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.nwi0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\t\b\u0012¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096 ¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H\u0096 ¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b\u000b\u0010\tJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fH\u0086 ¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u0005H\u0086 ¢\u0006\u0004\b\u0010\u0010\u0004J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096 ¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/core/corefullimpl/NativeFullAuthenticatedScopeImpl;", "Lcom/spotify/core/corefull/NativeFullAuthenticatedScope;", "Lcom/spotify/core/corefull/FullAuthenticatedScope;", "<init>", "()V", "Lp/w2a1;", "destroy", "Lcom/spotify/esperanto/esperanto/Transport;", "contentDeliveryIOTransport", "()Lcom/spotify/esperanto/esperanto/Transport;", "tokenExchangeTransport", "audioSinkChainWrapperEsperantoTransport", "Lcom/spotify/boombox/audiosink/NativeAudioSinkChainFactory;", "audioSinkChainFactory", "()Lcom/spotify/boombox/audiosink/NativeAudioSinkChainFactory;", "prepareForShutdown", "flushCaches", "Lcom/spotify/contentdelivery/mediaprocessing/NativeMediaProcessorFactory;", "mediaProcessorFactory", "()Lcom/spotify/contentdelivery/mediaprocessing/NativeMediaProcessorFactory;", "", "value", "nThis", "J", "getNThis", "()J", "Companion", "src_main_java_com_spotify_core_corefullimpl-corefullimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class NativeFullAuthenticatedScopeImpl implements NativeFullAuthenticatedScope, FullAuthenticatedScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private long nThis;

    @Metadata(m24211d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¿\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*H\u0087 JÇ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*H\u0087 ¨\u0006-"}, m24212d2 = {"Lcom/spotify/core/corefullimpl/NativeFullAuthenticatedScopeImpl$Companion;", "", "<init>", "()V", "create", "Lcom/spotify/core/corefullimpl/NativeFullAuthenticatedScopeImpl;", "coreThread", "Lcom/spotify/concurrency/async/NativeTimerManagerThread;", "router", "Lcom/spotify/cosmos/cosmosimpl/NativeRouter;", "prefs", "Lcom/spotify/prefs/prefsimpl/NativePrefs;", "remoteConfig", "Lcom/spotify/remoteconfig/NativeRemoteConfig;", "connectivityManager", "Lcom/spotify/connectivity/connectivitysdkpolicyimpl/NativeConnectivityManager;", "connectivityApplicationScope", "Lcom/spotify/connectivity/NativeApplicationScope;", "session", "Lcom/spotify/connectivity/auth/NativeSession;", "connectivityNativeAuthenticatedScope", "Lcom/spotify/connectivity/NativeAuthenticatedScope;", "coreApplicationScope", "Lcom/spotify/core/core/NativeApplicationScope;", "coreLocalFilesDelegate", "Lcom/spotify/localfiles/localfilesimpl/NativeLocalFilesDelegate;", "userDirectoryManager", "Lcom/spotify/appstorage/userdirectory/NativeUserDirectoryManager;", "fullAuthenticatedScopeConfiguration", "Lcom/spotify/core/corefullimpl/FullAuthenticatedScopeConfiguration;", "offlinePluginRegistry", "Lcom/spotify/offline/NativeOfflinePluginRegistry;", "offlineForegroundProvider", "Lcom/spotify/offline/NativeForegroundProvider;", "fileIO", "Lcom/spotify/fileaccess/fileio/NativeFileIO;", "headphoneServiceTransport", "Lcom/spotify/esperanto/esperanto/Transport;", "deviceLocationServiceTransport", "lgWebsocketTransport", "lgWebsocketPreCheckTransport", "atvCryptoProvider", "Lcom/spotify/native_crypto/NativeCryptoProvider;", "tokenExchangeSetup", "Lcom/spotify/authentication/tokenexchangesetup/NativeTokenExchangeSetup;", "src_main_java_com_spotify_core_corefullimpl-corefullimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ NativeFullAuthenticatedScopeImpl create$default(Companion companion, NativeTimerManagerThread nativeTimerManagerThread, NativeRouter nativeRouter, NativePrefs nativePrefs, NativeRemoteConfig nativeRemoteConfig, NativeConnectivityManager nativeConnectivityManager, NativeApplicationScope nativeApplicationScope, NativeSession nativeSession, NativeAuthenticatedScope nativeAuthenticatedScope, com.spotify.core.core.NativeApplicationScope nativeApplicationScope2, NativeLocalFilesDelegate nativeLocalFilesDelegate, NativeUserDirectoryManager nativeUserDirectoryManager, FullAuthenticatedScopeConfiguration fullAuthenticatedScopeConfiguration, NativeOfflinePluginRegistry nativeOfflinePluginRegistry, NativeForegroundProvider nativeForegroundProvider, NativeFileIO nativeFileIO, Transport transport, Transport transport2, Transport transport3, Transport transport4, NativeCryptoProvider nativeCryptoProvider, int i, Object obj) {
            NativeCryptoProvider nativeCryptoProviderM65795c;
            Transport transport5 = (i & 32768) != 0 ? null : transport;
            Transport transport6 = (i & 65536) != 0 ? null : transport2;
            Transport transport7 = (i & 131072) != 0 ? null : transport3;
            Transport transport8 = (i & 262144) != 0 ? null : transport4;
            if ((i & 524288) != 0) {
                NativeCryptoProvider.Companion.getClass();
                nativeCryptoProviderM65795c = nwi0.m65795c();
            } else {
                nativeCryptoProviderM65795c = nativeCryptoProvider;
            }
            return companion.create(nativeTimerManagerThread, nativeRouter, nativePrefs, nativeRemoteConfig, nativeConnectivityManager, nativeApplicationScope, nativeSession, nativeAuthenticatedScope, nativeApplicationScope2, nativeLocalFilesDelegate, nativeUserDirectoryManager, fullAuthenticatedScopeConfiguration, nativeOfflinePluginRegistry, nativeForegroundProvider, nativeFileIO, transport5, transport6, transport7, transport8, nativeCryptoProviderM65795c);
        }

        public final NativeFullAuthenticatedScopeImpl create(NativeTimerManagerThread coreThread, NativeRouter router, NativePrefs prefs, NativeRemoteConfig remoteConfig, NativeConnectivityManager connectivityManager, NativeApplicationScope connectivityApplicationScope, NativeSession session, NativeAuthenticatedScope connectivityNativeAuthenticatedScope, NativeTokenExchangeSetup tokenExchangeSetup, com.spotify.core.core.NativeApplicationScope coreApplicationScope, NativeLocalFilesDelegate coreLocalFilesDelegate, NativeUserDirectoryManager userDirectoryManager, FullAuthenticatedScopeConfiguration fullAuthenticatedScopeConfiguration, NativeOfflinePluginRegistry offlinePluginRegistry, NativeForegroundProvider offlineForegroundProvider, NativeFileIO fileIO, Transport headphoneServiceTransport, Transport deviceLocationServiceTransport, Transport lgWebsocketTransport, Transport lgWebsocketPreCheckTransport, NativeCryptoProvider atvCryptoProvider) {
            return NativeFullAuthenticatedScopeImpl.create(coreThread, router, prefs, remoteConfig, connectivityManager, connectivityApplicationScope, session, connectivityNativeAuthenticatedScope, tokenExchangeSetup, coreApplicationScope, coreLocalFilesDelegate, userDirectoryManager, fullAuthenticatedScopeConfiguration, offlinePluginRegistry, offlineForegroundProvider, fileIO, headphoneServiceTransport, deviceLocationServiceTransport, lgWebsocketTransport, lgWebsocketPreCheckTransport, atvCryptoProvider);
        }

        private Companion() {
        }

        public final NativeFullAuthenticatedScopeImpl create(NativeTimerManagerThread coreThread, NativeRouter router, NativePrefs prefs, NativeRemoteConfig remoteConfig, NativeConnectivityManager connectivityManager, NativeApplicationScope connectivityApplicationScope, NativeSession session, NativeAuthenticatedScope connectivityNativeAuthenticatedScope, com.spotify.core.core.NativeApplicationScope coreApplicationScope, NativeLocalFilesDelegate coreLocalFilesDelegate, NativeUserDirectoryManager userDirectoryManager, FullAuthenticatedScopeConfiguration fullAuthenticatedScopeConfiguration, NativeOfflinePluginRegistry offlinePluginRegistry, NativeForegroundProvider offlineForegroundProvider, NativeFileIO fileIO, Transport headphoneServiceTransport, Transport deviceLocationServiceTransport, Transport lgWebsocketTransport, Transport lgWebsocketPreCheckTransport, NativeCryptoProvider atvCryptoProvider) {
            return NativeFullAuthenticatedScopeImpl.create(coreThread, router, prefs, remoteConfig, connectivityManager, connectivityApplicationScope, session, connectivityNativeAuthenticatedScope, coreApplicationScope, coreLocalFilesDelegate, userDirectoryManager, fullAuthenticatedScopeConfiguration, offlinePluginRegistry, offlineForegroundProvider, fileIO, headphoneServiceTransport, deviceLocationServiceTransport, lgWebsocketTransport, lgWebsocketPreCheckTransport, atvCryptoProvider);
        }

        public static /* synthetic */ NativeFullAuthenticatedScopeImpl create$default(Companion companion, NativeTimerManagerThread nativeTimerManagerThread, NativeRouter nativeRouter, NativePrefs nativePrefs, NativeRemoteConfig nativeRemoteConfig, NativeConnectivityManager nativeConnectivityManager, NativeApplicationScope nativeApplicationScope, NativeSession nativeSession, NativeAuthenticatedScope nativeAuthenticatedScope, NativeTokenExchangeSetup nativeTokenExchangeSetup, com.spotify.core.core.NativeApplicationScope nativeApplicationScope2, NativeLocalFilesDelegate nativeLocalFilesDelegate, NativeUserDirectoryManager nativeUserDirectoryManager, FullAuthenticatedScopeConfiguration fullAuthenticatedScopeConfiguration, NativeOfflinePluginRegistry nativeOfflinePluginRegistry, NativeForegroundProvider nativeForegroundProvider, NativeFileIO nativeFileIO, Transport transport, Transport transport2, Transport transport3, Transport transport4, NativeCryptoProvider nativeCryptoProvider, int i, Object obj) {
            NativeCryptoProvider nativeCryptoProviderM65795c;
            Transport transport5 = (i & 65536) != 0 ? null : transport;
            Transport transport6 = (i & 131072) != 0 ? null : transport2;
            Transport transport7 = (i & 262144) != 0 ? null : transport3;
            Transport transport8 = (i & 524288) != 0 ? null : transport4;
            if ((i & 1048576) != 0) {
                NativeCryptoProvider.Companion.getClass();
                nativeCryptoProviderM65795c = nwi0.m65795c();
            } else {
                nativeCryptoProviderM65795c = nativeCryptoProvider;
            }
            return companion.create(nativeTimerManagerThread, nativeRouter, nativePrefs, nativeRemoteConfig, nativeConnectivityManager, nativeApplicationScope, nativeSession, nativeAuthenticatedScope, nativeTokenExchangeSetup, nativeApplicationScope2, nativeLocalFilesDelegate, nativeUserDirectoryManager, fullAuthenticatedScopeConfiguration, nativeOfflinePluginRegistry, nativeForegroundProvider, nativeFileIO, transport5, transport6, transport7, transport8, nativeCryptoProviderM65795c);
        }
    }

    private NativeFullAuthenticatedScopeImpl() {
    }

    public static final native NativeFullAuthenticatedScopeImpl create(NativeTimerManagerThread nativeTimerManagerThread, NativeRouter nativeRouter, NativePrefs nativePrefs, NativeRemoteConfig nativeRemoteConfig, NativeConnectivityManager nativeConnectivityManager, NativeApplicationScope nativeApplicationScope, NativeSession nativeSession, NativeAuthenticatedScope nativeAuthenticatedScope, NativeTokenExchangeSetup nativeTokenExchangeSetup, com.spotify.core.core.NativeApplicationScope nativeApplicationScope2, NativeLocalFilesDelegate nativeLocalFilesDelegate, NativeUserDirectoryManager nativeUserDirectoryManager, FullAuthenticatedScopeConfiguration fullAuthenticatedScopeConfiguration, NativeOfflinePluginRegistry nativeOfflinePluginRegistry, NativeForegroundProvider nativeForegroundProvider, NativeFileIO nativeFileIO, Transport transport, Transport transport2, Transport transport3, Transport transport4, NativeCryptoProvider nativeCryptoProvider);

    public static final native NativeFullAuthenticatedScopeImpl create(NativeTimerManagerThread nativeTimerManagerThread, NativeRouter nativeRouter, NativePrefs nativePrefs, NativeRemoteConfig nativeRemoteConfig, NativeConnectivityManager nativeConnectivityManager, NativeApplicationScope nativeApplicationScope, NativeSession nativeSession, NativeAuthenticatedScope nativeAuthenticatedScope, com.spotify.core.core.NativeApplicationScope nativeApplicationScope2, NativeLocalFilesDelegate nativeLocalFilesDelegate, NativeUserDirectoryManager nativeUserDirectoryManager, FullAuthenticatedScopeConfiguration fullAuthenticatedScopeConfiguration, NativeOfflinePluginRegistry nativeOfflinePluginRegistry, NativeForegroundProvider nativeForegroundProvider, NativeFileIO nativeFileIO, Transport transport, Transport transport2, Transport transport3, Transport transport4, NativeCryptoProvider nativeCryptoProvider);

    public final native NativeAudioSinkChainFactory audioSinkChainFactory();

    public final native Transport audioSinkChainWrapperEsperantoTransport();

    @Override // com.spotify.core.corefull.FullAuthenticatedScope
    public native Transport contentDeliveryIOTransport();

    @Override // com.spotify.core.corefull.NativeFullAuthenticatedScope
    public native void destroy();

    public final native void flushCaches();

    @Override // com.spotify.core.corefull.NativeFullAuthenticatedScope
    public long getNThis() {
        return this.nThis;
    }

    @Override // com.spotify.core.corefull.FullAuthenticatedScope
    public native NativeMediaProcessorFactory mediaProcessorFactory();

    public final native void prepareForShutdown();

    @Override // com.spotify.core.corefull.FullAuthenticatedScope
    public native Transport tokenExchangeTransport();
}
