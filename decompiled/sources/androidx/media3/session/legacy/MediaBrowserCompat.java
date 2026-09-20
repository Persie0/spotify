package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p204p.dq60;
import p204p.edb;
import p204p.h0b1;
import p204p.klh;
import p204p.uj5;
import p204p.yif1;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaBrowserCompat {
    public static final String CUSTOM_ACTION_DOWNLOAD = "android.support.v4.media.action.DOWNLOAD";
    public static final String CUSTOM_ACTION_REMOVE_DOWNLOADED_FILE = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";
    public static final String EXTRA_DOWNLOAD_PROGRESS = "android.media.browse.extra.DOWNLOAD_PROGRESS";

    @SuppressLint({"InlinedApi"})
    public static final String EXTRA_PAGE = "android.media.browse.extra.PAGE";

    @SuppressLint({"InlinedApi"})
    public static final String EXTRA_PAGE_SIZE = "android.media.browse.extra.PAGE_SIZE";
    static final String TAG = "MediaBrowserCompat";
    private final MediaBrowserImpl impl;

    public static class CallbackHandler extends Handler {
        private final WeakReference<MediaBrowserServiceCallbackImpl> callbackImplRef;
        private WeakReference<Messenger> callbacksMessengerRef;

        public CallbackHandler(MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl) {
            this.callbackImplRef = new WeakReference<>(mediaBrowserServiceCallbackImpl);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.callbacksMessengerRef;
            if (weakReference == null) {
                return;
            }
            Messenger messenger = weakReference.get();
            MediaBrowserServiceCallbackImpl mediaBrowserServiceCallbackImpl = this.callbackImplRef.get();
            if (messenger == null || mediaBrowserServiceCallbackImpl == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.ensureClassLoader(data);
            try {
                if (message.what == 3) {
                    mediaBrowserServiceCallbackImpl.onLoadChildren(messenger, data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), LegacyParcelableUtil.convertList(data.getParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST), MediaItem.CREATOR), h0b1.m46328p(data.getBundle(MediaBrowserProtocol.DATA_OPTIONS)), h0b1.m46328p(data.getBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS)));
                } else {
                    yif1.m93819w0("Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                }
            } catch (BadParcelableException unused) {
                yif1.m93808r("Could not unparcel the data.");
            }
        }

        public void setCallbacksMessenger(Messenger messenger) {
            this.callbacksMessengerRef = new WeakReference<>(messenger);
        }
    }

    public static class ConnectionCallback {
        final MediaBrowser.ConnectionCallback connectionCallbackFwk = new ConnectionCallbackImpl();
        ConnectionCallbackInternal connectionCallbackInternal;

        public class ConnectionCallbackImpl extends MediaBrowser.ConnectionCallback {
            public ConnectionCallbackImpl() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.connectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnected();
                }
                ConnectionCallback.this.onConnected();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.connectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionFailed();
                }
                ConnectionCallback.this.onConnectionFailed();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                ConnectionCallbackInternal connectionCallbackInternal = ConnectionCallback.this.connectionCallbackInternal;
                if (connectionCallbackInternal != null) {
                    connectionCallbackInternal.onConnectionSuspended();
                }
                ConnectionCallback.this.onConnectionSuspended();
            }
        }

        public interface ConnectionCallbackInternal {
            void onConnected();

            void onConnectionFailed();

            void onConnectionSuspended();
        }

        public void onConnected() {
        }

        public void onConnectionFailed() {
        }

        public void onConnectionSuspended() {
        }

        public void setInternalConnectionCallback(ConnectionCallbackInternal connectionCallbackInternal) {
            this.connectionCallbackInternal = connectionCallbackInternal;
        }
    }

    public static abstract class CustomActionCallback {
        public void onError(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onProgressUpdate(String str, Bundle bundle, Bundle bundle2) {
        }

        public void onResult(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    @SuppressLint({"RestrictedApi"})
    public static class CustomActionResultReceiver extends ResultReceiver {
        private final String action;
        private final CustomActionCallback callback;
        private final Bundle extras;

        public CustomActionResultReceiver(String str, Bundle bundle, CustomActionCallback customActionCallback, Handler handler) {
            super(handler);
            this.action = str;
            this.extras = bundle;
            this.callback = customActionCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            if (this.callback == null) {
                return;
            }
            Bundle bundleM46328p = h0b1.m46328p(bundle);
            if (i == -1) {
                this.callback.onError(this.action, this.extras, bundleM46328p);
                return;
            }
            if (i == 0) {
                this.callback.onResult(this.action, this.extras, bundleM46328p);
                return;
            }
            if (i != 1) {
                StringBuilder sbM56838j = klh.m56838j(i, "Unknown result code: ", " (extras=");
                sbM56838j.append(this.extras);
                sbM56838j.append(", resultData=");
                sbM56838j.append(bundleM46328p);
                sbM56838j.append(")");
                yif1.m93819w0(sbM56838j.toString());
                return;
            }
            CustomActionCallback customActionCallback = this.callback;
            String str = this.action;
            Bundle bundle2 = this.extras;
            if (bundle2 == null) {
                bundle2 = Bundle.EMPTY;
            }
            if (bundleM46328p == null) {
                bundleM46328p = Bundle.EMPTY;
            }
            customActionCallback.onProgressUpdate(str, bundle2, bundleM46328p);
        }
    }

    public static abstract class ItemCallback {
        final MediaBrowser.ItemCallback itemCallbackFwk = new ItemCallbackImpl();

        public class ItemCallbackImpl extends MediaBrowser.ItemCallback {
            public ItemCallbackImpl() {
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onError(String str) {
                ItemCallback.this.onError(str);
            }

            @Override // android.media.browse.MediaBrowser.ItemCallback
            public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
                ItemCallback.this.onItemLoaded(MediaItem.fromMediaItem(mediaItem));
            }
        }

        public void onError(String str) {
        }

        public void onItemLoaded(MediaItem mediaItem) {
        }
    }

    @SuppressLint({"RestrictedApi"})
    public static class ItemReceiver extends ResultReceiver {
        private final ItemCallback callback;
        private final String mediaId;

        public ItemReceiver(String str, ItemCallback itemCallback, Handler handler) {
            super(handler);
            this.mediaId = str;
            this.callback = itemCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            Bundle bundleM46328p = h0b1.m46328p(bundle);
            if (i != 0 || bundleM46328p == null) {
                this.callback.onError(this.mediaId);
                return;
            }
            try {
                if (!bundleM46328p.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                    this.callback.onError(this.mediaId);
                } else {
                    this.callback.onItemLoaded((MediaItem) LegacyParcelableUtil.convert(bundleM46328p.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM), MediaItem.CREATOR));
                }
            } catch (RuntimeException e) {
                yif1.m93821x0("Failed to retrieve media item from parcelable", e);
                this.callback.onError(this.mediaId);
            }
        }
    }

    public interface MediaBrowserImpl {
        void connect();

        void disconnect();

        Bundle getExtras();

        void getItem(String str, ItemCallback itemCallback);

        Bundle getNotifyChildrenChangedOptions();

        String getRoot();

        MediaSessionCompat.Token getSessionToken();

        boolean isConnected();

        void search(String str, Bundle bundle, SearchCallback searchCallback);

        void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback);

        void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback);

        void unsubscribe(String str, SubscriptionCallback subscriptionCallback);
    }

    public static class MediaBrowserImplApi23 implements MediaBrowserImpl, MediaBrowserServiceCallbackImpl, ConnectionCallback.ConnectionCallbackInternal {
        protected final MediaBrowser browserFwk;
        protected Messenger callbacksMessenger;
        final Context context;
        private MediaSessionCompat.Token mediaSessionToken;
        private Bundle notifyChildrenChangedOptions;
        protected final Bundle rootHints;
        protected ServiceBinderWrapper serviceBinderWrapper;
        protected int serviceVersion;
        protected final CallbackHandler handler = new CallbackHandler(this);
        private final uj5 subscriptions = new uj5(0);

        public MediaBrowserImplApi23(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            this.context = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.rootHints = bundle2;
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
            bundle2.putInt(MediaBrowserProtocol.EXTRA_CALLING_PID, Process.myPid());
            connectionCallback.setInternalConnectionCallback(this);
            MediaBrowser.ConnectionCallback connectionCallback2 = connectionCallback.connectionCallbackFwk;
            connectionCallback2.getClass();
            this.browserFwk = new MediaBrowser(context, componentName, connectionCallback2, bundle2);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void connect() {
            this.browserFwk.connect();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void disconnect() {
            Messenger messenger;
            ServiceBinderWrapper serviceBinderWrapper = this.serviceBinderWrapper;
            if (serviceBinderWrapper != null && (messenger = this.callbacksMessenger) != null) {
                try {
                    serviceBinderWrapper.unregisterCallbackMessenger(messenger);
                } catch (RemoteException unused) {
                    yif1.m93818w("Remote error unregistering client messenger.");
                }
            }
            this.browserFwk.disconnect();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getExtras() {
            return h0b1.m46328p(this.browserFwk.getExtras());
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void getItem(final String str, final ItemCallback itemCallback) {
            if (this.serviceBinderWrapper == null) {
                this.browserFwk.getItem(str, itemCallback.itemCallbackFwk);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            }
            if (!this.browserFwk.isConnected()) {
                yif1.m93818w("Not connected, unable to retrieve the MediaItem.");
                this.handler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.1
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
                return;
            }
            if (this.serviceBinderWrapper == null) {
                this.handler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.2
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
                return;
            }
            ItemReceiver itemReceiver = new ItemReceiver(str, itemCallback, this.handler);
            try {
                ServiceBinderWrapper serviceBinderWrapper = this.serviceBinderWrapper;
                Messenger messenger = this.callbacksMessenger;
                messenger.getClass();
                serviceBinderWrapper.getMediaItem(str, itemReceiver, messenger);
            } catch (RemoteException unused) {
                yif1.m93818w("Remote error getting media item: " + str);
                this.handler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.3
                    @Override // java.lang.Runnable
                    public void run() {
                        itemCallback.onError(str);
                    }
                });
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public Bundle getNotifyChildrenChangedOptions() {
            return this.notifyChildrenChangedOptions;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public String getRoot() {
            return this.browserFwk.getRoot();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public MediaSessionCompat.Token getSessionToken() {
            if (this.mediaSessionToken == null) {
                this.mediaSessionToken = MediaSessionCompat.Token.fromToken(this.browserFwk.getSessionToken());
            }
            return this.mediaSessionToken;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public boolean isConnected() {
            return this.browserFwk.isConnected();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnected() {
            try {
                Bundle bundleM46328p = h0b1.m46328p(this.browserFwk.getExtras());
                if (bundleM46328p == null) {
                    return;
                }
                this.serviceVersion = bundleM46328p.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
                IBinder binder = bundleM46328p.getBinder(MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                if (binder != null) {
                    ServiceBinderWrapper serviceBinderWrapper = new ServiceBinderWrapper(binder, this.rootHints);
                    this.serviceBinderWrapper = serviceBinderWrapper;
                    Messenger messenger = new Messenger(this.handler);
                    this.callbacksMessenger = messenger;
                    this.handler.setCallbacksMessenger(messenger);
                    try {
                        serviceBinderWrapper.registerCallbackMessenger(this.context, messenger);
                    } catch (RemoteException unused) {
                        yif1.m93818w("Remote error registering client messenger.");
                    }
                }
                IMediaSession iMediaSessionAsInterface = IMediaSession.Stub.asInterface(bundleM46328p.getBinder(MediaBrowserProtocol.EXTRA_SESSION_BINDER));
                if (iMediaSessionAsInterface != null) {
                    this.mediaSessionToken = MediaSessionCompat.Token.fromToken(this.browserFwk.getSessionToken(), iMediaSessionAsInterface);
                }
            } catch (IllegalStateException e) {
                yif1.m93810s("Unexpected IllegalStateException", e);
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionFailed() {
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.ConnectionCallback.ConnectionCallbackInternal
        public void onConnectionSuspended() {
            this.serviceBinderWrapper = null;
            this.callbacksMessenger = null;
            this.mediaSessionToken = null;
            this.handler.setCallbacksMessenger(null);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserServiceCallbackImpl
        public void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.callbacksMessenger != messenger) {
                return;
            }
            Subscription subscription = str == null ? null : (Subscription) this.subscriptions.get(str);
            if (subscription == null) {
                yif1.m93806q("onLoadChildren for id that isn't subscribed id=" + str);
                return;
            }
            SubscriptionCallback callback = subscription.getCallback(bundle);
            if (callback != null) {
                if (bundle == null) {
                    if (list == null) {
                        callback.onError(str);
                        return;
                    }
                    this.notifyChildrenChangedOptions = bundle2;
                    callback.onChildrenLoaded(str, list);
                    this.notifyChildrenChangedOptions = null;
                    return;
                }
                if (list == null) {
                    callback.onError(str, bundle);
                    return;
                }
                this.notifyChildrenChangedOptions = bundle2;
                callback.onChildrenLoaded(str, list, bundle);
                this.notifyChildrenChangedOptions = null;
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void search(final String str, final Bundle bundle, final SearchCallback searchCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("search() called while not connected");
            }
            if (this.serviceBinderWrapper == null) {
                yif1.m93818w("The connected service doesn't support search.");
                this.handler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.4
                    @Override // java.lang.Runnable
                    public void run() {
                        searchCallback.onError(str, bundle);
                    }
                });
                return;
            }
            SearchResultReceiver searchResultReceiver = new SearchResultReceiver(str, bundle, searchCallback, this.handler);
            try {
                ServiceBinderWrapper serviceBinderWrapper = this.serviceBinderWrapper;
                Messenger messenger = this.callbacksMessenger;
                messenger.getClass();
                serviceBinderWrapper.search(str, bundle, searchResultReceiver, messenger);
            } catch (RemoteException e) {
                String strM38564m = edb.m38564m("Remote error searching items with query: ", str);
                synchronized (yif1.f273113a) {
                    yif1.m93800n(strM38564m, e);
                    this.handler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.5
                        @Override // java.lang.Runnable
                        public void run() {
                            searchCallback.onError(str, bundle);
                        }
                    });
                }
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void sendCustomAction(final String str, final Bundle bundle, final CustomActionCallback customActionCallback) {
            if (!isConnected()) {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with extras " + bundle + " because the browser is not connected to the service.");
            }
            ServiceBinderWrapper serviceBinderWrapper = this.serviceBinderWrapper;
            if (serviceBinderWrapper == null) {
                yif1.m93818w("The connected service doesn't support sendCustomAction.");
                if (customActionCallback != null) {
                    this.handler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.6
                        @Override // java.lang.Runnable
                        public void run() {
                            customActionCallback.onError(str, bundle, null);
                        }
                    });
                    return;
                }
                return;
            }
            CustomActionResultReceiver customActionResultReceiver = new CustomActionResultReceiver(str, bundle, customActionCallback, this.handler);
            try {
                Messenger messenger = this.callbacksMessenger;
                messenger.getClass();
                serviceBinderWrapper.sendCustomAction(str, bundle, customActionResultReceiver, messenger);
            } catch (RemoteException e) {
                String str2 = "Remote error sending a custom action: action=" + str + ", extras=" + bundle;
                synchronized (yif1.f273113a) {
                    yif1.m93800n(str2, e);
                    if (customActionCallback != null) {
                        this.handler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23.7
                            @Override // java.lang.Runnable
                            public void run() {
                                customActionCallback.onError(str, bundle, null);
                            }
                        });
                    }
                }
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = (Subscription) this.subscriptions.get(str);
            if (subscription == null) {
                subscription = new Subscription();
                this.subscriptions.put(str, subscription);
            }
            subscriptionCallback.setSubscription(subscription);
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            subscription.putCallback(bundle2, subscriptionCallback);
            ServiceBinderWrapper serviceBinderWrapper = this.serviceBinderWrapper;
            if (serviceBinderWrapper == null) {
                this.browserFwk.subscribe(str, subscriptionCallback.subscriptionCallbackFwk);
                return;
            }
            try {
                IBinder iBinder = subscriptionCallback.token;
                Messenger messenger = this.callbacksMessenger;
                messenger.getClass();
                serviceBinderWrapper.addSubscription(str, iBinder, bundle2, messenger);
            } catch (RemoteException unused) {
                yif1.m93818w("Remote error subscribing media item: " + str);
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            Subscription subscription = (Subscription) this.subscriptions.get(str);
            if (subscription == null) {
                return;
            }
            ServiceBinderWrapper serviceBinderWrapper = this.serviceBinderWrapper;
            if (serviceBinderWrapper != null) {
                try {
                    if (subscriptionCallback == null) {
                        Messenger messenger = this.callbacksMessenger;
                        messenger.getClass();
                        serviceBinderWrapper.removeSubscription(str, null, messenger);
                    } else {
                        List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                        List<Bundle> optionsList = subscription.getOptionsList();
                        for (int size = callbacks.size() - 1; size >= 0; size--) {
                            if (callbacks.get(size) == subscriptionCallback) {
                                IBinder iBinder = subscriptionCallback.token;
                                Messenger messenger2 = this.callbacksMessenger;
                                messenger2.getClass();
                                serviceBinderWrapper.removeSubscription(str, iBinder, messenger2);
                                callbacks.remove(size);
                                optionsList.remove(size);
                            }
                        }
                    }
                } catch (RemoteException unused) {
                    yif1.m93806q("removeSubscription failed with RemoteException parentId=" + str);
                }
            } else if (subscriptionCallback == null) {
                this.browserFwk.unsubscribe(str);
            } else {
                List<SubscriptionCallback> callbacks2 = subscription.getCallbacks();
                List<Bundle> optionsList2 = subscription.getOptionsList();
                for (int size2 = callbacks2.size() - 1; size2 >= 0; size2--) {
                    if (callbacks2.get(size2) == subscriptionCallback) {
                        callbacks2.remove(size2);
                        optionsList2.remove(size2);
                    }
                }
                if (callbacks2.isEmpty()) {
                    this.browserFwk.unsubscribe(str);
                }
            }
            if (subscription.isEmpty() || subscriptionCallback == null) {
                this.subscriptions.remove(str);
            }
        }
    }

    public static class MediaBrowserImplApi26 extends MediaBrowserImplApi23 {
        public MediaBrowserImplApi26(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
            super(context, componentName, connectionCallback, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23, androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
            if (this.serviceBinderWrapper != null && this.serviceVersion >= 2) {
                super.subscribe(str, bundle, subscriptionCallback);
            } else if (bundle == null) {
                this.browserFwk.subscribe(str, subscriptionCallback.subscriptionCallbackFwk);
            } else {
                this.browserFwk.subscribe(str, bundle, subscriptionCallback.subscriptionCallbackFwk);
            }
        }

        @Override // androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImplApi23, androidx.media3.session.legacy.MediaBrowserCompat.MediaBrowserImpl
        public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
            if (this.serviceBinderWrapper != null && this.serviceVersion >= 2) {
                super.unsubscribe(str, subscriptionCallback);
            } else if (subscriptionCallback == null) {
                this.browserFwk.unsubscribe(str);
            } else {
                this.browserFwk.unsubscribe(str, subscriptionCallback.subscriptionCallbackFwk);
            }
        }
    }

    public interface MediaBrowserServiceCallbackImpl {
        void onLoadChildren(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);
    }

    public static abstract class SearchCallback {
        public void onError(String str, Bundle bundle) {
        }

        public void onSearchResult(String str, Bundle bundle, List<MediaItem> list) {
        }
    }

    @SuppressLint({"RestrictedApi"})
    public static class SearchResultReceiver extends ResultReceiver {
        private final SearchCallback callback;
        private final Bundle extras;
        private final String query;

        public SearchResultReceiver(String str, Bundle bundle, SearchCallback searchCallback, Handler handler) {
            super(handler);
            this.query = str;
            this.extras = bundle;
            this.callback = searchCallback;
        }

        @Override // android.support.v4.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            Bundle bundleM46328p = h0b1.m46328p(bundle);
            if (i != 0 || bundleM46328p == null) {
                this.callback.onError(this.query, this.extras);
                return;
            }
            try {
                if (!bundleM46328p.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                    this.callback.onError(this.query, this.extras);
                    return;
                }
                Parcelable[] parcelableArray = bundleM46328p.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
                if (parcelableArray == null) {
                    this.callback.onError(this.query, this.extras);
                    return;
                }
                ArrayList arrayList = new ArrayList(parcelableArray.length);
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) LegacyParcelableUtil.convert(parcelable, MediaItem.CREATOR));
                }
                this.callback.onSearchResult(this.query, this.extras, arrayList);
            } catch (RuntimeException e) {
                yif1.m93821x0("Failed to retrieve search results from parcelable", e);
                this.callback.onError(this.query, this.extras);
            }
        }
    }

    public static class ServiceBinderWrapper {
        private final Messenger messenger;
        private final Bundle rootHints;

        public ServiceBinderWrapper(IBinder iBinder, Bundle bundle) {
            this.messenger = new Messenger(iBinder);
            this.rootHints = bundle;
        }

        private void sendRequest(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            if (this.messenger.getBinder().isBinderAlive()) {
                Message messageObtain = Message.obtain();
                messageObtain.what = i;
                messageObtain.arg1 = 1;
                if (bundle != null) {
                    messageObtain.setData(bundle);
                }
                messageObtain.replyTo = messenger;
                this.messenger.send(messageObtain);
            }
        }

        public void addSubscription(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle2.putBinder(MediaBrowserProtocol.DATA_CALLBACK_TOKEN, iBinder);
            bundle2.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            sendRequest(3, bundle2, messenger);
        }

        public void getMediaItem(String str, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundleM36606f = dq60.m36606f(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundleM36606f.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, LegacyParcelableUtil.convert(resultReceiver, ResultReceiver.CREATOR));
            sendRequest(5, bundleM36606f, messenger);
        }

        public void registerCallbackMessenger(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
            bundle.putInt(MediaBrowserProtocol.DATA_CALLING_PID, Process.myPid());
            bundle.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, this.rootHints);
            sendRequest(6, bundle, messenger);
        }

        public void removeSubscription(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle.putBinder(MediaBrowserProtocol.DATA_CALLBACK_TOKEN, iBinder);
            sendRequest(4, bundle, messenger);
        }

        public void search(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_SEARCH_QUERY, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_SEARCH_EXTRAS, bundle);
            bundle2.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, LegacyParcelableUtil.convert(resultReceiver, ResultReceiver.CREATOR));
            sendRequest(8, bundle2, messenger);
        }

        public void sendCustomAction(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaBrowserProtocol.DATA_CUSTOM_ACTION, str);
            bundle2.putBundle(MediaBrowserProtocol.DATA_CUSTOM_ACTION_EXTRAS, bundle);
            bundle2.putParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER, LegacyParcelableUtil.convert(resultReceiver, ResultReceiver.CREATOR));
            sendRequest(9, bundle2, messenger);
        }

        public void unregisterCallbackMessenger(Messenger messenger) throws RemoteException {
            sendRequest(7, null, messenger);
        }
    }

    public static class Subscription {
        private final List<SubscriptionCallback> callbacks = new ArrayList();
        private final List<Bundle> optionsList = new ArrayList();

        public SubscriptionCallback getCallback(Bundle bundle) {
            for (int i = 0; i < this.optionsList.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.optionsList.get(i), bundle)) {
                    return this.callbacks.get(i);
                }
            }
            return null;
        }

        public List<SubscriptionCallback> getCallbacks() {
            return this.callbacks;
        }

        public List<Bundle> getOptionsList() {
            return this.optionsList;
        }

        public boolean isEmpty() {
            return this.callbacks.isEmpty();
        }

        public void putCallback(Bundle bundle, SubscriptionCallback subscriptionCallback) {
            for (int i = 0; i < this.optionsList.size(); i++) {
                if (MediaBrowserCompatUtils.areSameOptions(this.optionsList.get(i), bundle)) {
                    this.callbacks.set(i, subscriptionCallback);
                    return;
                }
            }
            this.callbacks.add(subscriptionCallback);
            this.optionsList.add(bundle);
        }
    }

    public static abstract class SubscriptionCallback {
        final MediaBrowser.SubscriptionCallback subscriptionCallbackFwk;
        WeakReference<Subscription> subscriptionRef;
        final IBinder token = new Binder();

        public class SubscriptionCallbackApi23 extends MediaBrowser.SubscriptionCallback {
            public SubscriptionCallbackApi23() {
            }

            public List<MediaItem> applyOptions(List<MediaItem> list, Bundle bundle) {
                int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
                int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int size = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i3, size);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<Subscription> weakReference = SubscriptionCallback.this.subscriptionRef;
                Subscription subscription = weakReference == null ? null : weakReference.get();
                if (subscription == null) {
                    SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list));
                    return;
                }
                List<MediaItem> listFromMediaItemList = MediaItem.fromMediaItemList(list);
                listFromMediaItemList.getClass();
                List<SubscriptionCallback> callbacks = subscription.getCallbacks();
                List<Bundle> optionsList = subscription.getOptionsList();
                for (int i = 0; i < callbacks.size(); i++) {
                    Bundle bundle = optionsList.get(i);
                    if (bundle == null) {
                        SubscriptionCallback.this.onChildrenLoaded(str, listFromMediaItemList);
                    } else {
                        SubscriptionCallback.this.onChildrenLoaded(str, applyOptions(listFromMediaItemList, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
                SubscriptionCallback.this.onError(str);
            }
        }

        public class SubscriptionCallbackApi26 extends SubscriptionCallbackApi23 {
            public SubscriptionCallbackApi26() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                SubscriptionCallback.this.onChildrenLoaded(str, MediaItem.fromMediaItemList(list), h0b1.m46328p(bundle));
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
                SubscriptionCallback.this.onError(str, h0b1.m46328p(bundle));
            }
        }

        public SubscriptionCallback() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.subscriptionCallbackFwk = new SubscriptionCallbackApi26();
            } else {
                this.subscriptionCallbackFwk = new SubscriptionCallbackApi23();
            }
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
        }

        public void onError(String str) {
        }

        public void setSubscription(Subscription subscription) {
            this.subscriptionRef = new WeakReference<>(subscription);
        }

        public void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void onError(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, ConnectionCallback connectionCallback, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.impl = new MediaBrowserImplApi26(context, componentName, connectionCallback, bundle);
        } else {
            this.impl = new MediaBrowserImplApi23(context, componentName, connectionCallback, bundle);
        }
    }

    public void connect() {
        yif1.m93806q("Connecting to a MediaBrowserService.");
        this.impl.connect();
    }

    public void disconnect() {
        this.impl.disconnect();
    }

    public Bundle getExtras() {
        return this.impl.getExtras();
    }

    public void getItem(String str, ItemCallback itemCallback) {
        this.impl.getItem(str, itemCallback);
    }

    public Bundle getNotifyChildrenChangedOptions() {
        return this.impl.getNotifyChildrenChangedOptions();
    }

    public String getRoot() {
        return this.impl.getRoot();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.impl.getSessionToken();
    }

    public boolean isConnected() {
        return this.impl.isConnected();
    }

    public void search(String str, Bundle bundle, SearchCallback searchCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        }
        this.impl.search(str, bundle, searchCallback);
    }

    public void sendCustomAction(String str, Bundle bundle, CustomActionCallback customActionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("action cannot be empty");
        }
        this.impl.sendCustomAction(str, bundle, customActionCallback);
    }

    public void subscribe(String str, Bundle bundle, SubscriptionCallback subscriptionCallback) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        this.impl.subscribe(str, bundle, subscriptionCallback);
    }

    public void unsubscribe(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        this.impl.unsubscribe(str, null);
    }

    public void unsubscribe(String str, SubscriptionCallback subscriptionCallback) {
        if (!TextUtils.isEmpty(str)) {
            this.impl.unsubscribe(str, subscriptionCallback);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: androidx.media3.session.legacy.MediaBrowserCompat.MediaItem.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        public static final int FLAG_BROWSABLE = 1;
        public static final int FLAG_PLAYABLE = 2;
        private final MediaDescriptionCompat description;
        private final int flags;

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.getMediaId())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.flags = i;
            this.description = mediaDescriptionCompat;
        }

        @SuppressLint({"WrongConstant"})
        public static MediaItem fromMediaItem(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.fromMediaDescription(mediaItem.getDescription()), mediaItem.getFlags());
        }

        public static List<MediaItem> fromMediaItemList(List<MediaBrowser.MediaItem> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<MediaBrowser.MediaItem> it = list.iterator();
            while (it.hasNext()) {
                MediaItem mediaItemFromMediaItem = fromMediaItem(it.next());
                if (mediaItemFromMediaItem != null) {
                    arrayList.add(mediaItemFromMediaItem);
                }
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.description;
        }

        public int getFlags() {
            return this.flags;
        }

        public String getMediaId() {
            return this.description.getMediaId();
        }

        public boolean isBrowsable() {
            return (this.flags & 1) != 0;
        }

        public boolean isPlayable() {
            return (this.flags & 2) != 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.flags + ", mDescription=" + this.description + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.flags);
            this.description.writeToParcel(parcel, i);
        }

        public MediaItem(Parcel parcel) {
            this.flags = parcel.readInt();
            this.description = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }
}
