package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class ContributionPayload extends AbstractC0269h implements ContributionPayloadOrBuilder {
    public static final int CHAT_EVENT_FIELD_NUMBER = 5;
    public static final int CHAT_INVITE_FIELD_NUMBER = 4;
    private static final ContributionPayload DEFAULT_INSTANCE;
    public static final int FREE_TEXT_FIELD_NUMBER = 1;
    public static final int METADATA_FIELD_NUMBER = 7;
    public static final int OP_TRACKED_SHARE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int RICH_MEDIA_FIELD_NUMBER = 6;
    public static final int TRACKED_SHARE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int ccpCase_ = 0;
    private Object ccp_;
    private ContributionMetadata metadata_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.ContributionPayload$1 */
    public static /* synthetic */ class C03491 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3176xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3176xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3176xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3176xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3176xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3176xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3176xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3176xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements ContributionPayloadOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 build() {
            return build();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ pre0 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clear */
        public /* bridge */ /* synthetic */ ore0 mo98325clear() {
            return mo98325clear();
        }

        public Builder clearCcp() {
            copyOnWrite();
            ((ContributionPayload) this.instance).clearCcp();
            return this;
        }

        public Builder clearChatEvent() {
            copyOnWrite();
            ((ContributionPayload) this.instance).clearChatEvent();
            return this;
        }

        public Builder clearChatInvite() {
            copyOnWrite();
            ((ContributionPayload) this.instance).clearChatInvite();
            return this;
        }

        public Builder clearFreeText() {
            copyOnWrite();
            ((ContributionPayload) this.instance).clearFreeText();
            return this;
        }

        public Builder clearMetadata() {
            copyOnWrite();
            ((ContributionPayload) this.instance).clearMetadata();
            return this;
        }

        public Builder clearOpTrackedShare() {
            copyOnWrite();
            ((ContributionPayload) this.instance).clearOpTrackedShare();
            return this;
        }

        public Builder clearRichMedia() {
            copyOnWrite();
            ((ContributionPayload) this.instance).clearRichMedia();
            return this;
        }

        public Builder clearTrackedShare() {
            copyOnWrite();
            ((ContributionPayload) this.instance).clearTrackedShare();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public CcpCase getCcpCase() {
            return ((ContributionPayload) this.instance).getCcpCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public ChatEvent getChatEvent() {
            return ((ContributionPayload) this.instance).getChatEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public ChatInvite getChatInvite() {
            return ((ContributionPayload) this.instance).getChatInvite();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public FreeText getFreeText() {
            return ((ContributionPayload) this.instance).getFreeText();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public ContributionMetadata getMetadata() {
            return ((ContributionPayload) this.instance).getMetadata();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public OffplatformTrackedShare getOpTrackedShare() {
            return ((ContributionPayload) this.instance).getOpTrackedShare();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public RichMedia getRichMedia() {
            return ((ContributionPayload) this.instance).getRichMedia();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public TrackedShare getTrackedShare() {
            return ((ContributionPayload) this.instance).getTrackedShare();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasChatEvent() {
            return ((ContributionPayload) this.instance).hasChatEvent();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasChatInvite() {
            return ((ContributionPayload) this.instance).hasChatInvite();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasFreeText() {
            return ((ContributionPayload) this.instance).hasFreeText();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasMetadata() {
            return ((ContributionPayload) this.instance).hasMetadata();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasOpTrackedShare() {
            return ((ContributionPayload) this.instance).hasOpTrackedShare();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasRichMedia() {
            return ((ContributionPayload) this.instance).hasRichMedia();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
        public boolean hasTrackedShare() {
            return ((ContributionPayload) this.instance).hasTrackedShare();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeChatEvent(ChatEvent chatEvent) {
            copyOnWrite();
            ((ContributionPayload) this.instance).mergeChatEvent(chatEvent);
            return this;
        }

        public Builder mergeChatInvite(ChatInvite chatInvite) {
            copyOnWrite();
            ((ContributionPayload) this.instance).mergeChatInvite(chatInvite);
            return this;
        }

        public Builder mergeFreeText(FreeText freeText) {
            copyOnWrite();
            ((ContributionPayload) this.instance).mergeFreeText(freeText);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeMetadata(ContributionMetadata contributionMetadata) {
            copyOnWrite();
            ((ContributionPayload) this.instance).mergeMetadata(contributionMetadata);
            return this;
        }

        public Builder mergeOpTrackedShare(OffplatformTrackedShare offplatformTrackedShare) {
            copyOnWrite();
            ((ContributionPayload) this.instance).mergeOpTrackedShare(offplatformTrackedShare);
            return this;
        }

        public Builder mergeRichMedia(RichMedia richMedia) {
            copyOnWrite();
            ((ContributionPayload) this.instance).mergeRichMedia(richMedia);
            return this;
        }

        public Builder mergeTrackedShare(TrackedShare trackedShare) {
            copyOnWrite();
            ((ContributionPayload) this.instance).mergeTrackedShare(trackedShare);
            return this;
        }

        public Builder setChatEvent(ChatEvent chatEvent) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setChatEvent(chatEvent);
            return this;
        }

        public Builder setChatInvite(ChatInvite chatInvite) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setChatInvite(chatInvite);
            return this;
        }

        public Builder setFreeText(FreeText freeText) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setFreeText(freeText);
            return this;
        }

        public Builder setMetadata(ContributionMetadata contributionMetadata) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setMetadata(contributionMetadata);
            return this;
        }

        public Builder setOpTrackedShare(OffplatformTrackedShare offplatformTrackedShare) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setOpTrackedShare(offplatformTrackedShare);
            return this;
        }

        public Builder setRichMedia(RichMedia richMedia) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setRichMedia(richMedia);
            return this;
        }

        public Builder setTrackedShare(TrackedShare trackedShare) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setTrackedShare(trackedShare);
            return this;
        }

        private Builder() {
            super(ContributionPayload.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public Builder setChatEvent(ChatEvent.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setChatEvent((ChatEvent) builder.build());
            return this;
        }

        public Builder setChatInvite(ChatInvite.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setChatInvite((ChatInvite) builder.build());
            return this;
        }

        public Builder setFreeText(FreeText.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setFreeText((FreeText) builder.build());
            return this;
        }

        public Builder setMetadata(ContributionMetadata.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setMetadata((ContributionMetadata) builder.build());
            return this;
        }

        public Builder setOpTrackedShare(OffplatformTrackedShare.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setOpTrackedShare((OffplatformTrackedShare) builder.build());
            return this;
        }

        public Builder setRichMedia(RichMedia.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setRichMedia((RichMedia) builder.build());
            return this;
        }

        public Builder setTrackedShare(TrackedShare.Builder builder) {
            copyOnWrite();
            ((ContributionPayload) this.instance).setTrackedShare((TrackedShare) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98372mergeFrom(InputStream inputStream, aux auxVar) {
            return super.mo98372mergeFrom(inputStream, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98373mergeFrom(gva gvaVar) {
            return super.mo98373mergeFrom(gvaVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98374mergeFrom(gva gvaVar, aux auxVar) {
            return super.mo98374mergeFrom(gvaVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98375mergeFrom(owe oweVar) {
            return super.mo98375mergeFrom(oweVar);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        @Override // p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ ore0 mergeFrom(pre0 pre0Var) {
            return super.mergeFrom(pre0Var);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98376mergeFrom(byte[] bArr) {
            return super.mo98376mergeFrom(bArr);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98377mergeFrom(byte[] bArr, aux auxVar) {
            return super.mo98377mergeFrom(bArr, auxVar);
        }
    }

    public enum CcpCase {
        FREE_TEXT(1),
        TRACKED_SHARE(2),
        OP_TRACKED_SHARE(3),
        CHAT_INVITE(4),
        CHAT_EVENT(5),
        RICH_MEDIA(6),
        CCP_NOT_SET(0);

        private final int value;

        CcpCase(int i) {
            this.value = i;
        }

        public static CcpCase forNumber(int i) {
            switch (i) {
                case 0:
                    return CCP_NOT_SET;
                case 1:
                    return FREE_TEXT;
                case 2:
                    return TRACKED_SHARE;
                case 3:
                    return OP_TRACKED_SHARE;
                case 4:
                    return CHAT_INVITE;
                case 5:
                    return CHAT_EVENT;
                case 6:
                    return RICH_MEDIA;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CcpCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        ContributionPayload contributionPayload = new ContributionPayload();
        DEFAULT_INSTANCE = contributionPayload;
        AbstractC0269h.registerDefaultInstance(ContributionPayload.class, contributionPayload);
    }

    private ContributionPayload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcp() {
        this.ccpCase_ = 0;
        this.ccp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatEvent() {
        if (this.ccpCase_ == 5) {
            this.ccpCase_ = 0;
            this.ccp_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatInvite() {
        if (this.ccpCase_ == 4) {
            this.ccpCase_ = 0;
            this.ccp_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeText() {
        if (this.ccpCase_ == 1) {
            this.ccpCase_ = 0;
            this.ccp_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpTrackedShare() {
        if (this.ccpCase_ == 3) {
            this.ccpCase_ = 0;
            this.ccp_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRichMedia() {
        if (this.ccpCase_ == 6) {
            this.ccpCase_ = 0;
            this.ccp_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackedShare() {
        if (this.ccpCase_ == 2) {
            this.ccpCase_ = 0;
            this.ccp_ = null;
        }
    }

    public static ContributionPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChatEvent(ChatEvent chatEvent) {
        chatEvent.getClass();
        if (this.ccpCase_ != 5 || this.ccp_ == ChatEvent.getDefaultInstance()) {
            this.ccp_ = chatEvent;
        } else {
            this.ccp_ = ((ChatEvent.Builder) ChatEvent.newBuilder((ChatEvent) this.ccp_).mergeFrom((AbstractC0269h) chatEvent)).buildPartial();
        }
        this.ccpCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChatInvite(ChatInvite chatInvite) {
        chatInvite.getClass();
        if (this.ccpCase_ != 4 || this.ccp_ == ChatInvite.getDefaultInstance()) {
            this.ccp_ = chatInvite;
        } else {
            this.ccp_ = ((ChatInvite.Builder) ChatInvite.newBuilder((ChatInvite) this.ccp_).mergeFrom((AbstractC0269h) chatInvite)).buildPartial();
        }
        this.ccpCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFreeText(FreeText freeText) {
        freeText.getClass();
        if (this.ccpCase_ != 1 || this.ccp_ == FreeText.getDefaultInstance()) {
            this.ccp_ = freeText;
        } else {
            this.ccp_ = ((FreeText.Builder) FreeText.newBuilder((FreeText) this.ccp_).mergeFrom((AbstractC0269h) freeText)).buildPartial();
        }
        this.ccpCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(ContributionMetadata contributionMetadata) {
        contributionMetadata.getClass();
        ContributionMetadata contributionMetadata2 = this.metadata_;
        if (contributionMetadata2 == null || contributionMetadata2 == ContributionMetadata.getDefaultInstance()) {
            this.metadata_ = contributionMetadata;
        } else {
            this.metadata_ = (ContributionMetadata) ((ContributionMetadata.Builder) ContributionMetadata.newBuilder(this.metadata_).mergeFrom((AbstractC0269h) contributionMetadata)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOpTrackedShare(OffplatformTrackedShare offplatformTrackedShare) {
        offplatformTrackedShare.getClass();
        if (this.ccpCase_ != 3 || this.ccp_ == OffplatformTrackedShare.getDefaultInstance()) {
            this.ccp_ = offplatformTrackedShare;
        } else {
            this.ccp_ = ((OffplatformTrackedShare.Builder) OffplatformTrackedShare.newBuilder((OffplatformTrackedShare) this.ccp_).mergeFrom((AbstractC0269h) offplatformTrackedShare)).buildPartial();
        }
        this.ccpCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRichMedia(RichMedia richMedia) {
        richMedia.getClass();
        if (this.ccpCase_ != 6 || this.ccp_ == RichMedia.getDefaultInstance()) {
            this.ccp_ = richMedia;
        } else {
            this.ccp_ = ((RichMedia.Builder) RichMedia.newBuilder((RichMedia) this.ccp_).mergeFrom((AbstractC0269h) richMedia)).buildPartial();
        }
        this.ccpCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrackedShare(TrackedShare trackedShare) {
        trackedShare.getClass();
        if (this.ccpCase_ != 2 || this.ccp_ == TrackedShare.getDefaultInstance()) {
            this.ccp_ = trackedShare;
        } else {
            this.ccp_ = ((TrackedShare.Builder) TrackedShare.newBuilder((TrackedShare) this.ccp_).mergeFrom((AbstractC0269h) trackedShare)).buildPartial();
        }
        this.ccpCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ContributionPayload parseDelimitedFrom(InputStream inputStream) {
        return (ContributionPayload) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContributionPayload parseFrom(ByteBuffer byteBuffer) {
        return (ContributionPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatEvent(ChatEvent chatEvent) {
        chatEvent.getClass();
        this.ccp_ = chatEvent;
        this.ccpCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatInvite(ChatInvite chatInvite) {
        chatInvite.getClass();
        this.ccp_ = chatInvite;
        this.ccpCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeText(FreeText freeText) {
        freeText.getClass();
        this.ccp_ = freeText;
        this.ccpCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ContributionMetadata contributionMetadata) {
        contributionMetadata.getClass();
        this.metadata_ = contributionMetadata;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpTrackedShare(OffplatformTrackedShare offplatformTrackedShare) {
        offplatformTrackedShare.getClass();
        this.ccp_ = offplatformTrackedShare;
        this.ccpCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRichMedia(RichMedia richMedia) {
        richMedia.getClass();
        this.ccp_ = richMedia;
        this.ccpCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackedShare(TrackedShare trackedShare) {
        trackedShare.getClass();
        this.ccp_ = trackedShare;
        this.ccpCase_ = 2;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007ဉ\u0000", new Object[]{"ccp_", "ccpCase_", "bitField0_", FreeText.class, TrackedShare.class, OffplatformTrackedShare.class, ChatInvite.class, ChatEvent.class, RichMedia.class, "metadata_"});
        }
        if (iOrdinal == 3) {
            return new ContributionPayload();
        }
        if (iOrdinal == 4) {
            return new Builder(0);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (ContributionPayload.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public CcpCase getCcpCase() {
        return CcpCase.forNumber(this.ccpCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public ChatEvent getChatEvent() {
        return this.ccpCase_ == 5 ? (ChatEvent) this.ccp_ : ChatEvent.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public ChatInvite getChatInvite() {
        return this.ccpCase_ == 4 ? (ChatInvite) this.ccp_ : ChatInvite.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public FreeText getFreeText() {
        return this.ccpCase_ == 1 ? (FreeText) this.ccp_ : FreeText.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public ContributionMetadata getMetadata() {
        ContributionMetadata contributionMetadata = this.metadata_;
        return contributionMetadata == null ? ContributionMetadata.getDefaultInstance() : contributionMetadata;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public OffplatformTrackedShare getOpTrackedShare() {
        return this.ccpCase_ == 3 ? (OffplatformTrackedShare) this.ccp_ : OffplatformTrackedShare.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public RichMedia getRichMedia() {
        return this.ccpCase_ == 6 ? (RichMedia) this.ccp_ : RichMedia.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public TrackedShare getTrackedShare() {
        return this.ccpCase_ == 2 ? (TrackedShare) this.ccp_ : TrackedShare.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasChatEvent() {
        return this.ccpCase_ == 5;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasChatInvite() {
        return this.ccpCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasFreeText() {
        return this.ccpCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasOpTrackedShare() {
        return this.ccpCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasRichMedia() {
        return this.ccpCase_ == 6;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.ContributionPayloadOrBuilder
    public boolean hasTrackedShare() {
        return this.ccpCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(ContributionPayload contributionPayload) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(contributionPayload);
    }

    public static ContributionPayload parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (ContributionPayload) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ContributionPayload parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (ContributionPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static ContributionPayload parseFrom(gva gvaVar) {
        return (ContributionPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static ContributionPayload parseFrom(gva gvaVar, aux auxVar) {
        return (ContributionPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static ContributionPayload parseFrom(byte[] bArr) {
        return (ContributionPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContributionPayload parseFrom(byte[] bArr, aux auxVar) {
        return (ContributionPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static ContributionPayload parseFrom(InputStream inputStream) {
        return (ContributionPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContributionPayload parseFrom(InputStream inputStream, aux auxVar) {
        return (ContributionPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static ContributionPayload parseFrom(owe oweVar) {
        return (ContributionPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static ContributionPayload parseFrom(owe oweVar, aux auxVar) {
        return (ContributionPayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
