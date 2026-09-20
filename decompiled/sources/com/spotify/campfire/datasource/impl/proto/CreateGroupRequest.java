package com.spotify.campfire.datasource.impl.proto;

import com.google.protobuf.AbstractC0268g;
import com.google.protobuf.AbstractC0269h;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2081l8;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.aux;
import p204p.gva;
import p204p.ore0;
import p204p.owe;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class CreateGroupRequest extends AbstractC0269h implements CreateGroupRequestOrBuilder {
    public static final int CREATE_GROUP_OPTIONS_FIELD_NUMBER = 4;
    private static final CreateGroupRequest DEFAULT_INSTANCE;
    public static final int MEMBER_USERNAME_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private CreateGroupOptions createGroupOptions_;
    private ae50 memberUsername_ = AbstractC0269h.emptyProtobufList();
    private String name_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.CreateGroupRequest$1 */
    /* JADX INFO: loaded from: classes5.dex */
    public static /* synthetic */ class C03521 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3179xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3179xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3179xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3179xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3179xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3179xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3179xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3179xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder extends AbstractC0268g implements CreateGroupRequestOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllMemberUsername(Iterable<String> iterable) {
            copyOnWrite();
            ((CreateGroupRequest) this.instance).addAllMemberUsername(iterable);
            return this;
        }

        public Builder addMemberUsername(String str) {
            copyOnWrite();
            ((CreateGroupRequest) this.instance).addMemberUsername(str);
            return this;
        }

        public Builder addMemberUsernameBytes(gva gvaVar) {
            copyOnWrite();
            ((CreateGroupRequest) this.instance).addMemberUsernameBytes(gvaVar);
            return this;
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
            ((CreateGroupRequest) this.instance).clearCreateGroupOptions();
            return this;
        }

        public Builder clearMemberUsername() {
            copyOnWrite();
            ((CreateGroupRequest) this.instance).clearMemberUsername();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((CreateGroupRequest) this.instance).clearName();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
        public CreateGroupOptions getCreateGroupOptions() {
            return ((CreateGroupRequest) this.instance).getCreateGroupOptions();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
        public String getMemberUsername(int i) {
            return ((CreateGroupRequest) this.instance).getMemberUsername(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
        public gva getMemberUsernameBytes(int i) {
            return ((CreateGroupRequest) this.instance).getMemberUsernameBytes(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
        public int getMemberUsernameCount() {
            return ((CreateGroupRequest) this.instance).getMemberUsernameCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
        public List<String> getMemberUsernameList() {
            return Collections.unmodifiableList(((CreateGroupRequest) this.instance).getMemberUsernameList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
        public String getName() {
            return ((CreateGroupRequest) this.instance).getName();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
        public gva getNameBytes() {
            return ((CreateGroupRequest) this.instance).getNameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
        public boolean hasCreateGroupOptions() {
            return ((CreateGroupRequest) this.instance).hasCreateGroupOptions();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
        public boolean hasName() {
            return ((CreateGroupRequest) this.instance).hasName();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeCreateGroupOptions(CreateGroupOptions createGroupOptions) {
            copyOnWrite();
            ((CreateGroupRequest) this.instance).mergeCreateGroupOptions(createGroupOptions);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setCreateGroupOptions(CreateGroupOptions createGroupOptions) {
            copyOnWrite();
            ((CreateGroupRequest) this.instance).setCreateGroupOptions(createGroupOptions);
            return this;
        }

        public Builder setMemberUsername(int i, String str) {
            copyOnWrite();
            ((CreateGroupRequest) this.instance).setMemberUsername(i, str);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((CreateGroupRequest) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(gva gvaVar) {
            copyOnWrite();
            ((CreateGroupRequest) this.instance).setNameBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(CreateGroupRequest.DEFAULT_INSTANCE);
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
            ((CreateGroupRequest) this.instance).setCreateGroupOptions((CreateGroupOptions) builder.build());
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
        CreateGroupRequest createGroupRequest = new CreateGroupRequest();
        DEFAULT_INSTANCE = createGroupRequest;
        AbstractC0269h.registerDefaultInstance(CreateGroupRequest.class, createGroupRequest);
    }

    private CreateGroupRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMemberUsername(Iterable<String> iterable) {
        ensureMemberUsernameIsMutable();
        AbstractC2118m8.addAll(iterable, this.memberUsername_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemberUsername(String str) {
        str.getClass();
        ensureMemberUsernameIsMutable();
        this.memberUsername_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMemberUsernameBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        ensureMemberUsernameIsMutable();
        this.memberUsername_.add(gvaVar.m45892u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateGroupOptions() {
        this.createGroupOptions_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemberUsername() {
        this.memberUsername_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    private void ensureMemberUsernameIsMutable() {
        ae50 ae50Var = this.memberUsername_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.memberUsername_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static CreateGroupRequest getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CreateGroupRequest parseDelimitedFrom(InputStream inputStream) {
        return (CreateGroupRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateGroupRequest parseFrom(ByteBuffer byteBuffer) {
        return (CreateGroupRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateGroupOptions(CreateGroupOptions createGroupOptions) {
        createGroupOptions.getClass();
        this.createGroupOptions_ = createGroupOptions;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberUsername(int i, String str) {
        str.getClass();
        ensureMemberUsernameIsMutable();
        this.memberUsername_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.name_ = gvaVar.m45892u();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002Ț\u0003ለ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "memberUsername_", "name_", "createGroupOptions_"});
        }
        if (iOrdinal == 3) {
            return new CreateGroupRequest();
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
        synchronized (CreateGroupRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public CreateGroupOptions getCreateGroupOptions() {
        CreateGroupOptions createGroupOptions = this.createGroupOptions_;
        return createGroupOptions == null ? CreateGroupOptions.getDefaultInstance() : createGroupOptions;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public String getMemberUsername(int i) {
        return (String) this.memberUsername_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public gva getMemberUsernameBytes(int i) {
        return gva.m45888f((String) this.memberUsername_.get(i));
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public int getMemberUsernameCount() {
        return this.memberUsername_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public List<String> getMemberUsernameList() {
        return this.memberUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public gva getNameBytes() {
        return gva.m45888f(this.name_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public boolean hasCreateGroupOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.CreateGroupRequestOrBuilder
    public boolean hasName() {
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

    public static Builder newBuilder(CreateGroupRequest createGroupRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(createGroupRequest);
    }

    public static CreateGroupRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (CreateGroupRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static CreateGroupRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (CreateGroupRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static CreateGroupRequest parseFrom(gva gvaVar) {
        return (CreateGroupRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static CreateGroupRequest parseFrom(gva gvaVar, aux auxVar) {
        return (CreateGroupRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static CreateGroupRequest parseFrom(byte[] bArr) {
        return (CreateGroupRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CreateGroupRequest parseFrom(byte[] bArr, aux auxVar) {
        return (CreateGroupRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static CreateGroupRequest parseFrom(InputStream inputStream) {
        return (CreateGroupRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreateGroupRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (CreateGroupRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static CreateGroupRequest parseFrom(owe oweVar) {
        return (CreateGroupRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static CreateGroupRequest parseFrom(owe oweVar, aux auxVar) {
        return (CreateGroupRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
