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
public final class HierarchyRequest extends AbstractC0269h implements HierarchyRequestOrBuilder {
    public static final int ADD_MEMBERS_FIELD_NUMBER = 7;
    public static final int CREATE_NEW_FIELD_NUMBER = 8;
    private static final HierarchyRequest DEFAULT_INSTANCE;
    public static final int DELETE_CHANNEL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PARTICIPATION_STATUS_FIELD_NUMBER = 4;
    public static final int REMOVE_MEMBER_FIELD_NUMBER = 6;
    public static final int RENAME_GROUP_FIELD_NUMBER = 10;
    public static final int USER_ROLE_FIELD_NUMBER = 5;
    private int chrCase_ = 0;
    private Object chr_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.HierarchyRequest$1 */
    public static /* synthetic */ class C03881 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3210xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3210xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3210xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3210xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3210xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3210xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3210xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3210xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements HierarchyRequestOrBuilder {
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

        public Builder clearAddMembers() {
            copyOnWrite();
            ((HierarchyRequest) this.instance).clearAddMembers();
            return this;
        }

        public Builder clearChr() {
            copyOnWrite();
            ((HierarchyRequest) this.instance).clearChr();
            return this;
        }

        public Builder clearCreateNew() {
            copyOnWrite();
            ((HierarchyRequest) this.instance).clearCreateNew();
            return this;
        }

        public Builder clearDeleteChannel() {
            copyOnWrite();
            ((HierarchyRequest) this.instance).clearDeleteChannel();
            return this;
        }

        public Builder clearParticipationStatus() {
            copyOnWrite();
            ((HierarchyRequest) this.instance).clearParticipationStatus();
            return this;
        }

        public Builder clearRemoveMember() {
            copyOnWrite();
            ((HierarchyRequest) this.instance).clearRemoveMember();
            return this;
        }

        public Builder clearRenameGroup() {
            copyOnWrite();
            ((HierarchyRequest) this.instance).clearRenameGroup();
            return this;
        }

        public Builder clearUserRole() {
            copyOnWrite();
            ((HierarchyRequest) this.instance).clearUserRole();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public AddMembers getAddMembers() {
            return ((HierarchyRequest) this.instance).getAddMembers();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public ChrCase getChrCase() {
            return ((HierarchyRequest) this.instance).getChrCase();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public CreateNew getCreateNew() {
            return ((HierarchyRequest) this.instance).getCreateNew();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public DeleteChannel getDeleteChannel() {
            return ((HierarchyRequest) this.instance).getDeleteChannel();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public SetParticipationStatus getParticipationStatus() {
            return ((HierarchyRequest) this.instance).getParticipationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public RemoveMember getRemoveMember() {
            return ((HierarchyRequest) this.instance).getRemoveMember();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public RenameGroup getRenameGroup() {
            return ((HierarchyRequest) this.instance).getRenameGroup();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public SetUserRole getUserRole() {
            return ((HierarchyRequest) this.instance).getUserRole();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasAddMembers() {
            return ((HierarchyRequest) this.instance).hasAddMembers();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasCreateNew() {
            return ((HierarchyRequest) this.instance).hasCreateNew();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasDeleteChannel() {
            return ((HierarchyRequest) this.instance).hasDeleteChannel();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasParticipationStatus() {
            return ((HierarchyRequest) this.instance).hasParticipationStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasRemoveMember() {
            return ((HierarchyRequest) this.instance).hasRemoveMember();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasRenameGroup() {
            return ((HierarchyRequest) this.instance).hasRenameGroup();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
        public boolean hasUserRole() {
            return ((HierarchyRequest) this.instance).hasUserRole();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeAddMembers(AddMembers addMembers) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).mergeAddMembers(addMembers);
            return this;
        }

        public Builder mergeCreateNew(CreateNew createNew) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).mergeCreateNew(createNew);
            return this;
        }

        public Builder mergeDeleteChannel(DeleteChannel deleteChannel) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).mergeDeleteChannel(deleteChannel);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeParticipationStatus(SetParticipationStatus setParticipationStatus) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).mergeParticipationStatus(setParticipationStatus);
            return this;
        }

        public Builder mergeRemoveMember(RemoveMember removeMember) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).mergeRemoveMember(removeMember);
            return this;
        }

        public Builder mergeRenameGroup(RenameGroup renameGroup) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).mergeRenameGroup(renameGroup);
            return this;
        }

        public Builder mergeUserRole(SetUserRole setUserRole) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).mergeUserRole(setUserRole);
            return this;
        }

        public Builder setAddMembers(AddMembers addMembers) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setAddMembers(addMembers);
            return this;
        }

        public Builder setCreateNew(CreateNew createNew) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setCreateNew(createNew);
            return this;
        }

        public Builder setDeleteChannel(DeleteChannel deleteChannel) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setDeleteChannel(deleteChannel);
            return this;
        }

        public Builder setParticipationStatus(SetParticipationStatus setParticipationStatus) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setParticipationStatus(setParticipationStatus);
            return this;
        }

