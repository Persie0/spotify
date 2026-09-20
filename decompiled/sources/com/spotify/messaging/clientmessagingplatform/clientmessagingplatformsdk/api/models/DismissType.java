package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissType;", "", "ActionDeterminedDismiss", "OverriddenDismiss", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissType$ActionDeterminedDismiss;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissType$OverriddenDismiss;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface DismissType {

    @Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissType$ActionDeterminedDismiss;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class ActionDeterminedDismiss implements DismissType {
        public static final int $stable = 0;
        public static final ActionDeterminedDismiss INSTANCE = new ActionDeterminedDismiss();

        private ActionDeterminedDismiss() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ActionDeterminedDismiss);
        }

        public int hashCode() {
            return 1865582876;
        }

        public String toString() {
            return "ActionDeterminedDismiss";
        }
    }

    @Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissType$OverriddenDismiss;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DismissType;", "shouldDismiss", "", "<init>", "(Z)V", "getShouldDismiss", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* data */ class OverriddenDismiss implements DismissType {
        public static final int $stable = 0;
        private final boolean shouldDismiss;

        public OverriddenDismiss(boolean z) {
            this.shouldDismiss = z;
        }

        public static /* synthetic */ OverriddenDismiss copy$default(OverriddenDismiss overriddenDismiss, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = overriddenDismiss.shouldDismiss;
            }
            return overriddenDismiss.copy(z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getShouldDismiss() {
            return this.shouldDismiss;
        }

        public final OverriddenDismiss copy(boolean shouldDismiss) {
            return new OverriddenDismiss(shouldDismiss);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OverriddenDismiss) && this.shouldDismiss == ((OverriddenDismiss) other).shouldDismiss;
        }

        public final boolean getShouldDismiss() {
            return this.shouldDismiss;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldDismiss);
        }

        public String toString() {
            return super.toString();
        }
    }
}
