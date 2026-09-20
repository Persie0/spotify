package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import kotlin.Metadata;
import p204p.lzv;
import p204p.nzv;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Rule;", "", "<init>", "(Ljava/lang/String;I)V", "DISALLOW_IF_CONTEXT_SWITCHED", "DISALLOW_IF_APPLICATION_BACKGROUNDED", "DISALLOW_IF_CONFLICTING_MESSAGE_PRESENTING", "DISALLOW_IF_AD_PLAYING", "DISALLOW_IF_NOW_PLAYING_VIEW_DISPLAYING", "DISALLOW_IF_CAR_CONNECTED", "DISALLOW_IF_CONNECTIVITY_OFFLINE", "ALLOW_ONLY_CUSTOM_CLIENT_TRIGGERS", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public enum Rule {
    DISALLOW_IF_CONTEXT_SWITCHED,
    DISALLOW_IF_APPLICATION_BACKGROUNDED,
    DISALLOW_IF_CONFLICTING_MESSAGE_PRESENTING,
    DISALLOW_IF_AD_PLAYING,
    DISALLOW_IF_NOW_PLAYING_VIEW_DISPLAYING,
    DISALLOW_IF_CAR_CONNECTED,
    DISALLOW_IF_CONNECTIVITY_OFFLINE,
    ALLOW_ONLY_CUSTOM_CLIENT_TRIGGERS;

    private static final /* synthetic */ lzv $ENTRIES = new nzv(values());

    public static lzv getEntries() {
        return $ENTRIES;
    }
}
