package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.eh00;
import p204p.fr70;
import p204p.lzv;
import p204p.nzv;
import p204p.q3d0;
import p204p.qe70;
import p204p.rr60;
import p204p.rtz0;
import p204p.vzv;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\bj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;", "Landroid/os/Parcelable;", "", "", "priority", "<init>", "(Ljava/lang/String;II)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getPriority", "Companion", "MARKETING", "LOCAL", "TRANSACTIONAL", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public enum MessageType implements Parcelable {
    MARKETING(3),
    LOCAL(2),
    TRANSACTIONAL(1);

    private final int priority;
    private static final /* synthetic */ lzv $ENTRIES = new nzv(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MessageType> CREATOR = new Parcelable.Creator<MessageType>() { // from class: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageType.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageType createFromParcel(Parcel parcel) {
            return MessageType.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageType[] newArray(int i) {
            return new MessageType[i];
        }
    };
    private static final fr70 $cachedSerializer$delegate = q3d0.m72078I(2, Companion.C09121.INSTANCE);

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageType$Companion$1 */
        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class C09121 extends qe70 implements eh00 {
            public static final C09121 INSTANCE = new C09121();

            public C09121() {
                super(0);
            }

            @Override // p204p.eh00
            public final rr60 invoke() {
                return new vzv("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageType", MessageType.values());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ rr60 get$cachedSerializer() {
            return (rr60) MessageType.$cachedSerializer$delegate.getValue();
        }

        public final rr60 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    MessageType(int i) {
        this.priority = i;
    }

    public static lzv getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int getPriority() {
        return this.priority;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name());
    }
}
