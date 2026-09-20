package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models;

import android.os.Parcel;
import android.os.Parcelable;
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
import p204p.utz0;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
@Metadata(m24211d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 M2\u00020\u0001:\u0002NMBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bu\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0010\u0010+\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.Jt\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010!J\u0010\u00102\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b2\u0010\u0019J\u001a\u00105\u001a\u00020\u000f2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010>\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bC\u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bD\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bE\u0010#R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bF\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010)R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bI\u0010!R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010,R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\b\u0010\u0010.¨\u0006O"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/LoggingData;", "Landroid/os/Parcelable;", "", "messageUuid", "", "messageId", "creativeId", "creativeTemplateId", "creativeCampaignId", "creativeVersion", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;", "formatType", "locale", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageSource;", "messageSource", "", "isPreview", "<init>", "(Ljava/lang/String;JJJJLjava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageSource;Z)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILjava/lang/String;JJJJLjava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageSource;ZLp/utz0;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lp/w2a1;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "component5", "component6", "component7", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;", "component8", "component9", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageSource;", "component10", "()Z", "copy", "(Ljava/lang/String;JJJJLjava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;Ljava/lang/String;Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageSource;Z)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/LoggingData;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/LoggingData;Lp/hrh;Lp/ktz0;)V", "write$Self", "Ljava/lang/String;", "getMessageUuid", "J", "getMessageId", "getCreativeId", "getCreativeTemplateId", "getCreativeCampaignId", "getCreativeVersion", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/FormatType;", "getFormatType", "getLocale", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/MessageSource;", "getMessageSource", "Z", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class LoggingData implements Parcelable {
    public static final int $stable = 0;
    private final long creativeCampaignId;
    private final long creativeId;
    private final long creativeTemplateId;
    private final String creativeVersion;
    private final FormatType formatType;
    private final boolean isPreview;
    private final String locale;
    private final long messageId;
    private final MessageSource messageSource;
    private final String messageUuid;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LoggingData> CREATOR = new Creator();
    private static final fr70[] $childSerializers = {null, null, null, null, null, null, q3d0.m72078I(2, LoggingData$Companion$$childSerializers$1.INSTANCE), null, q3d0.m72078I(2, LoggingData$Companion$$childSerializers$2.INSTANCE), null};

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/LoggingData$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/LoggingData;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final rr60 serializer() {
            return LoggingData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Creator implements Parcelable.Creator<LoggingData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoggingData createFromParcel(Parcel parcel) {
            return new LoggingData(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), FormatType.CREATOR.createFromParcel(parcel), parcel.readString(), MessageSource.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LoggingData[] newArray(int i) {
            return new LoggingData[i];
        }
    }

    public /* synthetic */ LoggingData(int i, String str, long j, long j2, long j3, long j4, String str2, FormatType formatType, String str3, MessageSource messageSource, boolean z, utz0 utz0Var) {
        if (511 != (i & 511)) {
            edo.m38617p(i, 511, LoggingData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.messageUuid = str;
        this.messageId = j;
        this.creativeId = j2;
        this.creativeTemplateId = j3;
        this.creativeCampaignId = j4;
        this.creativeVersion = str2;
        this.formatType = formatType;
        this.locale = str3;
        this.messageSource = messageSource;
        this.isPreview = (i & 512) == 0 ? false : z;
    }

    /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk */
    public static final /* synthetic */ void m15169x4f8ee6e9(LoggingData self, hrh output, ktz0 serialDesc) {
        fr70[] fr70VarArr = $childSerializers;
        output.mo44931G(serialDesc, 0, self.messageUuid);
        output.mo44942l(serialDesc, 1, self.messageId);
        output.mo44942l(serialDesc, 2, self.creativeId);
        output.mo44942l(serialDesc, 3, self.creativeTemplateId);
        output.mo44942l(serialDesc, 4, self.creativeCampaignId);
        output.mo44931G(serialDesc, 5, self.creativeVersion);
        output.mo44941k(serialDesc, 6, (rr60) fr70VarArr[6].getValue(), self.formatType);
        output.mo44931G(serialDesc, 7, self.locale);
        output.mo44941k(serialDesc, 8, (rr60) fr70VarArr[8].getValue(), self.messageSource);
        if (output.mo48399d0() || self.isPreview) {
            output.mo44930E(serialDesc, 9, self.isPreview);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageUuid() {
        return this.messageUuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsPreview() {
        return this.isPreview;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCreativeId() {
        return this.creativeId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreativeTemplateId() {
        return this.creativeTemplateId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCreativeCampaignId() {
        return this.creativeCampaignId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCreativeVersion() {
        return this.creativeVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FormatType getFormatType() {
        return this.formatType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final MessageSource getMessageSource() {
        return this.messageSource;
    }

    public final LoggingData copy(String messageUuid, long messageId, long creativeId, long creativeTemplateId, long creativeCampaignId, String creativeVersion, FormatType formatType, String locale, MessageSource messageSource, boolean isPreview) {
        return new LoggingData(messageUuid, messageId, creativeId, creativeTemplateId, creativeCampaignId, creativeVersion, formatType, locale, messageSource, isPreview);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoggingData)) {
            return false;
        }
        LoggingData loggingData = (LoggingData) other;
        return wj50.m88271j(this.messageUuid, loggingData.messageUuid) && this.messageId == loggingData.messageId && this.creativeId == loggingData.creativeId && this.creativeTemplateId == loggingData.creativeTemplateId && this.creativeCampaignId == loggingData.creativeCampaignId && wj50.m88271j(this.creativeVersion, loggingData.creativeVersion) && this.formatType == loggingData.formatType && wj50.m88271j(this.locale, loggingData.locale) && this.messageSource == loggingData.messageSource && this.isPreview == loggingData.isPreview;
    }

    public final long getCreativeCampaignId() {
        return this.creativeCampaignId;
    }

    public final long getCreativeId() {
        return this.creativeId;
    }

    public final long getCreativeTemplateId() {
        return this.creativeTemplateId;
    }

    public final String getCreativeVersion() {
        return this.creativeVersion;
    }

    public final FormatType getFormatType() {
        return this.formatType;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    public final MessageSource getMessageSource() {
        return this.messageSource;
    }

    public final String getMessageUuid() {
        return this.messageUuid;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPreview) + ((this.messageSource.hashCode() + s571.m77243b((this.formatType.hashCode() + s571.m77243b(dq60.m36605e(dq60.m36605e(dq60.m36605e(dq60.m36605e(this.messageUuid.hashCode() * 31, this.messageId, 31), this.creativeId, 31), this.creativeTemplateId, 31), this.creativeCampaignId, 31), 31, this.creativeVersion)) * 31, 31, this.locale)) * 31);
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    public String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.messageUuid);
        dest.writeLong(this.messageId);
        dest.writeLong(this.creativeId);
        dest.writeLong(this.creativeTemplateId);
        dest.writeLong(this.creativeCampaignId);
        dest.writeString(this.creativeVersion);
        this.formatType.writeToParcel(dest, flags);
        dest.writeString(this.locale);
        this.messageSource.writeToParcel(dest, flags);
        dest.writeInt(this.isPreview ? 1 : 0);
    }

    public LoggingData(String str, long j, long j2, long j3, long j4, String str2, FormatType formatType, String str3, MessageSource messageSource, boolean z) {
        this.messageUuid = str;
        this.messageId = j;
        this.creativeId = j2;
        this.creativeTemplateId = j3;
        this.creativeCampaignId = j4;
        this.creativeVersion = str2;
        this.formatType = formatType;
        this.locale = str3;
        this.messageSource = messageSource;
        this.isPreview = z;
    }

    public /* synthetic */ LoggingData(String str, long j, long j2, long j3, long j4, String str2, FormatType formatType, String str3, MessageSource messageSource, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, j3, j4, str2, formatType, str3, messageSource, (i & 512) != 0 ? false : z);
    }
}
