package com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.Format;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.dq60;
import p204p.edo;
import p204p.eh00;
import p204p.fr70;
import p204p.hrh;
import p204p.jqv0;
import p204p.ktz0;
import p204p.q3d0;
import p204p.qe70;
import p204p.qoy0;
import p204p.qpv0;
import p204p.rr60;
import p204p.rtz0;
import p204p.s571;
import p204p.up60;
import p204p.utz0;
import p204p.wj50;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
@Metadata(m24211d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001f2\u00020\u0001:\u0003 !\u001fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001e\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013\u0082\u0001\u0002\"#¨\u0006$"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative;", "", "<init>", "()V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(ILp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative;Lp/hrh;Lp/ktz0;)V", "", "getCreativeId", "()J", "creativeId", "", "getLocale", "()Ljava/lang/String;", "locale", "getCreativeVersion", "creativeVersion", "getTemplateId", "templateId", "getCampaignId", "campaignId", "Companion", "FormatCreative", "HtmlCreative", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative$FormatCreative;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative$HtmlCreative;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class MessageCreative {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final fr70 $cachedSerializer$delegate = q3d0.m72078I(2, Companion.C09661.INSTANCE);

    @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative$Companion$1 */
        @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class C09661 extends qe70 implements eh00 {
            public static final C09661 INSTANCE = new C09661();

            public C09661() {
                super(0);
            }

            @Override // p204p.eh00
            public final rr60 invoke() {
                jqv0 jqv0Var = qpv0.f191387a;
                return new qoy0("com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative", jqv0Var.mo54112b(MessageCreative.class), new up60[]{jqv0Var.mo54112b(FormatCreative.class), jqv0Var.mo54112b(HtmlCreative.class)}, new rr60[]{MessageCreative$FormatCreative$$serializer.INSTANCE, MessageCreative$HtmlCreative$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ rr60 get$cachedSerializer() {
            return (rr60) MessageCreative.$cachedSerializer$delegate.getValue();
        }

        public final rr60 serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @Metadata(m24211d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative$FormatCreative;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative;", "", "creativeId", "", "locale", "creativeVersion", "templateId", "campaignId", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "format", "<init>", "(JLjava/lang/String;Ljava/lang/String;JJLcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;JJLcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative$FormatCreative;Lp/hrh;Lp/ktz0;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "copy", "(JLjava/lang/String;Ljava/lang/String;JJLcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative$FormatCreative;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCreativeId", "Ljava/lang/String;", "getLocale", "getCreativeVersion", "getTemplateId", "getCampaignId", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/api/models/ui/Format;", "getFormat", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class FormatCreative extends MessageCreative {
        public static final int $stable = 0;
        private final long campaignId;
        private final long creativeId;
        private final String creativeVersion;
        private final Format format;
        private final String locale;
        private final long templateId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final fr70[] $childSerializers = {null, null, null, null, null, q3d0.m72078I(2, MessageCreative$FormatCreative$Companion$$childSerializers$1.INSTANCE)};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative$FormatCreative$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative$FormatCreative;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return MessageCreative$FormatCreative$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FormatCreative(int i, long j, String str, String str2, long j2, long j3, Format format, utz0 utz0Var) {
            super(i, utz0Var);
            if (63 != (i & 63)) {
                edo.m38617p(i, 63, MessageCreative$FormatCreative$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.creativeId = j;
            this.locale = str;
            this.creativeVersion = str2;
            this.templateId = j2;
            this.campaignId = j3;
            this.format = format;
        }

        public static /* synthetic */ FormatCreative copy$default(FormatCreative formatCreative, long j, String str, String str2, long j2, long j3, Format format, int i, Object obj) {
            if ((i & 1) != 0) {
                j = formatCreative.creativeId;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                str = formatCreative.locale;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = formatCreative.creativeVersion;
            }
            return formatCreative.copy(j4, str3, str2, (i & 8) != 0 ? formatCreative.templateId : j2, (i & 16) != 0 ? formatCreative.campaignId : j3, (i & 32) != 0 ? formatCreative.format : format);
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk */
        public static final /* synthetic */ void m15234x4f8ee6e9(FormatCreative self, hrh output, ktz0 serialDesc) {
            MessageCreative.write$Self(self, output, serialDesc);
            fr70[] fr70VarArr = $childSerializers;
            output.mo44942l(serialDesc, 0, self.getCreativeId());
            output.mo44931G(serialDesc, 1, self.getLocale());
            output.mo44931G(serialDesc, 2, self.getCreativeVersion());
            output.mo44942l(serialDesc, 3, self.getTemplateId());
            output.mo44942l(serialDesc, 4, self.getCampaignId());
            output.mo44941k(serialDesc, 5, (rr60) fr70VarArr[5].getValue(), self.format);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getCreativeId() {
            return this.creativeId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreativeVersion() {
            return this.creativeVersion;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getTemplateId() {
            return this.templateId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Format getFormat() {
            return this.format;
        }

        public final FormatCreative copy(long creativeId, String locale, String creativeVersion, long templateId, long campaignId, Format format) {
            return new FormatCreative(creativeId, locale, creativeVersion, templateId, campaignId, format);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormatCreative)) {
                return false;
            }
            FormatCreative formatCreative = (FormatCreative) other;
            return this.creativeId == formatCreative.creativeId && wj50.m88271j(this.locale, formatCreative.locale) && wj50.m88271j(this.creativeVersion, formatCreative.creativeVersion) && this.templateId == formatCreative.templateId && this.campaignId == formatCreative.campaignId && wj50.m88271j(this.format, formatCreative.format);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative
        public long getCampaignId() {
            return this.campaignId;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative
        public long getCreativeId() {
            return this.creativeId;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative
        public String getCreativeVersion() {
            return this.creativeVersion;
        }

        public final Format getFormat() {
            return this.format;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative
        public String getLocale() {
            return this.locale;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative
        public long getTemplateId() {
            return this.templateId;
        }

        public int hashCode() {
            return this.format.hashCode() + dq60.m36605e(dq60.m36605e(s571.m77243b(s571.m77243b(Long.hashCode(this.creativeId) * 31, 31, this.locale), 31, this.creativeVersion), this.templateId, 31), this.campaignId, 31);
        }

        public String toString() {
            return super.toString();
        }

        public FormatCreative(long j, String str, String str2, long j2, long j3, Format format) {
            super(null);
            this.creativeId = j;
            this.locale = str;
            this.creativeVersion = str2;
            this.templateId = j2;
            this.campaignId = j3;
            this.format = format;
        }
    }

    @Metadata(m24211d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative$HtmlCreative;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative;", "", "creativeId", "", "locale", "creativeVersion", "templateId", "campaignId", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Html;", "html", "<init>", "(JLjava/lang/String;Ljava/lang/String;JJLcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Html;)V", "", "seen0", "Lp/utz0;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;JJLcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Html;Lp/utz0;)V", "self", "Lp/hrh;", "output", "Lp/ktz0;", "serialDesc", "Lp/w2a1;", "write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk", "(Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative$HtmlCreative;Lp/hrh;Lp/ktz0;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Html;", "copy", "(JLjava/lang/String;Ljava/lang/String;JJLcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Html;)Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative$HtmlCreative;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCreativeId", "Ljava/lang/String;", "getLocale", "getCreativeVersion", "getTemplateId", "getCampaignId", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/Html;", "getHtml", "Companion", "$serializer", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    @rtz0
    public static final /* data */ class HtmlCreative extends MessageCreative {
        public static final int $stable = 0;
        private final long campaignId;
        private final long creativeId;
        private final String creativeVersion;
        private final Html html;
        private final String locale;
        private final long templateId;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final fr70[] $childSerializers = {null, null, null, null, null, q3d0.m72078I(2, MessageCreative$HtmlCreative$Companion$$childSerializers$1.INSTANCE)};

        @Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative$HtmlCreative$Companion;", "", "<init>", "()V", "Lp/rr60;", "Lcom/spotify/messaging/clientmessagingplatform/clientmessagingplatformsdk/data/models/MessageCreative$HtmlCreative;", "serializer", "()Lp/rr60;", "src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk-clientmessagingplatformsdk"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final rr60 serializer() {
                return MessageCreative$HtmlCreative$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HtmlCreative(int i, long j, String str, String str2, long j2, long j3, Html html, utz0 utz0Var) {
            super(i, utz0Var);
            if (63 != (i & 63)) {
                edo.m38617p(i, 63, MessageCreative$HtmlCreative$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.creativeId = j;
            this.locale = str;
            this.creativeVersion = str2;
            this.templateId = j2;
            this.campaignId = j3;
            this.html = html;
        }

        public static /* synthetic */ HtmlCreative copy$default(HtmlCreative htmlCreative, long j, String str, String str2, long j2, long j3, Html html, int i, Object obj) {
            if ((i & 1) != 0) {
                j = htmlCreative.creativeId;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                str = htmlCreative.locale;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = htmlCreative.creativeVersion;
            }
            return htmlCreative.copy(j4, str3, str2, (i & 8) != 0 ? htmlCreative.templateId : j2, (i & 16) != 0 ? htmlCreative.campaignId : j3, (i & 32) != 0 ? htmlCreative.html : html);
        }

        /* JADX INFO: renamed from: write$Self$src_main_java_com_spotify_messaging_clientmessagingplatform_clientmessagingplatformsdk_clientmessagingplatformsdk */
        public static final /* synthetic */ void m15235x4f8ee6e9(HtmlCreative self, hrh output, ktz0 serialDesc) {
            MessageCreative.write$Self(self, output, serialDesc);
            fr70[] fr70VarArr = $childSerializers;
            output.mo44942l(serialDesc, 0, self.getCreativeId());
            output.mo44931G(serialDesc, 1, self.getLocale());
            output.mo44931G(serialDesc, 2, self.getCreativeVersion());
            output.mo44942l(serialDesc, 3, self.getTemplateId());
            output.mo44942l(serialDesc, 4, self.getCampaignId());
            output.mo44941k(serialDesc, 5, (rr60) fr70VarArr[5].getValue(), self.html);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getCreativeId() {
            return this.creativeId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreativeVersion() {
            return this.creativeVersion;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getTemplateId() {
            return this.templateId;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Html getHtml() {
            return this.html;
        }

        public final HtmlCreative copy(long creativeId, String locale, String creativeVersion, long templateId, long campaignId, Html html) {
            return new HtmlCreative(creativeId, locale, creativeVersion, templateId, campaignId, html);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HtmlCreative)) {
                return false;
            }
            HtmlCreative htmlCreative = (HtmlCreative) other;
            return this.creativeId == htmlCreative.creativeId && wj50.m88271j(this.locale, htmlCreative.locale) && wj50.m88271j(this.creativeVersion, htmlCreative.creativeVersion) && this.templateId == htmlCreative.templateId && this.campaignId == htmlCreative.campaignId && wj50.m88271j(this.html, htmlCreative.html);
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative
        public long getCampaignId() {
            return this.campaignId;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative
        public long getCreativeId() {
            return this.creativeId;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative
        public String getCreativeVersion() {
            return this.creativeVersion;
        }

        public final Html getHtml() {
            return this.html;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative
        public String getLocale() {
            return this.locale;
        }

        @Override // com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.MessageCreative
        public long getTemplateId() {
            return this.templateId;
        }

        public int hashCode() {
            return this.html.hashCode() + dq60.m36605e(dq60.m36605e(s571.m77243b(s571.m77243b(Long.hashCode(this.creativeId) * 31, 31, this.locale), 31, this.creativeVersion), this.templateId, 31), this.campaignId, 31);
        }

        public String toString() {
            return super.toString();
        }

        public HtmlCreative(long j, String str, String str2, long j2, long j3, Html html) {
            super(null);
            this.creativeId = j;
            this.locale = str;
            this.creativeVersion = str2;
            this.templateId = j2;
            this.campaignId = j3;
            this.html = html;
        }
    }

    public /* synthetic */ MessageCreative(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long getCampaignId();

    public abstract long getCreativeId();

    public abstract String getCreativeVersion();

    public abstract String getLocale();

    public abstract long getTemplateId();

    private MessageCreative() {
    }

    public /* synthetic */ MessageCreative(int i, utz0 utz0Var) {
    }

    public static final /* synthetic */ void write$Self(MessageCreative self, hrh output, ktz0 serialDesc) {
    }
}
