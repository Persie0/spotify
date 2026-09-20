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
public final class AddContribution extends AbstractC0269h implements AddContributionOrBuilder {
    private static final AddContribution DEFAULT_INSTANCE;
    public static final int PARENT_NODE_PATH_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private int bitField0_;
    private String parentNodePathId_ = "";
    private ContributionPayload payload_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.AddContribution$1 */
    public static /* synthetic */ class C03261 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3154xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3154xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3154xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3154xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3154xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3154xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3154xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3154xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements AddContributionOrBuilder {
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

        public Builder clearParentNodePathId() {
            copyOnWrite();
            ((AddContribution) this.instance).clearParentNodePathId();
            return this;
        }

        public Builder clearPayload() {
            copyOnWrite();
            ((AddContribution) this.instance).clearPayload();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionOrBuilder
        public String getParentNodePathId() {
            return ((AddContribution) this.instance).getParentNodePathId();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionOrBuilder
        public gva getParentNodePathIdBytes() {
            return ((AddContribution) this.instance).getParentNodePathIdBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionOrBuilder
        public ContributionPayload getPayload() {
            return ((AddContribution) this.instance).getPayload();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionOrBuilder
        public boolean hasPayload() {
            return ((AddContribution) this.instance).hasPayload();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergePayload(ContributionPayload contributionPayload) {
            copyOnWrite();
            ((AddContribution) this.instance).mergePayload(contributionPayload);
            return this;
        }

        public Builder setParentNodePathId(String str) {
            copyOnWrite();
            ((AddContribution) this.instance).setParentNodePathId(str);
            return this;
        }

        public Builder setParentNodePathIdBytes(gva gvaVar) {
            copyOnWrite();
            ((AddContribution) this.instance).setParentNodePathIdBytes(gvaVar);
            return this;
        }

        public Builder setPayload(ContributionPayload contributionPayload) {
            copyOnWrite();
            ((AddContribution) this.instance).setPayload(contributionPayload);
            return this;
        }

        private Builder() {
            super(AddContribution.DEFAULT_INSTANCE);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98329mergeFrom(byte[] bArr, int i, int i2) {
            return super.mo98329mergeFrom(bArr, i, i2);
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ ore0 mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ AbstractC2081l8 mo98330mergeFrom(byte[] bArr, int i, int i2, aux auxVar) {
            return super.mo98330mergeFrom(bArr, i, i2, auxVar);
        }

        public Builder setPayload(ContributionPayload.Builder builder) {
            copyOnWrite();
            ((AddContribution) this.instance).setPayload((ContributionPayload) builder.build());
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

    static {
        AddContribution addContribution = new AddContribution();
        DEFAULT_INSTANCE = addContribution;
        AbstractC0269h.registerDefaultInstance(AddContribution.class, addContribution);
    }

    private AddContribution() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParentNodePathId() {
        this.parentNodePathId_ = getDefaultInstance().getParentNodePathId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payload_ = null;
        this.bitField0_ &= -2;
    }

    public static AddContribution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePayload(ContributionPayload contributionPayload) {
        contributionPayload.getClass();
        ContributionPayload contributionPayload2 = this.payload_;
        if (contributionPayload2 == null || contributionPayload2 == ContributionPayload.getDefaultInstance()) {
            this.payload_ = contributionPayload;
        } else {
            this.payload_ = (ContributionPayload) ((ContributionPayload.Builder) ContributionPayload.newBuilder(this.payload_).mergeFrom((AbstractC0269h) contributionPayload)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AddContribution parseDelimitedFrom(InputStream inputStream) {
        return (AddContribution) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddContribution parseFrom(ByteBuffer byteBuffer) {
        return (AddContribution) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentNodePathId(String str) {
        str.getClass();
        this.parentNodePathId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentNodePathIdBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.parentNodePathId_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(ContributionPayload contributionPayload) {
        contributionPayload.getClass();
        this.payload_ = contributionPayload;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "parentNodePathId_", "payload_"});
        }
        if (iOrdinal == 3) {
            return new AddContribution();
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
        synchronized (AddContribution.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionOrBuilder
    public String getParentNodePathId() {
        return this.parentNodePathId_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionOrBuilder
    public gva getParentNodePathIdBytes() {
        return gva.m45888f(this.parentNodePathId_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionOrBuilder
    public ContributionPayload getPayload() {
        ContributionPayload contributionPayload = this.payload_;
        return contributionPayload == null ? ContributionPayload.getDefaultInstance() : contributionPayload;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionOrBuilder
    public boolean hasPayload() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(AddContribution addContribution) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(addContribution);
    }

    public static AddContribution parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (AddContribution) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static AddContribution parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (AddContribution) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static AddContribution parseFrom(gva gvaVar) {
        return (AddContribution) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static AddContribution parseFrom(gva gvaVar, aux auxVar) {
        return (AddContribution) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static AddContribution parseFrom(byte[] bArr) {
        return (AddContribution) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AddContribution parseFrom(byte[] bArr, aux auxVar) {
        return (AddContribution) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static AddContribution parseFrom(InputStream inputStream) {
        return (AddContribution) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddContribution parseFrom(InputStream inputStream, aux auxVar) {
        return (AddContribution) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static AddContribution parseFrom(owe oweVar) {
        return (AddContribution) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static AddContribution parseFrom(owe oweVar, aux auxVar) {
        return (AddContribution) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
