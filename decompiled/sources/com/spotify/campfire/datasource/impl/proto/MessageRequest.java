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
public final class MessageRequest extends AbstractC0269h implements MessageRequestOrBuilder {
    public static final int ADD_ACTIVITY_FIELD_NUMBER = 4;
    public static final int ADD_CONTRIBUTION_FIELD_NUMBER = 1;
    public static final int ADD_CONTRIBUTION_FOR_GROUP_FIELD_NUMBER = 6;
    private static final MessageRequest DEFAULT_INSTANCE;
    public static final int DELETE_ACTIVITY_FIELD_NUMBER = 5;
    public static final int DELETE_CONTRIBUTION_FIELD_NUMBER = 3;
    public static final int MODIFY_CONTRIBUTION_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int cmrCase_ = 0;
    private Object cmr_;

    /* JADX INFO: renamed from: com.spotify.campfire.datasource.impl.proto.MessageRequest$1 */
    public static /* synthetic */ class C04091 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f3225xa1df5c61;

        static {
            int[] iArr = new int[z110.values().length];
            f3225xa1df5c61 = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3225xa1df5c61[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3225xa1df5c61[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3225xa1df5c61[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3225xa1df5c61[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3225xa1df5c61[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3225xa1df5c61[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends AbstractC0268g implements MessageRequestOrBuilder {
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

        public Builder clearAddActivity() {
            copyOnWrite();
            ((MessageRequest) this.instance).clearAddActivity();
            return this;
        }

        public Builder clearAddContribution() {
            copyOnWrite();
            ((MessageRequest) this.instance).clearAddContribution();
            return this;
        }

        public Builder clearAddContributionForGroup() {
            copyOnWrite();
            ((MessageRequest) this.instance).clearAddContributionForGroup();
            return this;
        }

        public Builder clearCmr() {
            copyOnWrite();
            ((MessageRequest) this.instance).clearCmr();
            return this;
        }

        public Builder clearDeleteActivity() {
            copyOnWrite();
            ((MessageRequest) this.instance).clearDeleteActivity();
            return this;
        }

        public Builder clearDeleteContribution() {
            copyOnWrite();
            ((MessageRequest) this.instance).clearDeleteContribution();
            return this;
        }

        public Builder clearModifyContribution() {
            copyOnWrite();
            ((MessageRequest) this.instance).clearModifyContribution();
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g
        /* JADX INFO: renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo98328clone() {
            return super.mo98326clone();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public AddActivity getAddActivity() {
            return ((MessageRequest) this.instance).getAddActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public AddContribution getAddContribution() {
            return ((MessageRequest) this.instance).getAddContribution();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public AddContributionForGroup getAddContributionForGroup() {
            return ((MessageRequest) this.instance).getAddContributionForGroup();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public CmrCase getCmrCase() {
            return ((MessageRequest) this.instance).getCmrCase();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.sre0
        public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public DeleteActivity getDeleteActivity() {
            return ((MessageRequest) this.instance).getDeleteActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public DeleteContribution getDeleteContribution() {
            return ((MessageRequest) this.instance).getDeleteContribution();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public ModifyContribution getModifyContribution() {
            return ((MessageRequest) this.instance).getModifyContribution();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public boolean hasAddActivity() {
            return ((MessageRequest) this.instance).hasAddActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public boolean hasAddContribution() {
            return ((MessageRequest) this.instance).hasAddContribution();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public boolean hasAddContributionForGroup() {
            return ((MessageRequest) this.instance).hasAddContributionForGroup();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public boolean hasDeleteActivity() {
            return ((MessageRequest) this.instance).hasDeleteActivity();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public boolean hasDeleteContribution() {
            return ((MessageRequest) this.instance).hasDeleteContribution();
        }

        @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
        public boolean hasModifyContribution() {
            return ((MessageRequest) this.instance).hasModifyContribution();
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8
        public /* bridge */ /* synthetic */ AbstractC2081l8 internalMergeFrom(AbstractC2118m8 abstractC2118m8) {
            return super.internalMergeFrom((AbstractC0269h) abstractC2118m8);
        }

        public Builder mergeAddActivity(AddActivity addActivity) {
            copyOnWrite();
            ((MessageRequest) this.instance).mergeAddActivity(addActivity);
            return this;
        }

        public Builder mergeAddContribution(AddContribution addContribution) {
            copyOnWrite();
            ((MessageRequest) this.instance).mergeAddContribution(addContribution);
            return this;
        }

        public Builder mergeAddContributionForGroup(AddContributionForGroup addContributionForGroup) {
            copyOnWrite();
            ((MessageRequest) this.instance).mergeAddContributionForGroup(addContributionForGroup);
            return this;
        }

        public Builder mergeDeleteActivity(DeleteActivity deleteActivity) {
            copyOnWrite();
            ((MessageRequest) this.instance).mergeDeleteActivity(deleteActivity);
            return this;
        }

        public Builder mergeDeleteContribution(DeleteContribution deleteContribution) {
            copyOnWrite();
            ((MessageRequest) this.instance).mergeDeleteContribution(deleteContribution);
            return this;
        }

        @Override // com.google.protobuf.AbstractC0268g, p204p.AbstractC2081l8, p204p.ore0
        public /* bridge */ /* synthetic */ AbstractC2081l8 mergeFrom(owe oweVar, aux auxVar) {
            return super.mergeFrom(oweVar, auxVar);
        }

        public Builder mergeModifyContribution(ModifyContribution modifyContribution) {
            copyOnWrite();
            ((MessageRequest) this.instance).mergeModifyContribution(modifyContribution);
            return this;
        }

        public Builder setAddActivity(AddActivity addActivity) {
            copyOnWrite();
            ((MessageRequest) this.instance).setAddActivity(addActivity);
            return this;
        }

        public Builder setAddContribution(AddContribution addContribution) {
            copyOnWrite();
            ((MessageRequest) this.instance).setAddContribution(addContribution);
            return this;
        }

        public Builder setAddContributionForGroup(AddContributionForGroup addContributionForGroup) {
            copyOnWrite();
            ((MessageRequest) this.instance).setAddContributionForGroup(addContributionForGroup);
            return this;
        }

        public Builder setDeleteActivity(DeleteActivity deleteActivity) {
            copyOnWrite();
            ((MessageRequest) this.instance).setDeleteActivity(deleteActivity);
            return this;
        }

        public Builder setDeleteContribution(DeleteContribution deleteContribution) {
            copyOnWrite();
            ((MessageRequest) this.instance).setDeleteContribution(deleteContribution);
            return this;
        }

        public Builder setModifyContribution(ModifyContribution modifyContribution) {
            copyOnWrite();
            ((MessageRequest) this.instance).setModifyContribution(modifyContribution);
            return this;
        }

        private Builder() {
            super(MessageRequest.DEFAULT_INSTANCE);
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

        public Builder setAddActivity(AddActivity.Builder builder) {
            copyOnWrite();
            ((MessageRequest) this.instance).setAddActivity((AddActivity) builder.build());
            return this;
        }

        public Builder setAddContribution(AddContribution.Builder builder) {
            copyOnWrite();
            ((MessageRequest) this.instance).setAddContribution((AddContribution) builder.build());
            return this;
        }

        public Builder setAddContributionForGroup(AddContributionForGroup.Builder builder) {
            copyOnWrite();
            ((MessageRequest) this.instance).setAddContributionForGroup((AddContributionForGroup) builder.build());
            return this;
        }

        public Builder setDeleteActivity(DeleteActivity.Builder builder) {
            copyOnWrite();
            ((MessageRequest) this.instance).setDeleteActivity((DeleteActivity) builder.build());
            return this;
        }

        public Builder setDeleteContribution(DeleteContribution.Builder builder) {
            copyOnWrite();
            ((MessageRequest) this.instance).setDeleteContribution((DeleteContribution) builder.build());
            return this;
        }

        public Builder setModifyContribution(ModifyContribution.Builder builder) {
            copyOnWrite();
            ((MessageRequest) this.instance).setModifyContribution((ModifyContribution) builder.build());
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

    public enum CmrCase {
        ADD_CONTRIBUTION(1),
        MODIFY_CONTRIBUTION(2),
        DELETE_CONTRIBUTION(3),
        ADD_ACTIVITY(4),
        DELETE_ACTIVITY(5),
        ADD_CONTRIBUTION_FOR_GROUP(6),
        CMR_NOT_SET(0);

        private final int value;

        CmrCase(int i) {
            this.value = i;
        }

        public static CmrCase forNumber(int i) {
            switch (i) {
                case 0:
                    return CMR_NOT_SET;
                case 1:
                    return ADD_CONTRIBUTION;
                case 2:
                    return MODIFY_CONTRIBUTION;
                case 3:
                    return DELETE_CONTRIBUTION;
                case 4:
                    return ADD_ACTIVITY;
                case 5:
                    return DELETE_ACTIVITY;
                case 6:
                    return ADD_CONTRIBUTION_FOR_GROUP;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CmrCase valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        MessageRequest messageRequest = new MessageRequest();
        DEFAULT_INSTANCE = messageRequest;
        AbstractC0269h.registerDefaultInstance(MessageRequest.class, messageRequest);
    }

    private MessageRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddActivity() {
        if (this.cmrCase_ == 4) {
            this.cmrCase_ = 0;
            this.cmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddContribution() {
        if (this.cmrCase_ == 1) {
            this.cmrCase_ = 0;
            this.cmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddContributionForGroup() {
        if (this.cmrCase_ == 6) {
            this.cmrCase_ = 0;
            this.cmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmr() {
        this.cmrCase_ = 0;
        this.cmr_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleteActivity() {
        if (this.cmrCase_ == 5) {
            this.cmrCase_ = 0;
            this.cmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleteContribution() {
        if (this.cmrCase_ == 3) {
            this.cmrCase_ = 0;
            this.cmr_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModifyContribution() {
        if (this.cmrCase_ == 2) {
            this.cmrCase_ = 0;
            this.cmr_ = null;
        }
    }

    public static MessageRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddActivity(AddActivity addActivity) {
        addActivity.getClass();
        if (this.cmrCase_ != 4 || this.cmr_ == AddActivity.getDefaultInstance()) {
            this.cmr_ = addActivity;
        } else {
            this.cmr_ = ((AddActivity.Builder) AddActivity.newBuilder((AddActivity) this.cmr_).mergeFrom((AbstractC0269h) addActivity)).buildPartial();
        }
        this.cmrCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddContribution(AddContribution addContribution) {
        addContribution.getClass();
        if (this.cmrCase_ != 1 || this.cmr_ == AddContribution.getDefaultInstance()) {
            this.cmr_ = addContribution;
        } else {
            this.cmr_ = ((AddContribution.Builder) AddContribution.newBuilder((AddContribution) this.cmr_).mergeFrom((AbstractC0269h) addContribution)).buildPartial();
        }
        this.cmrCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddContributionForGroup(AddContributionForGroup addContributionForGroup) {
        addContributionForGroup.getClass();
        if (this.cmrCase_ != 6 || this.cmr_ == AddContributionForGroup.getDefaultInstance()) {
            this.cmr_ = addContributionForGroup;
        } else {
            this.cmr_ = ((AddContributionForGroup.Builder) AddContributionForGroup.newBuilder((AddContributionForGroup) this.cmr_).mergeFrom((AbstractC0269h) addContributionForGroup)).buildPartial();
        }
        this.cmrCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeleteActivity(DeleteActivity deleteActivity) {
        deleteActivity.getClass();
        if (this.cmrCase_ != 5 || this.cmr_ == DeleteActivity.getDefaultInstance()) {
            this.cmr_ = deleteActivity;
        } else {
            this.cmr_ = ((DeleteActivity.Builder) DeleteActivity.newBuilder((DeleteActivity) this.cmr_).mergeFrom((AbstractC0269h) deleteActivity)).buildPartial();
        }
        this.cmrCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDeleteContribution(DeleteContribution deleteContribution) {
        deleteContribution.getClass();
        if (this.cmrCase_ != 3 || this.cmr_ == DeleteContribution.getDefaultInstance()) {
            this.cmr_ = deleteContribution;
        } else {
            this.cmr_ = ((DeleteContribution.Builder) DeleteContribution.newBuilder((DeleteContribution) this.cmr_).mergeFrom((AbstractC0269h) deleteContribution)).buildPartial();
        }
        this.cmrCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeModifyContribution(ModifyContribution modifyContribution) {
        modifyContribution.getClass();
        if (this.cmrCase_ != 2 || this.cmr_ == ModifyContribution.getDefaultInstance()) {
            this.cmr_ = modifyContribution;
        } else {
            this.cmr_ = ((ModifyContribution.Builder) ModifyContribution.newBuilder((ModifyContribution) this.cmr_).mergeFrom((AbstractC0269h) modifyContribution)).buildPartial();
        }
        this.cmrCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MessageRequest parseDelimitedFrom(InputStream inputStream) {
        return (MessageRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessageRequest parseFrom(ByteBuffer byteBuffer) {
        return (MessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddActivity(AddActivity addActivity) {
        addActivity.getClass();
        this.cmr_ = addActivity;
        this.cmrCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddContribution(AddContribution addContribution) {
        addContribution.getClass();
        this.cmr_ = addContribution;
        this.cmrCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddContributionForGroup(AddContributionForGroup addContributionForGroup) {
        addContributionForGroup.getClass();
        this.cmr_ = addContributionForGroup;
        this.cmrCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteActivity(DeleteActivity deleteActivity) {
        deleteActivity.getClass();
        this.cmr_ = deleteActivity;
        this.cmrCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteContribution(DeleteContribution deleteContribution) {
        deleteContribution.getClass();
        this.cmr_ = deleteContribution;
        this.cmrCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModifyContribution(ModifyContribution modifyContribution) {
        modifyContribution.getClass();
        this.cmr_ = modifyContribution;
        this.cmrCase_ = 2;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"cmr_", "cmrCase_", AddContribution.class, ModifyContribution.class, DeleteContribution.class, AddActivity.class, DeleteActivity.class, AddContributionForGroup.class});
        }
        if (iOrdinal == 3) {
            return new MessageRequest();
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
        synchronized (MessageRequest.class) {
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

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public AddActivity getAddActivity() {
        return this.cmrCase_ == 4 ? (AddActivity) this.cmr_ : AddActivity.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public AddContribution getAddContribution() {
        return this.cmrCase_ == 1 ? (AddContribution) this.cmr_ : AddContribution.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public AddContributionForGroup getAddContributionForGroup() {
        return this.cmrCase_ == 6 ? (AddContributionForGroup) this.cmr_ : AddContributionForGroup.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public CmrCase getCmrCase() {
        return CmrCase.forNumber(this.cmrCase_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public DeleteActivity getDeleteActivity() {
        return this.cmrCase_ == 5 ? (DeleteActivity) this.cmr_ : DeleteActivity.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public DeleteContribution getDeleteContribution() {
        return this.cmrCase_ == 3 ? (DeleteContribution) this.cmr_ : DeleteContribution.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public ModifyContribution getModifyContribution() {
        return this.cmrCase_ == 2 ? (ModifyContribution) this.cmr_ : ModifyContribution.getDefaultInstance();
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public boolean hasAddActivity() {
        return this.cmrCase_ == 4;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public boolean hasAddContribution() {
        return this.cmrCase_ == 1;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public boolean hasAddContributionForGroup() {
        return this.cmrCase_ == 6;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public boolean hasDeleteActivity() {
        return this.cmrCase_ == 5;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public boolean hasDeleteContribution() {
        return this.cmrCase_ == 3;
    }

    @Override // com.spotify.campfire.datasource.impl.proto.MessageRequestOrBuilder
    public boolean hasModifyContribution() {
        return this.cmrCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    public static Builder newBuilder(MessageRequest messageRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(messageRequest);
    }

    public static MessageRequest parseDelimitedFrom(InputStream inputStream, aux auxVar) {
        return (MessageRequest) AbstractC0269h.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static MessageRequest parseFrom(ByteBuffer byteBuffer, aux auxVar) {
        return (MessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, byteBuffer, auxVar);
    }

    public static MessageRequest parseFrom(gva gvaVar) {
        return (MessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    public static MessageRequest parseFrom(gva gvaVar, aux auxVar) {
        return (MessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar, auxVar);
    }

    public static MessageRequest parseFrom(byte[] bArr) {
        return (MessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessageRequest parseFrom(byte[] bArr, aux auxVar) {
        return (MessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr, auxVar);
    }

    public static MessageRequest parseFrom(InputStream inputStream) {
        return (MessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessageRequest parseFrom(InputStream inputStream, aux auxVar) {
        return (MessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, inputStream, auxVar);
    }

    public static MessageRequest parseFrom(owe oweVar) {
        return (MessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar);
    }

    public static MessageRequest parseFrom(owe oweVar, aux auxVar) {
        return (MessageRequest) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, oweVar, auxVar);
    }
}
