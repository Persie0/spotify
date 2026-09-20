package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.bm51;
import p204p.s571;
import p204p.wj50;
import p204p.wl51;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/CappingKey;", "", "persistedValue", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getPersistedValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "Companion", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CappingKey {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String persistedValue;

    @Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/CappingKey$Companion;", "", "<init>", "()V", "local", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/CappingKey;", "clientMessageId", "", "local-xlX4SSM", "(Ljava/lang/String;)Ljava/lang/String;", "remote", "messageId", "", "remote-xlX4SSM", "(J)Ljava/lang/String;", "fromPersistedValue", "value", "fromPersistedValue-xZxBVag", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: fromPersistedValue-xZxBVag, reason: not valid java name */
        public final String m98354fromPersistedValuexZxBVag(String value) {
            if (bm51.m29803n0(value, "local:", false) && !wl51.m88460J0(wl51.m88469S0(value, "local:"))) {
                return CappingKey.m98348constructorimpl(value);
            }
            if (!bm51.m29803n0(value, "remote:", false) || bm51.m29808s0(10, wl51.m88469S0(value, "remote:")) == null) {
                return null;
            }
            return CappingKey.m98348constructorimpl(value);
        }

        /* JADX INFO: renamed from: local-xlX4SSM, reason: not valid java name */
        public final String m98355localxlX4SSM(String clientMessageId) {
            return CappingKey.m98348constructorimpl("local:".concat(clientMessageId));
        }

        /* JADX INFO: renamed from: remote-xlX4SSM, reason: not valid java name */
        public final String m98356remotexlX4SSM(long messageId) {
            return CappingKey.m98348constructorimpl("remote:" + messageId);
        }

        private Companion() {
        }
    }

    private /* synthetic */ CappingKey(String str) {
        this.persistedValue = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CappingKey m98347boximpl(String str) {
        return new CappingKey(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m98348constructorimpl(String str) {
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m98349equalsimpl(String str, Object obj) {
        return (obj instanceof CappingKey) && wj50.m88271j(str, ((CappingKey) obj).m98353unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m98350equalsimpl0(String str, String str2) {
        return wj50.m88271j(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m98351hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m98352toStringimpl(String str) {
        return s571.m77251j("CappingKey(persistedValue=", str, ")");
    }

    public boolean equals(Object obj) {
        return m98349equalsimpl(this.persistedValue, obj);
    }

    public final String getPersistedValue() {
        return this.persistedValue;
    }

    public int hashCode() {
        return m98351hashCodeimpl(this.persistedValue);
    }

    public String toString() {
        return m98352toStringimpl(this.persistedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m98353unboximpl() {
        return this.persistedValue;
    }
}
