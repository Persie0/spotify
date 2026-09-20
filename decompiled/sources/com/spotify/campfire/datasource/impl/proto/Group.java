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

/* JADX INFO: loaded from: classes5.dex */
public final class Group extends AbstractC0269h implements GroupOrBuilder {
    private static final Group DEFAULT_INSTANCE;
    public static final int GROUP_MEMBER_FIELD_NUMBER = 2;
    public static final int INVITE_TOKEN_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String name_ = "";
    private ae50 groupMember_ = AbstractC0269h.emptyProtobufList();
    private ae50 inviteToken_ = AbstractC0269h.emptyProtobufList();

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.Group$1 */
    public static /* synthetic */ class C03771 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3201xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3201xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3201xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3201xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3201xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3201xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3201xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3201xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GroupOrBuilder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAllGroupMember(Iterable<? extends GroupMember> iterable) {
            copyOnWrite();
            ((Group) this.instance).addAllGroupMember(iterable);
            return this;
        }

        public Builder addAllInviteToken(Iterable<? extends InviteToken> iterable) {
            copyOnWrite();
            ((Group) this.instance).addAllInviteToken(iterable);
            return this;
        }

        public Builder addGroupMember(GroupMember groupMember) {
            copyOnWrite();
            ((Group) this.instance).addGroupMember(groupMember);
            return this;
        }

