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
public final class GroupMember extends AbstractC0269h implements GroupMemberOrBuilder {
    private static final GroupMember DEFAULT_INSTANCE;
    public static final int GROUP_MEMBER_STATUS_FIELD_NUMBER = 2;
    public static final int INVITED_BY_USERNAME_FIELD_NUMBER = 4;
    public static final int MEMBER_USERNAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int USER_ROLE_FIELD_NUMBER = 3;
    private int groupMemberStatus_;
    private int userRole_;
    private String memberUsername_ = "";
    private String invitedByUsername_ = "";

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.GroupMember$1 */
    public static /* synthetic */ class C03791 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3203xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3203xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3203xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3203xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3203xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3203xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3203xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3203xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements GroupMemberOrBuilder {
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

        public Builder clearGroupMemberStatus() {
            copyOnWrite();
            ((GroupMember) this.instance).clearGroupMemberStatus();
            return this;
        }

        public Builder clearInvitedByUsername() {
            copyOnWrite();
            ((GroupMember) this.instance).clearInvitedByUsername();
            return this;
        }

        public Builder clearMemberUsername() {
            copyOnWrite();
            ((GroupMember) this.instance).clearMemberUsername();
            return this;
        }

        public Builder clearUserRole() {
            copyOnWrite();
            ((GroupMember) this.instance).clearUserRole();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98327clone() {
            return super.mo98326clone();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
        public GroupMemberStatus getGroupMemberStatus() {
            return ((GroupMember) this.instance).getGroupMemberStatus();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
        public int getGroupMemberStatusValue() {
            return ((GroupMember) this.instance).getGroupMemberStatusValue();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
        public String getInvitedByUsername() {
            return ((GroupMember) this.instance).getInvitedByUsername();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
        public gva getInvitedByUsernameBytes() {
            return ((GroupMember) this.instance).getInvitedByUsernameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
        public String getMemberUsername() {
            return ((GroupMember) this.instance).getMemberUsername();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
        public gva getMemberUsernameBytes() {
            return ((GroupMember) this.instance).getMemberUsernameBytes();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
        public HierarchyUserRole getUserRole() {
            return ((GroupMember) this.instance).getUserRole();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
        public int getUserRoleValue() {
            return ((GroupMember) this.instance).getUserRoleValue();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder setGroupMemberStatus(GroupMemberStatus groupMemberStatus) {
            copyOnWrite();
            ((GroupMember) this.instance).setGroupMemberStatus(groupMemberStatus);
            return this;
        }

        public Builder setGroupMemberStatusValue(int i) {
            copyOnWrite();
            ((GroupMember) this.instance).setGroupMemberStatusValue(i);
            return this;
        }

        public Builder setInvitedByUsername(String str) {
            copyOnWrite();
            ((GroupMember) this.instance).setInvitedByUsername(str);
            return this;
        }

        public Builder setInvitedByUsernameBytes(gva gvaVar) {
            copyOnWrite();
            ((GroupMember) this.instance).setInvitedByUsernameBytes(gvaVar);
            return this;
        }

        public Builder setMemberUsername(String str) {
            copyOnWrite();
            ((GroupMember) this.instance).setMemberUsername(str);
            return this;
        }

        public Builder setMemberUsernameBytes(gva gvaVar) {
            copyOnWrite();
            ((GroupMember) this.instance).setMemberUsernameBytes(gvaVar);
            return this;
        }

        public Builder setUserRole(HierarchyUserRole hierarchyUserRole) {
            copyOnWrite();
            ((GroupMember) this.instance).setUserRole(hierarchyUserRole);
            return this;
        }

        public Builder setUserRoleValue(int i) {
            copyOnWrite();
            ((GroupMember) this.instance).setUserRoleValue(i);
            return this;
        }

        private Builder() {
            super(GroupMember.DEFAULT_INSTANCE);
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
        GroupMember groupMember = new GroupMember();
        DEFAULT_INSTANCE = groupMember;
        AbstractC0269h.registerDefaultInstance(GroupMember.class, groupMember);
    }

    private GroupMember() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupMemberStatus() {
        this.groupMemberStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInvitedByUsername() {
        this.invitedByUsername_ = getDefaultInstance().getInvitedByUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemberUsername() {
        this.memberUsername_ = getDefaultInstance().getMemberUsername();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserRole() {
        this.userRole_ = 0;
    }

    public static GroupMember getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static GroupMember parseDelimitedFrom(InputStream inputStream) {
        return (GroupMember) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GroupMember parseFrom(ByteBuffer byteBuffer) {
        return (GroupMember) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupMemberStatus(GroupMemberStatus groupMemberStatus) {
        this.groupMemberStatus_ = groupMemberStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupMemberStatusValue(int i) {
        this.groupMemberStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInvitedByUsername(String str) {
        str.getClass();
        this.invitedByUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInvitedByUsernameBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.invitedByUsername_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberUsername(String str) {
        str.getClass();
        this.memberUsername_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemberUsernameBytes(gva gvaVar) {
        AbstractC2118m8.checkByteStringIsUtf8(gvaVar);
        this.memberUsername_ = gvaVar.m45892u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserRole(HierarchyUserRole hierarchyUserRole) {
        this.userRole_ = hierarchyUserRole.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserRoleValue(int i) {
        this.userRole_ = i;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004Ȉ", new Object[]{"memberUsername_", "groupMemberStatus_", "userRole_", "invitedByUsername_"});
        }
        if (iOrdinal == 3) {
            return new GroupMember();
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
        synchronized (GroupMember.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
    public GroupMemberStatus getGroupMemberStatus() {
        GroupMemberStatus groupMemberStatusForNumber = GroupMemberStatus.forNumber(this.groupMemberStatus_);
        return groupMemberStatusForNumber == null ? GroupMemberStatus.UNRECOGNIZED : groupMemberStatusForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
    public int getGroupMemberStatusValue() {
        return this.groupMemberStatus_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
    public String getInvitedByUsername() {
        return this.invitedByUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
    public gva getInvitedByUsernameBytes() {
        return gva.m45888f(this.invitedByUsername_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
    public String getMemberUsername() {
        return this.memberUsername_;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
    public gva getMemberUsernameBytes() {
        return gva.m45888f(this.memberUsername_);
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
    public HierarchyUserRole getUserRole() {
        HierarchyUserRole hierarchyUserRoleForNumber = HierarchyUserRole.forNumber(this.userRole_);
        return hierarchyUserRoleForNumber == null ? HierarchyUserRole.UNRECOGNIZED : hierarchyUserRoleForNumber;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.GroupMemberOrBuilder
    public int getUserRoleValue() {
        return this.userRole_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(GroupMember groupMember) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(groupMember);
    }

    public static GroupMember parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (GroupMember) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GroupMember parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (GroupMember) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static GroupMember parseFrom(gva gvaVar) {
        return (GroupMember) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static GroupMember parseFrom(gva gvaVar, aux auxVar) {
        return (GroupMember) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static GroupMember parseFrom(byte[] bArr) {
        return (GroupMember) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GroupMember parseFrom(byte[] bArr, aux auxVar) {
        return (GroupMember) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static GroupMember parseFrom(InputStream inputStream) {
        return (GroupMember) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GroupMember parseFrom(InputStream inputStream, aux auxVar) {
        return (GroupMember) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static GroupMember parseFrom(owe oweVar) {
        return (GroupMember) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static GroupMember parseFrom(owe oweVar, aux auxVar) {
        return (GroupMember) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
