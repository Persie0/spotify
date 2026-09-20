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
public final class MessagePayload extends AbstractC0269h implements MessagePayloadOrBuilder {
    public static final int ACTIVITY_PAYLOAD_FIELD_NUMBER = 2;
    public static final int CONTRIBUTION_PAYLOAD_FIELD_NUMBER = 1;
    private static final MessagePayload DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int cmpCase_ = 0;
    private Object cmp_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.MessagePayload$1 */
    public static /* synthetic */ class C04081 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3224xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3224xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3224xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3224xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3224xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3224xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3224xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3224xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements MessagePayloadOrBuilder {
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

        public Builder clearActivityPayload() {
            copyOnWrite();
            ((MessagePayload) this.instance).clearActivityPayload();
            return this;
        }

        public Builder clearCmp() {
            copyOnWrite();
            ((MessagePayload) this.instance).clearCmp();
            return this;
        }

        public Builder clearContributionPayload() {
            copyOnWrite();
            ((MessagePayload) this.instance).clearContributionPayload();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
        public ActivityPayload getActivityPayload() {
            return ((MessagePayload) this.instance).getActivityPayload();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
        public CmpCase getCmpCase() {
            return ((MessagePayload) this.instance).getCmpCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
        public ContributionPayload getContributionPayload() {
            return ((MessagePayload) this.instance).getContributionPayload();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
        public boolean hasActivityPayload() {
            return ((MessagePayload) this.instance).hasActivityPayload();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
        public boolean hasContributionPayload() {
            return ((MessagePayload) this.instance).hasContributionPayload();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeActivityPayload(ActivityPayload activityPayload) {
            copyOnWrite();
            ((MessagePayload) this.instance).mergeActivityPayload(activityPayload);
            return this;
        }

        public Builder mergeContributionPayload(ContributionPayload contributionPayload) {
            copyOnWrite();
            ((MessagePayload) this.instance).mergeContributionPayload(contributionPayload);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setActivityPayload(ActivityPayload activityPayload) {
            copyOnWrite();
            ((MessagePayload) this.instance).setActivityPayload(activityPayload);
            return this;
        }

        public Builder setContributionPayload(ContributionPayload contributionPayload) {
            copyOnWrite();
            ((MessagePayload) this.instance).setContributionPayload(contributionPayload);
            return this;
        }

        private Builder() {
            super(MessagePayload.DEFAULT_INSTANCE);
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

        public Builder setActivityPayload(ActivityPayload.Builder builder) {
            copyOnWrite();
            ((MessagePayload) this.instance).setActivityPayload((ActivityPayload) builder.build());
            return this;
        }

        public Builder setContributionPayload(ContributionPayload.Builder builder) {
            copyOnWrite();
            ((MessagePayload) this.instance).setContributionPayload((ContributionPayload) builder.build());
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

    public enum CmpCase {
        CONTRIBUTION_PAYLOAD(1),
        ACTIVITY_PAYLOAD(2),
        CMP_NOT_SET(0);

        private final int value;

        CmpCase(int i) {
            this.value = i;
        }

        public static CmpCase forNumber(int i) {
            if (i == 0) {
                return CMP_NOT_SET;
            }
            if (i == 1) {
                return CONTRIBUTION_PAYLOAD;
            }
            if (i != 2) {
                return null;
            }
            return ACTIVITY_PAYLOAD;
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CmpCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        MessagePayload messagePayload = new MessagePayload();
        DEFAULT_INSTANCE = messagePayload;
        AbstractC0269h.registerDefaultInstance(MessagePayload.class, messagePayload);
    }

    private MessagePayload() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityPayload() {
        if (this.cmpCase_ == 2) {
            this.cmpCase_ = 0;
            this.cmp_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmp() {
        this.cmpCase_ = 0;
        this.cmp_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContributionPayload() {
        if (this.cmpCase_ == 1) {
            this.cmpCase_ = 0;
            this.cmp_ = null;
        }
    }

    public static MessagePayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActivityPayload(ActivityPayload activityPayload) {
        activityPayload.getClass();
        if (this.cmpCase_ != 2 || this.cmp_ == ActivityPayload.getDefaultInstance()) {
            this.cmp_ = activityPayload;
        } else {
            this.cmp_ = ((ActivityPayload.Builder) ActivityPayload.newBuilder((ActivityPayload) this.cmp_).mergeFrom((AbstractC0269h) activityPayload)).buildPartial();
        }
        this.cmpCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContributionPayload(ContributionPayload contributionPayload) {
        contributionPayload.getClass();
        if (this.cmpCase_ != 1 || this.cmp_ == ContributionPayload.getDefaultInstance()) {
            this.cmp_ = contributionPayload;
        } else {
            this.cmp_ = ((ContributionPayload.Builder) ContributionPayload.newBuilder((ContributionPayload) this.cmp_).mergeFrom((AbstractC0269h) contributionPayload)).buildPartial();
        }
        this.cmpCase_ = 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagePayload parseDelimitedFrom(InputStream inputStream) {
        return (MessagePayload) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagePayload parseFrom(ByteBuffer byteBuffer) {
        return (MessagePayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityPayload(ActivityPayload activityPayload) {
        activityPayload.getClass();
        this.cmp_ = activityPayload;
        this.cmpCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContributionPayload(ContributionPayload contributionPayload) {
        contributionPayload.getClass();
        this.cmp_ = contributionPayload;
        this.cmpCase_ = 1;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"cmp_", "cmpCase_", ContributionPayload.class, ActivityPayload.class});
        }
        if (iOrdinal == 3) {
            return new MessagePayload();
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
        synchronized (MessagePayload.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
    public ActivityPayload getActivityPayload() {
        return this.cmpCase_ == 2 ? (ActivityPayload) this.cmp_ : ActivityPayload.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
    public CmpCase getCmpCase() {
        return CmpCase.forNumber(this.cmpCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
    public ContributionPayload getContributionPayload() {
        return this.cmpCase_ == 1 ? (ContributionPayload) this.cmp_ : ContributionPayload.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
    public boolean hasActivityPayload() {
        return this.cmpCase_ == 2;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessagePayloadOrBuilder
    public boolean hasContributionPayload() {
        return this.cmpCase_ == 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(MessagePayload messagePayload) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(messagePayload);
    }

    public static MessagePayload parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (MessagePayload) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static MessagePayload parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (MessagePayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static MessagePayload parseFrom(gva gvaVar) {
        return (MessagePayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static MessagePayload parseFrom(gva gvaVar, aux auxVar) {
        return (MessagePayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static MessagePayload parseFrom(byte[] bArr) {
        return (MessagePayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagePayload parseFrom(byte[] bArr, aux auxVar) {
        return (MessagePayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static MessagePayload parseFrom(InputStream inputStream) {
        return (MessagePayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagePayload parseFrom(InputStream inputStream, aux auxVar) {
        return (MessagePayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static MessagePayload parseFrom(owe oweVar) {
        return (MessagePayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static MessagePayload parseFrom(owe oweVar, aux auxVar) {
        return (MessagePayload) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