        public Builder addInviteToken(InviteToken inviteToken) {
            copyOnWrite();
            ((Group) this.instance).addInviteToken(inviteToken);
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

        public Builder clearGroupMember() {
            copyOnWrite();
            ((Group) this.instance).clearGroupMember();
            return this;
        }

        public Builder clearInviteToken() {
            copyOnWrite();
            ((Group) this.instance).clearInviteToken();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Group) this.instance).clearName();
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

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public GroupMember getGroupMember(int i) {
            return ((Group) this.instance).getGroupMember(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public int getGroupMemberCount() {
            return ((Group) this.instance).getGroupMemberCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public List<GroupMember> getGroupMemberList() {
            return Collections.unmodifiableList(((Group) this.instance).getGroupMemberList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public InviteToken getInviteToken(int i) {
            return ((Group) this.instance).getInviteToken(i);
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public int getInviteTokenCount() {
            return ((Group) this.instance).getInviteTokenCount();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public List<InviteToken> getInviteTokenList() {
            return Collections.unmodifiableList(((Group) this.instance).getInviteTokenList());
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public String getName() {
            return ((Group) this.instance).getName();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public gva getNameBytes() {
            return ((Group) this.instance).getNameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
        public boolean hasName() {
            return ((Group) this.instance).hasName();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder removeGroupMember(int i) {
            copyOnWrite();
            ((Group) this.instance).removeGroupMember(i);
            return this;
        }

        public Builder removeInviteToken(int i) {
            copyOnWrite();
            ((Group) this.instance).removeInviteToken(i);
            return this;
        }

        public Builder setGroupMember(int i, GroupMember groupMember) {
            copyOnWrite();
            ((Group) this.instance).setGroupMember(i, groupMember);
            return this;
        }

        public Builder setInviteToken(int i, InviteToken inviteToken) {
            copyOnWrite();
            ((Group) this.instance).setInviteToken(i, inviteToken);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((Group) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(gva gvaVar) {
            copyOnWrite();
            ((Group) this.instance).setNameBytes(gvaVar);
            return this;
        }

        private Builder() {
            super(Group.DEFAULT_INSTANCE);
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

        public Builder addGroupMember(int i, GroupMember groupMember) {
            copyOnWrite();
            ((Group) this.instance).addGroupMember(i, groupMember);
            return this;
        }

        public Builder addInviteToken(int i, InviteToken inviteToken) {
            copyOnWrite();
            ((Group) this.instance).addInviteToken(i, inviteToken);
            return this;
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

        public Builder setGroupMember(int i, GroupMember.Builder builder) {
            copyOnWrite();
            ((Group) this.instance).setGroupMember(i, (GroupMember) builder.build());
            return this;
        }

        public Builder setInviteToken(int i, InviteToken.Builder builder) {
            copyOnWrite();
            ((Group) this.instance).setInviteToken(i, (InviteToken) builder.build());
            return this;
        }

        @Override // p204p.AbstractC2081l8
        /* JADX INFO: renamed from: mergeFrom */
        public /* bridge */ /* synthetic */ ore0 mo98371mergeFrom(InputStream inputStream) {
            return super.mo98371mergeFrom(inputStream);
        }

        public Builder addGroupMember(GroupMember.Builder builder) {
            copyOnWrite();
            ((Group) this.instance).addGroupMember((GroupMember) builder.build());
            return this;
        }

        public Builder addInviteToken(InviteToken.Builder builder) {
            copyOnWrite();
            ((Group) this.instance).addInviteToken((InviteToken) builder.build());
            return this;
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

        public Builder addGroupMember(int i, GroupMember.Builder builder) {
            copyOnWrite();
            ((Group) this.instance).addGroupMember(i, (GroupMember) builder.build());
            return this;
        }

        public Builder addInviteToken(int i, InviteToken.Builder builder) {
            copyOnWrite();
            ((Group) this.instance).addInviteToken(i, (InviteToken) builder.build());
            return this;
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
        Group group = new Group();
        DEFAULT_INSTANCE = group;
        AbstractC0269h.registerDefaultInstance(Group.class, group);
    }

    private Group() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGroupMember(Iterable<? extends GroupMember> iterable) {
        ensureGroupMemberIsMutable();
        AbstractC2118m8.addAll(iterable, this.groupMember_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInviteToken(Iterable<? extends InviteToken> iterable) {
        ensureInviteTokenIsMutable();
        AbstractC2118m8.addAll(iterable, this.inviteToken_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroupMember(GroupMember groupMember) {
        groupMember.getClass();
        ensureGroupMemberIsMutable();
        this.groupMember_.add(groupMember);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInviteToken(InviteToken inviteToken) {
        inviteToken.getClass();
        ensureInviteTokenIsMutable();
        this.inviteToken_.add(inviteToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupMember() {
        this.groupMember_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInviteToken() {
        this.inviteToken_ = AbstractC0269h.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    private void ensureGroupMemberIsMutable() {
        ae50 ae50Var = this.groupMember_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.groupMember_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    private void ensureInviteTokenIsMutable() {
        ae50 ae50Var = this.inviteToken_;
        if (((AbstractC1733c9) ae50Var).f35342a) {
            return;
        }
        this.inviteToken_ = AbstractC0269h.mutableCopy(ae50Var);
    }

    public static Group getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Group parseDelimitedFrom(InputStream inputStream) {
        return (Group) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Group parseFrom(ByteBuffer byteBuffer) {
        return (Group) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGroupMember(int i) {
        ensureGroupMemberIsMutable();
        this.groupMember_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeInviteToken(int i) {
        ensureInviteTokenIsMutable();
        this.inviteToken_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupMember(int i, GroupMember groupMember) {
        groupMember.getClass();
        ensureGroupMemberIsMutable();
        this.groupMember_.set(i, groupMember);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInviteToken(int i, InviteToken inviteToken) {
        inviteToken.getClass();
        ensureInviteTokenIsMutable();
        this.inviteToken_.set(i, inviteToken);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ለ\u0000\u0002\u001b\u0003\u001b", new Object[]{"bitField0_", "name_", "groupMember_", GroupMember.class, "inviteToken_", InviteToken.class});
        }
        if (iOrdinal == 3) {
            return new Group();
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
        synchronized (Group.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public GroupMember getGroupMember(int i) {
        return (GroupMember) this.groupMember_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public int getGroupMemberCount() {
        return this.groupMember_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public List<GroupMember> getGroupMemberList() {
        return this.groupMember_;
    }

    public GroupMemberOrBuilder getGroupMemberOrBuilder(int i) {
        return (GroupMemberOrBuilder) this.groupMember_.get(i);
    }

    public List<? extends GroupMemberOrBuilder> getGroupMemberOrBuilderList() {
        return this.groupMember_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public InviteToken getInviteToken(int i) {
        return (InviteToken) this.inviteToken_.get(i);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public int getInviteTokenCount() {
        return this.inviteToken_.size();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public List<InviteToken> getInviteTokenList() {
        return this.inviteToken_;
    }

    public InviteTokenOrBuilder getInviteTokenOrBuilder(int i) {
        return (InviteTokenOrBuilder) this.inviteToken_.get(i);
    }

    public List<? extends InviteTokenOrBuilder> getInviteTokenOrBuilderList() {
        return this.inviteToken_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
    public gva getNameBytes() {
        return gva.m45888f(this.name_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupOrBuilder
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

    public static Builder newBuilder(Group group) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(group);
    }

    public static Group parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (Group) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Group parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (Group) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static Group parseFrom(gva gvaVar) {
        return (Group) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGroupMember(int i, GroupMember groupMember) {
        groupMember.getClass();
        ensureGroupMemberIsMutable();
        this.groupMember_.add(i, groupMember);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInviteToken(int i, InviteToken inviteToken) {
        inviteToken.getClass();
        ensureInviteTokenIsMutable();
        this.inviteToken_.add(i, inviteToken);
    }

    public static Group parseFrom(gva gvaVar, aux auxVar) {
        return (Group) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static Group parseFrom(byte[] bArr) {
        return (Group) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Group parseFrom(byte[] bArr, aux auxVar) {
        return (Group) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static Group parseFrom(InputStream inputStream) {
        return (Group) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Group parseFrom(InputStream inputStream, aux auxVar) {
        return (Group) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static Group parseFrom(owe oweVar) {
        return (Group) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static Group parseFrom(owe oweVar, aux auxVar) {
        return (Group) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