        public Builder setRemoveMember(RemoveMember removeMember) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setRemoveMember(removeMember);
            return this;
        }

        public Builder setRenameGroup(RenameGroup renameGroup) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setRenameGroup(renameGroup);
            return this;
        }

        public Builder setUserRole(SetUserRole setUserRole) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setUserRole(setUserRole);
            return this;
        }

        private Builder() {
            super(HierarchyRequest.DEFAULT_INSTANCE);
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

        public Builder setAddMembers(AddMembers.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setAddMembers((AddMembers) builder.build());
            return this;
        }

        public Builder setCreateNew(CreateNew.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setCreateNew((CreateNew) builder.build());
            return this;
        }

        public Builder setDeleteChannel(DeleteChannel.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setDeleteChannel((DeleteChannel) builder.build());
            return this;
        }

        public Builder setParticipationStatus(SetParticipationStatus.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setParticipationStatus((SetParticipationStatus) builder.build());
            return this;
        }

        public Builder setRemoveMember(RemoveMember.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setRemoveMember((RemoveMember) builder.build());
            return this;
        }

        public Builder setRenameGroup(RenameGroup.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setRenameGroup((RenameGroup) builder.build());
            return this;
        }

        public Builder setUserRole(SetUserRole.Builder builder) {
            copyOnWrite();
            ((HierarchyRequest) this.instance).setUserRole((SetUserRole) builder.build());
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

    public enum ChrCase {
        DELETE_CHANNEL(3),
        PARTICIPATION_STATUS(4),
        USER_ROLE(5),
        REMOVE_MEMBER(6),
        ADD_MEMBERS(7),
        CREATE_NEW(8),
        RENAME_GROUP(10),
        CHR_NOT_SET(0);

        private final int value;

        ChrCase(int i) {
            this.value = i;
        }

        public static ChrCase forNumber(int i) {
            if (i == 0) {
                return CHR_NOT_SET;
            }
            if (i == 10) {
                return RENAME_GROUP;
            }
            switch (i) {
                case 3:
                    return DELETE_CHANNEL;
                case 4:
                    return PARTICIPATION_STATUS;
                case 5:
                    return USER_ROLE;
                case 6:
                    return REMOVE_MEMBER;
                case 7:
                    return ADD_MEMBERS;
                case 8:
                    return CREATE_NEW;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ChrCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        HierarchyRequest hierarchyRequest = new HierarchyRequest();
        DEFAULT_INSTANCE = hierarchyRequest;
        AbstractC0269h.registerDefaultInstance(HierarchyRequest.class, hierarchyRequest);
    }

    private HierarchyRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddMembers() {
        if (this.chrCase_ == 7) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChr() {
        this.chrCase_ = 0;
        this.chr_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateNew() {
        if (this.chrCase_ == 8) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleteChannel() {
        if (this.chrCase_ == 3) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParticipationStatus() {
        if (this.chrCase_ == 4) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveMember() {
        if (this.chrCase_ == 6) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRenameGroup() {
        if (this.chrCase_ == 10) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserRole() {
        if (this.chrCase_ == 5) {
            this.chrCase_ = 0;
            this.chr_ = null;
        }
    }

    public static HierarchyRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddMembers(AddMembers addMembers) {
        addMembers.getClass();
        if (this.chrCase_ != 7 || this.chr_ == AddMembers.getDefaultInstance()) {
            this.chr_ = addMembers;
        } else {
            this.chr_ = ((AddMembers.Builder) AddMembers.newBuilder((AddMembers) this.chr_).mergeFrom((AbstractC0269h) addMembers)).buildPartial();
        }
        this.chrCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreateNew(CreateNew createNew) {
        createNew.getClass();
        if (this.chrCase_ != 8 || this.chr_ == CreateNew.getDefaultInstance()) {
            this.chr_ = createNew;
        } else {
            this.chr_ = ((CreateNew.Builder) CreateNew.newBuilder((CreateNew) this.chr_).mergeFrom((AbstractC0269h) createNew)).buildPartial();
        }
        this.chrCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeleteChannel(DeleteChannel deleteChannel) {
        deleteChannel.getClass();
        if (this.chrCase_ != 3 || this.chr_ == DeleteChannel.getDefaultInstance()) {
            this.chr_ = deleteChannel;
        } else {
            this.chr_ = ((DeleteChannel.Builder) DeleteChannel.newBuilder((DeleteChannel) this.chr_).mergeFrom((AbstractC0269h) deleteChannel)).buildPartial();
        }
        this.chrCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParticipationStatus(SetParticipationStatus setParticipationStatus) {
        setParticipationStatus.getClass();
        if (this.chrCase_ != 4 || this.chr_ == SetParticipationStatus.getDefaultInstance()) {
            this.chr_ = setParticipationStatus;
        } else {
            this.chr_ = ((SetParticipationStatus.Builder) SetParticipationStatus.newBuilder((SetParticipationStatus) this.chr_).mergeFrom((AbstractC0269h) setParticipationStatus)).buildPartial();
        }
        this.chrCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoveMember(RemoveMember removeMember) {
        removeMember.getClass();
        if (this.chrCase_ != 6 || this.chr_ == RemoveMember.getDefaultInstance()) {
            this.chr_ = removeMember;
        } else {
            this.chr_ = ((RemoveMember.Builder) RemoveMember.newBuilder((RemoveMember) this.chr_).mergeFrom((AbstractC0269h) removeMember)).buildPartial();
        }
        this.chrCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRenameGroup(RenameGroup renameGroup) {
        renameGroup.getClass();
        if (this.chrCase_ != 10 || this.chr_ == RenameGroup.getDefaultInstance()) {
            this.chr_ = renameGroup;
        } else {
            this.chr_ = ((RenameGroup.Builder) RenameGroup.newBuilder((RenameGroup) this.chr_).mergeFrom((AbstractC0269h) renameGroup)).buildPartial();
        }
        this.chrCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserRole(SetUserRole setUserRole) {
        setUserRole.getClass();
        if (this.chrCase_ != 5 || this.chr_ == SetUserRole.getDefaultInstance()) {
            this.chr_ = setUserRole;
        } else {
            this.chr_ = ((SetUserRole.Builder) SetUserRole.newBuilder((SetUserRole) this.chr_).mergeFrom((AbstractC0269h) setUserRole)).buildPartial();
        }
        this.chrCase_ = 5;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static HierarchyRequest parseDelimitedFrom(InputStream inputStream) {
        return (HierarchyRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyRequest parseFrom(ByteBuffer byteBuffer) {
        return (HierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddMembers(AddMembers addMembers) {
        addMembers.getClass();
        this.chr_ = addMembers;
        this.chrCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateNew(CreateNew createNew) {
        createNew.getClass();
        this.chr_ = createNew;
        this.chrCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteChannel(DeleteChannel deleteChannel) {
        deleteChannel.getClass();
        this.chr_ = deleteChannel;
        this.chrCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParticipationStatus(SetParticipationStatus setParticipationStatus) {
        setParticipationStatus.getClass();
        this.chr_ = setParticipationStatus;
        this.chrCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveMember(RemoveMember removeMember) {
        removeMember.getClass();
        this.chr_ = removeMember;
        this.chrCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenameGroup(RenameGroup renameGroup) {
        renameGroup.getClass();
        this.chr_ = renameGroup;
        this.chrCase_ = 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserRole(SetUserRole setUserRole) {
        setUserRole.getClass();
        this.chr_ = setUserRole;
        this.chrCase_ = 5;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0003\n\u0007\u0000\u0000\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\n<\u0000", new Object[]{"chr_", "chrCase_", DeleteChannel.class, SetParticipationStatus.class, SetUserRole.class, RemoveMember.class, AddMembers.class, CreateNew.class, RenameGroup.class});
        }
        if (iOrdinal == 3) {
            return new HierarchyRequest();
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
        synchronized (HierarchyRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public AddMembers getAddMembers() {
        return this.chrCase_ == 7 ? (AddMembers) this.chr_ : AddMembers.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public ChrCase getChrCase() {
        return ChrCase.forNumber(this.chrCase_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public CreateNew getCreateNew() {
        return this.chrCase_ == 8 ? (CreateNew) this.chr_ : CreateNew.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public DeleteChannel getDeleteChannel() {
        return this.chrCase_ == 3 ? (DeleteChannel) this.chr_ : DeleteChannel.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public SetParticipationStatus getParticipationStatus() {
        return this.chrCase_ == 4 ? (SetParticipationStatus) this.chr_ : SetParticipationStatus.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public RemoveMember getRemoveMember() {
        return this.chrCase_ == 6 ? (RemoveMember) this.chr_ : RemoveMember.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public RenameGroup getRenameGroup() {
        return this.chrCase_ == 10 ? (RenameGroup) this.chr_ : RenameGroup.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public SetUserRole getUserRole() {
        return this.chrCase_ == 5 ? (SetUserRole) this.chr_ : SetUserRole.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasAddMembers() {
        return this.chrCase_ == 7;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasCreateNew() {
        return this.chrCase_ == 8;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasDeleteChannel() {
        return this.chrCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasParticipationStatus() {
        return this.chrCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasRemoveMember() {
        return this.chrCase_ == 6;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasRenameGroup() {
        return this.chrCase_ == 10;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.HierarchyRequestOrBuilder
    public boolean hasUserRole() {
        return this.chrCase_ == 5;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(HierarchyRequest hierarchyRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(hierarchyRequest);
    }

    public static HierarchyRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (HierarchyRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static HierarchyRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (HierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static HierarchyRequest parseFrom(gva gvaVar) {
        return (HierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static HierarchyRequest parseFrom(gva gvaVar, aux auxVar) {
        return (HierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static HierarchyRequest parseFrom(byte[] bArr) {
        return (HierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HierarchyRequest parseFrom(byte[] bArr, aux auxVar) {
        return (HierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static HierarchyRequest parseFrom(InputStream inputStream) {
        return (HierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HierarchyRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (HierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static HierarchyRequest parseFrom(owe oweVar) {
        return (HierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static HierarchyRequest parseFrom(owe oweVar, aux auxVar) {
        return (HierarchyRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
