package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.dq60;
import p204p.edo;
import p204p.fr70;
import p204p.hrh;
import p204p.ktz0;
import p204p.q3d0;
import p204p.rr60;
import p204p.rtz0;
import p204p.s571;
import p204p.u2b0;
import p204p.utz0;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
@Metadata(m24211d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Be\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b,\u0010-J`\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010!J\u0010\u00101\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010)R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010-¨\u0006G"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;", "", "", "uuid", "", "messageId", "endTimestamp", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative;", "creative", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Capping;", "capping", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/Trigger;", "triggers", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;", "messageType", "<init>", "(Ljava/lang/String;JLjava/lang/Long;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Capping;Ljava/util/List;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/Long;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Capping;Ljava/util/List;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;Lp/hrh;Lp/ktz0;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Ljava/lang/Long;", "component4", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative;", "component5", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Capping;", "component6", "()Ljava/util/List;", "component7", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;", "copy", "(Ljava/lang/String;JLjava/lang/Long;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Capping;Ljava/util/List;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "J", "getMessageId", "Ljava/lang/Long;", "getEndTimestamp", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative;", "getCreative", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Capping;", "getCapping", "Ljava/util/List;", "getTriggers", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageType;", "getMessageType", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class InAppMessage {
    public static final int $stable = 0;
    private final Capping capping;
    private final MessageCreative creative;
    private final Long endTimestamp;
    private final long messageId;
    private final MessageType messageType;
    private final List<Trigger> triggers;
    private final String uuid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final fr70[] $childSerializers = {null, null, null, q3d0.m72078I(2, InAppMessage$Companion$$childSerializers$1.INSTANCE), null, q3d0.m72078I(2, InAppMessage$Companion$$childSerializers$2.INSTANCE), q3d0.m72078I(2, InAppMessage$Companion$$childSerializers$3.INSTANCE)};

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/InAppMessage;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final rr60 serializer() {
            return InAppMessage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InAppMessage(int i, String str, long j, Long l, MessageCreative messageCreative, Capping capping, List list, MessageType messageType, utz0 utz0Var) {
        if (107 != (i & Error.TOO_YOUNG_FIELD_NUMBER)) {
            edo.m38617p(i, Error.TOO_YOUNG_FIELD_NUMBER, InAppMessage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.messageId = j;
        if ((i & 4) == 0) {
            this.endTimestamp = null;
        } else {
            this.endTimestamp = l;
        }
        this.creative = messageCreative;
        if ((i & 16) == 0) {
            this.capping = null;
        } else {
            this.capping = capping;
        }
        this.triggers = list;
        this.messageType = messageType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InAppMessage copy$default(InAppMessage inAppMessage, String str, long j, Long l, MessageCreative messageCreative, Capping capping, List list, MessageType messageType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppMessage.uuid;
        }
        if ((i & 2) != 0) {
            j = inAppMessage.messageId;
        }
        if ((i & 4) != 0) {
            l = inAppMessage.endTimestamp;
        }
        if ((i & 8) != 0) {
            messageCreative = inAppMessage.creative;
        }
        if ((i & 16) != 0) {
            capping = inAppMessage.capping;
        }
        if ((i & 32) != 0) {
            list = inAppMessage.triggers;
        }
        if ((i & 64) != 0) {
            messageType = inAppMessage.messageType;
        }
        MessageType messageType2 = messageType;
        Capping capping2 = capping;
        Long l2 = l;
        return inAppMessage.copy(str, j, l2, messageCreative, capping2, list, messageType2);
    }

    /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk */
    public static final /* synthetic */ void m15231x4f8ee6e9(InAppMessage self, hrh output, ktz0 serialDesc) {
        fr70[] fr70VarArr = $childSerializers;
        output.mo44931G(serialDesc, 0, self.uuid);
        output.mo44942l(serialDesc, 1, self.messageId);
        if (output.mo48399d0() || self.endTimestamp != null) {
            output.mo44943s(serialDesc, 2, u2b0.f226058a, self.endTimestamp);
        }
        output.mo44941k(serialDesc, 3, (rr60) fr70VarArr[3].getValue(), self.creative);
        if (output.mo48399d0() || self.capping != null) {
            output.mo44943s(serialDesc, 4, Capping$$serializer.INSTANCE, self.capping);
        }
        output.mo44941k(serialDesc, 5, (rr60) fr70VarArr[5].getValue(), self.triggers);
        output.mo44941k(serialDesc, 6, (rr60) fr70VarArr[6].getValue(), self.messageType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final MessageCreative getCreative() {
        return this.creative;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Capping getCapping() {
        return this.capping;
    }

    public final List<Trigger> component6() {
        return this.triggers;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final MessageType getMessageType() {
        return this.messageType;
    }

    public final InAppMessage copy(String uuid, long messageId, Long endTimestamp, MessageCreative creative, Capping capping, List<Trigger> triggers, MessageType messageType) {
        return new InAppMessage(uuid, messageId, endTimestamp, creative, capping, triggers, messageType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppMessage)) {
            return false;
        }
        InAppMessage inAppMessage = (InAppMessage) other;
        return wj50.m88271j(this.uuid, inAppMessage.uuid) && this.messageId == inAppMessage.messageId && wj50.m88271j(this.endTimestamp, inAppMessage.endTimestamp) && wj50.m88271j(this.creative, inAppMessage.creative) && wj50.m88271j(this.capping, inAppMessage.capping) && wj50.m88271j(this.triggers, inAppMessage.triggers) && this.messageType == inAppMessage.messageType;
    }

    public final Capping getCapping() {
        return this.capping;
    }

    public final MessageCreative getCreative() {
        return this.creative;
    }

    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    public final MessageType getMessageType() {
        return this.messageType;
    }

    public final List<Trigger> getTriggers() {
        return this.triggers;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iM36605e = dq60.m36605e(this.uuid.hashCode() * 31, this.messageId, 31);
        Long l = this.endTimestamp;
        int iHashCode = (this.creative.hashCode() + ((iM36605e + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        Capping capping = this.capping;
        return this.messageType.hashCode() + s571.m77244c((iHashCode + (capping != null ? capping.hashCode() : 0)) * 31, 31, this.triggers);
    }

    public String toString() {
        return super.toString();
    }

    public InAppMessage(String str, long j, Long l, MessageCreative messageCreative, Capping capping, List<Trigger> list, MessageType messageType) {
        this.uuid = str;
        this.messageId = j;
        this.endTimestamp = l;
        this.creative = messageCreative;
        this.capping = capping;
        this.triggers = list;
        this.messageType = messageType;
    }

    public /* synthetic */ InAppMessage(String str, long j, Long l, MessageCreative messageCreative, Capping capping, List list, MessageType messageType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i & 4) != 0 ? null : l, messageCreative, (i & 16) != 0 ? null : capping, list, messageType);
    }
}
