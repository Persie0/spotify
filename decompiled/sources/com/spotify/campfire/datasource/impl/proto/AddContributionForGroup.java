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
public final class AddContributionForGroup extends AbstractC0269h implements AddContributionForGroupOrBuilder {
    public static final int CREATE_GROUP_OPTIONS_FIELD_NUMBER = 4;
    public static final int CREATE_NEW_HIERARCHY_FIELD_NUMBER = 3;
    private static final AddContributionForGroup DEFAULT_INSTANCE;
    public static final int GROUP_DETAIL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private int bitField0_;
    private CreateGroupOptions createGroupOptions_;
    private boolean createNewHierarchy_;
    private GroupDetail groupDetail_;
    private ContributionPayload payload_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.AddContributionForGroup$1 */
    public static /* synthetic */ class C03271 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3155xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3155xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3155xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3155xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3155xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3155xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3155xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3155xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements AddContributionForGroupOrBuilder {
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

        public Builder clearCreateGroupOptions() {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).clearCreateGroupOptions();
            return this;
        }

        @Deprecated
        public Builder clearCreateNewHierarchy() {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).clearCreateNewHierarchy();
            return this;
        }

        public Builder clearGroupDetail() {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).clearGroupDetail();
            return this;
        }

        public Builder clearPayload() {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).clearPayload();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        public CreateGroupOptions getCreateGroupOptions() {
            return ((AddContributionForGroup) this.instance).getCreateGroupOptions();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        @Deprecated
        public boolean getCreateNewHierarchy() {
            return ((AddContributionForGroup) this.instance).getCreateNewHierarchy();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        public GroupDetail getGroupDetail() {
            return ((AddContributionForGroup) this.instance).getGroupDetail();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        public ContributionPayload getPayload() {
            return ((AddContributionForGroup) this.instance).getPayload();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        public boolean hasCreateGroupOptions() {
            return ((AddContributionForGroup) this.instance).hasCreateGroupOptions();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        public boolean hasGroupDetail() {
            return ((AddContributionForGroup) this.instance).hasGroupDetail();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
        public boolean hasPayload() {
            return ((AddContributionForGroup) this.instance).hasPayload();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeCreateGroupOptions(CreateGroupOptions createGroupOptions) {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).mergeCreateGroupOptions(createGroupOptions);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeGroupDetail(GroupDetail groupDetail) {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).mergeGroupDetail(groupDetail);
            return this;
        }

        public Builder mergePayload(ContributionPayload contributionPayload) {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).mergePayload(contributionPayload);
            return this;
        }

        public Builder setCreateGroupOptions(CreateGroupOptions createGroupOptions) {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).setCreateGroupOptions(createGroupOptions);
            return this;
        }

        @Deprecated
        public Builder setCreateNewHierarchy(boolean z) {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).setCreateNewHierarchy(z);
            return this;
        }

        public Builder setGroupDetail(GroupDetail groupDetail) {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).setGroupDetail(groupDetail);
            return this;
        }

        public Builder setPayload(ContributionPayload contributionPayload) {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).setPayload(contributionPayload);
            return this;
        }

        private Builder() {
            super(AddContributionForGroup.DEFAULT_INSTANCE);
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

        public Builder setCreateGroupOptions(CreateGroupOptions.Builder builder) {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).setCreateGroupOptions((CreateGroupOptions) builder.build());
            return this;
        }

        public Builder setGroupDetail(GroupDetail.Builder builder) {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).setGroupDetail((GroupDetail) builder.build());
            return this;
        }

        public Builder setPayload(ContributionPayload.Builder builder) {
            copyOnWrite();
            ((AddContributionForGroup) this.instance).setPayload((ContributionPayload) builder.build());
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
        AddContributionForGroup addContributionForGroup = new AddContributionForGroup();
        DEFAULT_INSTANCE = addContributionForGroup;
        AbstractC0269h.registerDefaultInstance(AddContributionForGroup.class, addContributionForGroup);
    }

    private AddContributionForGroup() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateGroupOptions() {
        this.createGroupOptions_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateNewHierarchy() {
        this.createNewHierarchy_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupDetail() {
        this.groupDetail_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payload_ = null;
        this.bitField0_ &= -3;
    }

    public static AddContributionForGroup getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreateGroupOptions(CreateGroupOptions createGroupOptions) {
        createGroupOptions.getClass();
        CreateGroupOptions createGroupOptions2 = this.createGroupOptions_;
        if (createGroupOptions2 == null || createGroupOptions2 == CreateGroupOptions.getDefaultInstance()) {
            this.createGroupOptions_ = createGroupOptions;
        } else {
            this.createGroupOptions_ = (CreateGroupOptions) ((CreateGroupOptions.Builder) CreateGroupOptions.newBuilder(this.createGroupOptions_).mergeFrom((AbstractC0269h) createGroupOptions)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGroupDetail(GroupDetail groupDetail) {
        groupDetail.getClass();
        GroupDetail groupDetail2 = this.groupDetail_;
        if (groupDetail2 == null || groupDetail2 == GroupDetail.getDefaultInstance()) {
            this.groupDetail_ = groupDetail;
        } else {
            this.groupDetail_ = (GroupDetail) ((GroupDetail.Builder) GroupDetail.newBuilder(this.groupDetail_).mergeFrom((AbstractC0269h) groupDetail)).buildPartial();
        }
        this.bitField0_ |= 1;
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
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AddContributionForGroup parseDelimitedFrom(InputStream inputStream) {
        return (AddContributionForGroup) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddContributionForGroup parseFrom(ByteBuffer byteBuffer) {
        return (AddContributionForGroup) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateGroupOptions(CreateGroupOptions createGroupOptions) {
        createGroupOptions.getClass();
        this.createGroupOptions_ = createGroupOptions;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateNewHierarchy(boolean z) {
        this.createNewHierarchy_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupDetail(GroupDetail groupDetail) {
        groupDetail.getClass();
        this.groupDetail_ = groupDetail;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(ContributionPayload contributionPayload) {
        contributionPayload.getClass();
        this.payload_ = contributionPayload;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007\u0004ဉ\u0002", new Object[]{"bitField0_", "groupDetail_", "payload_", "createNewHierarchy_", "createGroupOptions_"});
        }
        if (iOrdinal == 3) {
            return new AddContributionForGroup();
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
        synchronized (AddContributionForGroup.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    public CreateGroupOptions getCreateGroupOptions() {
        CreateGroupOptions createGroupOptions = this.createGroupOptions_;
        return createGroupOptions == null ? CreateGroupOptions.getDefaultInstance() : createGroupOptions;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    @Deprecated
    public boolean getCreateNewHierarchy() {
        return this.createNewHierarchy_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    public GroupDetail getGroupDetail() {
        GroupDetail groupDetail = this.groupDetail_;
        return groupDetail == null ? GroupDetail.getDefaultInstance() : groupDetail;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    public ContributionPayload getPayload() {
        ContributionPayload contributionPayload = this.payload_;
        return contributionPayload == null ? ContributionPayload.getDefaultInstance() : contributionPayload;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    public boolean hasCreateGroupOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    public boolean hasGroupDetail() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.AddContributionForGroupOrBuilder
    public boolean hasPayload() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(AddContributionForGroup addContributionForGroup) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(addContributionForGroup);
    }

    public static AddContributionForGroup parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (AddContributionForGroup) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static AddContributionForGroup parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (AddContributionForGroup) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static AddContributionForGroup parseFrom(gva gvaVar) {
        return (AddContributionForGroup) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static AddContributionForGroup parseFrom(gva gvaVar, aux auxVar) {
        return (AddContributionForGroup) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static AddContributionForGroup parseFrom(byte[] bArr) {
        return (AddContributionForGroup) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AddContributionForGroup parseFrom(byte[] bArr, aux auxVar) {
        return (AddContributionForGroup) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static AddContributionForGroup parseFrom(InputStream inputStream) {
        return (AddContributionForGroup) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddContributionForGroup parseFrom(InputStream inputStream, aux auxVar) {
        return (AddContributionForGroup) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static AddContributionForGroup parseFrom(owe oweVar) {
        return (AddContributionForGroup) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static AddContributionForGroup parseFrom(owe oweVar, aux auxVar) {
        return (AddContributionForGroup) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
