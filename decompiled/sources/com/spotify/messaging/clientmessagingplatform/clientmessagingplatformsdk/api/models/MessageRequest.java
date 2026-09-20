package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.ase0;
import p204p.c7h0;
import p204p.d850;
import p204p.fr0;
import p204p.lau;
import p204p.m3q;
import p204p.s571;
import p204p.ure0;
import p204p.wj50;
import p204p.xre0;
import p204p.ytx0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bk\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b.\u0010/Jt\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010 J\u0010\u00103\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b3\u0010\u0018J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\"R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010$R\u001f\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\u0012\n\u0004\b\n\u0010?\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010&R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\bC\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010+R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010-R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bK\u0010/¨\u0006L"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;", "Landroid/os/Parcelable;", "", "triggerPattern", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;", "triggerType", "", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ClientMessage;", "suppliedMessages", "Lp/d850;", "interactionLoggingResult", "pageUri", "Lp/ytx0;", "rulesConfig", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DynamicTagsMetadata;", "dynamicTagsMetadata", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ConflictResolutionStrategy;", "conflictResolutionStrategy", "Lp/ase0;", "orchestrationMetadata", "<init>", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;Ljava/util/List;Lp/d850;Ljava/lang/String;Lp/ytx0;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DynamicTagsMetadata;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ConflictResolutionStrategy;Lp/ase0;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;", "component3", "()Ljava/util/List;", "component4", "()Lp/d850;", "component5", "component6", "()Lp/ytx0;", "component7", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DynamicTagsMetadata;", "component8", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ConflictResolutionStrategy;", "component9", "()Lp/ase0;", "copy", "(Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;Ljava/util/List;Lp/d850;Ljava/lang/String;Lp/ytx0;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DynamicTagsMetadata;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ConflictResolutionStrategy;Lp/ase0;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageRequest;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTriggerPattern", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/TriggerType;", "getTriggerType", "Ljava/util/List;", "getSuppliedMessages", "Lp/d850;", "getInteractionLoggingResult", "getInteractionLoggingResult$annotations", "()V", "getPageUri", "Lp/ytx0;", "getRulesConfig", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/DynamicTagsMetadata;", "getDynamicTagsMetadata", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ConflictResolutionStrategy;", "getConflictResolutionStrategy", "Lp/ase0;", "getOrchestrationMetadata", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class MessageRequest implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<MessageRequest> CREATOR = new Creator();
    private final ConflictResolutionStrategy conflictResolutionStrategy;
    private final DynamicTagsMetadata dynamicTagsMetadata;
    private final d850 interactionLoggingResult;
    private final ase0 orchestrationMetadata;
    private final String pageUri;
    private final ytx0 rulesConfig;
    private final List<ClientMessage> suppliedMessages;
    private final String triggerPattern;
    private final TriggerType triggerType;

    @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Creator implements Parcelable.Creator<MessageRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageRequest createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            TriggerType triggerTypeCreateFromParcel = TriggerType.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iM31715d = 0;
            while (iM31715d != i) {
                iM31715d = c7h0.m31715d(ClientMessage.CREATOR, parcel, arrayList, iM31715d, 1);
            }
            return new MessageRequest(string, triggerTypeCreateFromParcel, arrayList, null, parcel.readString(), (ytx0) parcel.readParcelable(MessageRequest.class.getClassLoader()), parcel.readInt() == 0 ? null : DynamicTagsMetadata.CREATOR.createFromParcel(parcel), ConflictResolutionStrategy.valueOf(parcel.readString()), (ase0) parcel.readParcelable(MessageRequest.class.getClassLoader()), 8, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageRequest[] newArray(int i) {
            return new MessageRequest[i];
        }
    }

    public MessageRequest(String str) {
        this(str, null, null, null, null, null, null, null, null, 510, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageRequest copy$default(MessageRequest messageRequest, String str, TriggerType triggerType, List list, d850 d850Var, String str2, ytx0 ytx0Var, DynamicTagsMetadata dynamicTagsMetadata, ConflictResolutionStrategy conflictResolutionStrategy, ase0 ase0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageRequest.triggerPattern;
        }
        if ((i & 2) != 0) {
            triggerType = messageRequest.triggerType;
        }
        if ((i & 4) != 0) {
            list = messageRequest.suppliedMessages;
        }
        if ((i & 8) != 0) {
            d850Var = messageRequest.interactionLoggingResult;
        }
        if ((i & 16) != 0) {
            str2 = messageRequest.pageUri;
        }
        if ((i & 32) != 0) {
            ytx0Var = messageRequest.rulesConfig;
        }
        if ((i & 64) != 0) {
            dynamicTagsMetadata = messageRequest.dynamicTagsMetadata;
        }
        if ((i & 128) != 0) {
            conflictResolutionStrategy = messageRequest.conflictResolutionStrategy;
        }
        if ((i & 256) != 0) {
            ase0Var = messageRequest.orchestrationMetadata;
        }
        ConflictResolutionStrategy conflictResolutionStrategy2 = conflictResolutionStrategy;
        ase0 ase0Var2 = ase0Var;
        ytx0 ytx0Var2 = ytx0Var;
        DynamicTagsMetadata dynamicTagsMetadata2 = dynamicTagsMetadata;
        String str3 = str2;
        List list2 = list;
        return messageRequest.copy(str, triggerType, list2, d850Var, str3, ytx0Var2, dynamicTagsMetadata2, conflictResolutionStrategy2, ase0Var2);
    }

    public static /* synthetic */ void getInteractionLoggingResult$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTriggerPattern() {
        return this.triggerPattern;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TriggerType getTriggerType() {
        return this.triggerType;
    }

    public final List<ClientMessage> component3() {
        return this.suppliedMessages;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final d850 getInteractionLoggingResult() {
        return this.interactionLoggingResult;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPageUri() {
        return this.pageUri;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ytx0 getRulesConfig() {
        return this.rulesConfig;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DynamicTagsMetadata getDynamicTagsMetadata() {
        return this.dynamicTagsMetadata;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ConflictResolutionStrategy getConflictResolutionStrategy() {
        return this.conflictResolutionStrategy;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ase0 getOrchestrationMetadata() {
        return this.orchestrationMetadata;
    }

    public final MessageRequest copy(String triggerPattern, TriggerType triggerType, List<ClientMessage> suppliedMessages, d850 interactionLoggingResult, String pageUri, ytx0 rulesConfig, DynamicTagsMetadata dynamicTagsMetadata, ConflictResolutionStrategy conflictResolutionStrategy, ase0 orchestrationMetadata) {
        return new MessageRequest(triggerPattern, triggerType, suppliedMessages, interactionLoggingResult, pageUri, rulesConfig, dynamicTagsMetadata, conflictResolutionStrategy, orchestrationMetadata);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageRequest)) {
            return false;
        }
        MessageRequest messageRequest = (MessageRequest) other;
        return wj50.m88271j(this.triggerPattern, messageRequest.triggerPattern) && this.triggerType == messageRequest.triggerType && wj50.m88271j(this.suppliedMessages, messageRequest.suppliedMessages) && wj50.m88271j(this.interactionLoggingResult, messageRequest.interactionLoggingResult) && wj50.m88271j(this.pageUri, messageRequest.pageUri) && wj50.m88271j(this.rulesConfig, messageRequest.rulesConfig) && wj50.m88271j(this.dynamicTagsMetadata, messageRequest.dynamicTagsMetadata) && this.conflictResolutionStrategy == messageRequest.conflictResolutionStrategy && wj50.m88271j(this.orchestrationMetadata, messageRequest.orchestrationMetadata);
    }

    public final ConflictResolutionStrategy getConflictResolutionStrategy() {
        return this.conflictResolutionStrategy;
    }

    public final DynamicTagsMetadata getDynamicTagsMetadata() {
        return this.dynamicTagsMetadata;
    }

    public final d850 getInteractionLoggingResult() {
        return this.interactionLoggingResult;
    }

    public final ase0 getOrchestrationMetadata() {
        return this.orchestrationMetadata;
    }

    public final String getPageUri() {
        return this.pageUri;
    }

    public final ytx0 getRulesConfig() {
        return this.rulesConfig;
    }

    public final List<ClientMessage> getSuppliedMessages() {
        return this.suppliedMessages;
    }

    public final String getTriggerPattern() {
        return this.triggerPattern;
    }

    public final TriggerType getTriggerType() {
        return this.triggerType;
    }

    public int hashCode() {
        int iM77244c = s571.m77244c((this.triggerType.hashCode() + (this.triggerPattern.hashCode() * 31)) * 31, 31, this.suppliedMessages);
        d850 d850Var = this.interactionLoggingResult;
        int iHashCode = (this.rulesConfig.hashCode() + s571.m77243b((iM77244c + (d850Var == null ? 0 : d850Var.hashCode())) * 31, 31, this.pageUri)) * 31;
        DynamicTagsMetadata dynamicTagsMetadata = this.dynamicTagsMetadata;
        int iHashCode2 = dynamicTagsMetadata != null ? dynamicTagsMetadata.hashCode() : 0;
        return this.orchestrationMetadata.hashCode() + ((this.conflictResolutionStrategy.hashCode() + ((iHashCode + iHashCode2) * 31)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.triggerPattern);
        this.triggerType.writeToParcel(dest, flags);
        Iterator itM42468l = fr0.m42468l(dest, this.suppliedMessages);
        while (itM42468l.hasNext()) {
            ((ClientMessage) itM42468l.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.pageUri);
        dest.writeParcelable(this.rulesConfig, flags);
        DynamicTagsMetadata dynamicTagsMetadata = this.dynamicTagsMetadata;
        if (dynamicTagsMetadata == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dynamicTagsMetadata.writeToParcel(dest, flags);
        }
        dest.writeString(this.conflictResolutionStrategy.name());
        dest.writeParcelable(this.orchestrationMetadata, flags);
    }

    public MessageRequest(String str, TriggerType triggerType) {
        this(str, triggerType, null, null, null, null, null, null, null, 508, null);
    }

    public MessageRequest(String str, TriggerType triggerType, List<ClientMessage> list) {
        this(str, triggerType, list, null, null, null, null, null, null, 504, null);
    }

    public MessageRequest(String str, TriggerType triggerType, List<ClientMessage> list, d850 d850Var) {
        this(str, triggerType, list, d850Var, null, null, null, null, null, 496, null);
    }

    public MessageRequest(String str, TriggerType triggerType, List<ClientMessage> list, d850 d850Var, String str2) {
        this(str, triggerType, list, d850Var, str2, null, null, null, null, 480, null);
    }

    public MessageRequest(String str, TriggerType triggerType, List<ClientMessage> list, d850 d850Var, String str2, ytx0 ytx0Var) {
        this(str, triggerType, list, d850Var, str2, ytx0Var, null, null, null, 448, null);
    }

    public MessageRequest(String str, TriggerType triggerType, List<ClientMessage> list, d850 d850Var, String str2, ytx0 ytx0Var, DynamicTagsMetadata dynamicTagsMetadata) {
        this(str, triggerType, list, d850Var, str2, ytx0Var, dynamicTagsMetadata, null, null, 384, null);
    }

    public MessageRequest(String str, TriggerType triggerType, List<ClientMessage> list, d850 d850Var, String str2, ytx0 ytx0Var, DynamicTagsMetadata dynamicTagsMetadata, ConflictResolutionStrategy conflictResolutionStrategy) {
        this(str, triggerType, list, d850Var, str2, ytx0Var, dynamicTagsMetadata, conflictResolutionStrategy, null, 256, null);
    }

    public MessageRequest(String str, TriggerType triggerType, List<ClientMessage> list, d850 d850Var, String str2, ytx0 ytx0Var, DynamicTagsMetadata dynamicTagsMetadata, ConflictResolutionStrategy conflictResolutionStrategy, ase0 ase0Var) {
        this.triggerPattern = str;
        this.triggerType = triggerType;
        this.suppliedMessages = list;
        this.interactionLoggingResult = d850Var;
        this.pageUri = str2;
        this.rulesConfig = ytx0Var;
        this.dynamicTagsMetadata = dynamicTagsMetadata;
        this.conflictResolutionStrategy = conflictResolutionStrategy;
        this.orchestrationMetadata = ase0Var;
    }

    public /* synthetic */ MessageRequest(String str, TriggerType triggerType, List list, d850 d850Var, String str2, ytx0 ytx0Var, DynamicTagsMetadata dynamicTagsMetadata, ConflictResolutionStrategy conflictResolutionStrategy, ase0 ase0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? TriggerType.CLIENT_EVENT : triggerType, (i & 4) != 0 ? lau.f131415a : list, (i & 8) != 0 ? null : d850Var, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? m3q.f139697a : ytx0Var, (i & 64) != 0 ? null : dynamicTagsMetadata, (i & 128) != 0 ? ConflictResolutionStrategy.DISCARD_SELF : conflictResolutionStrategy, (i & 256) != 0 ? new ase0(xre0.f265332a, ure0.f233341a) : ase0Var);
    }
}
